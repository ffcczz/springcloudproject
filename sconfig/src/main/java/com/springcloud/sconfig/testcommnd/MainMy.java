package com.springcloud.sconfig.testcommnd;

import lombok.Data;

@Data
public class MainMy {

    public void main(String[] args) {
        System.out.println("oksss");

    }
    public static void main(){

    }
    /**
    *名称定义
    */
    private String name="mynaem";

    /**
    用户姓名
    **/
    private Integer age;

    /**
    邮编
    **/
    private Integer code;

    /**
     * 用户
     **/
    private Integer pos;

    /**
    是否有效用户
    */
    private Boolean isExist;

    /**
     * 我的名称
     */
    private String myname = "";

    public String getNames() {
        if (myname != null) {
        }
        if (isExist) {

        }

        return null;
    }

    public void m() {
        try {
            getNames();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
