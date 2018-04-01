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
    *bug14
    */
    private String bug14;


}
