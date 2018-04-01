package com.springcloud.sconfig.testcommnd.lombok;

import lombok.*;

@Data
@Builder
public class User {
    /**
     *
     */
    private String name = "";
    /**
    
    **/
    @Setter
    @NonNull
    private Integer age=13;

    /**
     *
     */
    private String mybook;

    /**
     * 用户地址信息
     */
    private String address;


    /**
    是否毕业
    */
    private Boolean isok;
    
    /**
    *bug2
    */
    private String bug2;

    /**
    *bug2分支修改了bug20
    */
    private String bug20;

    /**
     * bug2 修改了一个bug21
     */
    private String bug21;

    /**
     * bug22
     */
    private String bug22;



    
    

}
