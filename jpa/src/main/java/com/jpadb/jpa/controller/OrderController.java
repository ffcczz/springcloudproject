package com.jpadb.jpa.controller;

import com.jpadb.jpa.dao.CategoryDao;
import com.jpadb.jpa.dao.CategoryPredicate;
import com.jpadb.jpa.dao.OrderDao;
import com.jpadb.jpa.event.EventPoJo;
import com.jpadb.jpa.event.EventPublish;
import com.jpadb.jpa.event.OrderCreateEvent;
import com.jpadb.jpa.eventobj.EventPojoCmsOrder;
import com.jpadb.jpa.model.Category;
import com.jpadb.jpa.model.CmsOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    OrderDao orderDao;
    @Autowired
    CategoryDao categoryDao;

    @Autowired
    private EventPublish eventPublish;

    @GetMapping("getorder/{id}/aagg")
    public void getOrderById(@PathVariable String id){
        log.info(" query orderid is is my first xxx:" + id);
        CmsOrder order = orderDao.findCmsOrderById(Integer.valueOf(id));
        order.getSubOrderList().forEach((e)->{
            System.out.println(e.getProductId());
        });
        order.getCategoryList().forEach((e) ->{
            System.out.println(e.getCataCode() + e.getCataName());
        });

        log.info("===开始发布事件=====");
        EventPoJo eventPoJo = new EventPojoCmsOrder(order,"创建订单事件对象");
        eventPublish.publishEvent(new OrderCreateEvent(this,eventPoJo));
        log.info("===事件发布结束=====");

        CmsOrder order2 =  orderDao.findCmsOrderByIdAndUserAddressLike(1,"%四%");
        log.info("order2:"+order2.getUserAddress());
        orderDao.save(this.createCmsOrder());
        log.info("=================================");
       CategoryPredicate cat =  new CategoryPredicate("Name","Code");
       List<Category> categoryList =  categoryDao.findAll(cat);
       categoryList.forEach(category -> {
           log.info("code:"+category.getCataCode()+",name:"+category.getCataName());
       });
    }

    private CmsOrder createCmsOrder(){

        CmsOrder order = new CmsOrder();
        order.setOrderNo("P30001");
        order.setUserName("李四");
        order.setUserAddress("四河地铁站");
        order.setUserPhone("110");

        List<Category> categoryList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Category c1 = new Category();
            c1.setCataCode("Code"+i);
            c1.setCataName("Name"+i);
            categoryList.add(c1);
        }
        categoryDao.saveAll(categoryList);
        order.setCategoryList(categoryList);

        return order;

    }
}
