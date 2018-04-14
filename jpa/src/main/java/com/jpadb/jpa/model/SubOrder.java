package com.jpadb.jpa.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "CmsSubOrder")
public class SubOrder {
    /**
    id
    **/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    /**
    *productid
    */
    @Column
    private String productId;

    /**
    *cmsorder id
    */
    @Column
    private String orderId;

    /**
    *createdate
    */
    @Column
    private String createDate;


}
