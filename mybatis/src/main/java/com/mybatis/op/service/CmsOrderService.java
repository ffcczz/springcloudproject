package com.mybatis.op.service;

import com.mybatis.op.dao.CmsCategoryMapper;
import com.mybatis.op.dao.CmsOrderMapper;
import com.mybatis.op.model.CmsOrder;
import com.mybatis.op.vo.CmsOrderVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CmsOrderService {

    @Autowired
    private CmsOrderMapper cmsOrder;

    /**
     * 保存数据信息
     * @param cmsOrderVo
     * @return
     */
    @Transactional
    public boolean saveCmsOrder(CmsOrderVo cmsOrderVo) {
        CmsOrder cms = new CmsOrder();
        BeanUtils.copyProperties(cmsOrderVo,cms);

        long ct = cmsOrder.insert(cms) ;
        cmsOrderVo.setId(cms.getId());
        return ct>0;
    }


    /**
     * 批量插入前台数据
     *
     * @param cmsOrderVo
     */
    @Transactional
    public void saveCmsOrderBatch(List<CmsOrderVo> cmsOrderVo) {
        List<CmsOrder> list = new ArrayList<>();
        if (cmsOrderVo != null) {
            cmsOrderVo.forEach(orderVo->{
                CmsOrder cmsOrder = new CmsOrder();
                BeanUtils.copyProperties(orderVo, cmsOrder);
                list.add(cmsOrder);
            });
        }
        if (list.size() > 0) {
            log.info("insert batch size:"+(list==null?null:list.size()));
            cmsOrder.insertBatch(list);
        }
    }

    public List<CmsOrder> getListByOrderNo(String orderno){
        if (orderno != null) {
           return cmsOrder.getCmsOrderListByOrderNo(orderno);
        }
        return  null;
    }

    public List<CmsOrder> getCmsAllByById(String id) {
        return cmsOrder.getCmsOrderAllById(id);
    }
}
