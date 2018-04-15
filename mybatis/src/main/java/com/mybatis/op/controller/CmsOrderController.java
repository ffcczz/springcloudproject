package com.mybatis.op.controller;

import com.mybatis.op.model.CmsOrder;
import com.mybatis.op.service.CmsOrderService;
import com.mybatis.op.vo.CmsOrderVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cms/")
@Slf4j
public class CmsOrderController {

    @Autowired
    CmsOrderService cmsOrderService;

    @PostMapping("save")
    public CmsOrderVo saveCmsOrder(@RequestBody  CmsOrderVo cmsOrderVo) {
        cmsOrderService.saveCmsOrder(cmsOrderVo);
        log.info("-=====write cmsorder info ========");
        return  cmsOrderVo;
    }

    /**
     * 批量掺入
     * @param cmsOrderVo
     * @return
     */
    @PostMapping("batch")
    public boolean saveBatch(@RequestBody  List<CmsOrderVo> cmsOrderVo){
        //cmsOrderService.saveCmsOrderBatch(cmsOrderVo);
        System.out.println(cmsOrderVo.size());
        cmsOrderService.saveCmsOrderBatch(cmsOrderVo);
        return true;
    }

    @GetMapping("orderno/{orderno}")
    public  List<CmsOrder> getCmsOrderListByOrerNo(@PathVariable(name = "orderno")  String orderNo){
        return cmsOrderService.getListByOrderNo(orderNo);
    }

    @GetMapping("all/{id}")
    public List<CmsOrder> getAllById(@PathVariable  String id){
        return cmsOrderService.getCmsAllByById(id);
    }
}

