package com.mybatis.op.dao;

import com.mybatis.op.model.CmsOrder;

public interface CmsOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmsOrder record);

    int insertSelective(CmsOrder record);

    CmsOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsOrder record);

    int updateByPrimaryKey(CmsOrder record);
}