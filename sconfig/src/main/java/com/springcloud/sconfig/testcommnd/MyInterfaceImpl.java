package com.springcloud.sconfig.testcommnd;

import java.util.ArrayList;
import java.util.List;

public class MyInterfaceImpl implements MyInterface {

    public static final String NAME = "name";

    @Override
    public String getName(String string) {

        for (int i = 0; i < 200; i++) {
            List<String> mylist = new ArrayList<>();

            System.out.println(new StringBuilder().append("mynameis").append("sss").append("ccc").toString());
        }
        return null;
    }
}
