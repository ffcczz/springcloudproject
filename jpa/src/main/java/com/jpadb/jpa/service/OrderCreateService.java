package com.jpadb.jpa.service;

import com.jpadb.jpa.dao.CategoryDao;
import com.jpadb.jpa.dao.trans.AfterTransactionOpt;
import com.jpadb.jpa.model.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class OrderCreateService {
    @Autowired
    CategoryDao categoryDao;
    @Autowired
    AfterTransactionOpt afterTransactionOpt;
    
    @Transactional
   public  void  saveCategory() throws Exception {
       List<Category> categoryList = new ArrayList<>();
       for (int i = 0; i < 5; i++) {
           Category c1 = new Category();
           c1.setCataCode("Code"+i);
           c1.setCataName("Name"+i);
           categoryList.add(c1);
       }
       categoryDao.saveAll(categoryList);

        afterTransactionOpt.execute(new Runnable() {
            @Override
            public void run() {
                log.info("--after 开始执行后置操作5s....");
                try {
                    Thread.sleep(5*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
   }
}
