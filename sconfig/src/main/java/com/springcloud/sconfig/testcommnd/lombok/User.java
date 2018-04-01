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
    *我的国家
    */
    private String mycountiy;


}
