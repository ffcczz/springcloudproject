package com.jpadb.jpa.eventobj;

import com.jpadb.jpa.event.EventPoJo;
import com.jpadb.jpa.model.Category;
import com.jpadb.jpa.model.CmsOrder;
import com.jpadb.jpa.model.SubOrder;
import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 订单事件对象
 */
@Data
public class EventPojoCmsOrder extends EventPoJo {
   private CmsOrder cmsOrder;
   public EventPojoCmsOrder(CmsOrder cmsOrder, String eventName) {
      super(eventName);
      this.cmsOrder = cmsOrder;
   }
}
