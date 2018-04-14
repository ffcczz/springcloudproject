package com.mybatis.op;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("test/")
public class TestController {

    @GetMapping("list")
    public void printTest() {
        System.out.println("my2222name999sy777so999u499988uuu");
        System.out.println("mxx1mm= ");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
