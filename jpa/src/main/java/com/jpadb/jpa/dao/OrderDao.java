package com.jpadb.jpa.dao;

import com.jpadb.jpa.model.CmsOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderDao  extends CrudRepository<CmsOrder, Integer> {


    /**
     * 根据订单id查询信息
     * @param id
     * @return
     */
    public CmsOrder findCmsOrderById(Integer id);

    public CmsOrder findCmsOrderByIdAndUserAddressLike(Integer id,String address);
}
