package com.springcloud.sconfig.testcommnd;


import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static final String name = "111";
    public static final String KEY = "KEY";

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (String string : list) {
            System.out.println(string);
            System.out.printf("%s", "username");
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(i+name);
        }
        MainMy m = new MainMy();

    }
}
