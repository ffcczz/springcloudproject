package com.mybatis.op.dao;

import com.mybatis.op.model.cmsOrderCategory;

public interface cmsOrderCategoryMapper {
    int insert(cmsOrderCategory record);

    int insertSelective(cmsOrderCategory record);
}