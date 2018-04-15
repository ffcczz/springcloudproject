package com.mybatis.op.dao;

import com.mybatis.op.model.CmsSubOrder;

public interface CmsSubOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmsSubOrder record);

    int insertSelective(CmsSubOrder record);

    CmsSubOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsSubOrder record);

    int updateByPrimaryKey(CmsSubOrder record);
}