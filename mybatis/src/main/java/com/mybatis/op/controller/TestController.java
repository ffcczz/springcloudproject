package com.mybatis.op.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("test/")
public class TestController {

    @GetMapping("list")
    public void printTest() {
        System.out.println("my2222na   me999sy777so999u499988uuu");
        System.out.println("mxx1mm=999 ");
        System.out.println("xxxx");
          for (int i = 0; i < 100; i++) {
        System.out.println(i);
        }
    }
}
