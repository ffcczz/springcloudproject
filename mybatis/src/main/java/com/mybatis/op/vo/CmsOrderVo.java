package com.mybatis.op.vo;

import com.mybatis.op.model.CmsOrder;
import com.mybatis.op.model.CmsSubOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 前台展示视图
 */
public class CmsOrderVo extends CmsOrder{

    @Setter
    @Getter
//    List<CmsOrder> list;
    List<CmsSubOrder> subOrderList;

}
