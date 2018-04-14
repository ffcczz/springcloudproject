package com.jpadb.jpa.controller;

import com.jpadb.jpa.service.OrderCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AftertransController {

    @Autowired
    OrderCreateService orderCreateService;



    @GetMapping("atrans")
    public void afterTrans() throws Exception {
        orderCreateService.saveCategory();
    }

}
