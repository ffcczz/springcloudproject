package com.springcloud.sconfig.testcommnd.lombok;

public class TestUser {
    public static void main(String[] args){
      User u = User.builder().build();
      u.setAge(17);
      System.out.println(u.getAge());
    }
}
