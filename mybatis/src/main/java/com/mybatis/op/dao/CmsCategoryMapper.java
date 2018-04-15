package com.mybatis.op.dao;

import com.mybatis.op.model.CmsCategory;

public interface CmsCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmsCategory record);

    int insertSelective(CmsCategory record);

    CmsCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsCategory record);

    int updateByPrimaryKey(CmsCategory record);
}