package com.mybatis.op.dao;

import com.mybatis.op.model.CmsOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CmsOrderMapper {

    /**
     * 批量插入
     * @param list
     */
    void insertBatch(List<CmsOrder> list);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsOrder record);

    int insertSelective(CmsOrder record);

    CmsOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsOrder record);

    int updateByPrimaryKey(CmsOrder record);

    List<CmsOrder> getCmsOrderListByOrderNo(String orderNo);

    List<CmsOrder> getCmsOrderAllById(String id);
}