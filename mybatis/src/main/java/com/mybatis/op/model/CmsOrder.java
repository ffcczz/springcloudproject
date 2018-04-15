package com.mybatis.op.model;

import com.mybatis.op.typehandler.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CmsOrder {
    private Integer id;

    private String orderNo;

    private String userAddress;

    private String userName;

    private String userPhone;

    private Status status;

    private List<CmsSubOrder> cmsSubOrderList;


}