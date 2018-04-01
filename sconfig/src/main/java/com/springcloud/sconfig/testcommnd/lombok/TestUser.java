package com.springcloud.sconfig.testcommnd.lombok;

public class TestUser {
    /**
    *myname
    */
    private static String giveName;


    public static void main(String[] args){
      User u = User.builder().build();
      u.setAge(17);
      System.out.println(u.getAge());
        try {
            String lastnmae = "aaalastname";
            main("mm",lastnmae);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String mm, String firstName){
        String ac = firstName +  giveName;
        myGetName(ac,"mynameis ok");
    }

    private static void myGetName(String s, String ac) {
        System.out.println(s+":"+ac);
    }

}
