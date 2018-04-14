package com.jpadb.jpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="CmsOrder")
@NoArgsConstructor
public class CmsOrder22 implements Serializable{
    /**
    id
    **/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
     /**
    *orderno
    */
    @Column
    private String orderNo;

    /**
    *user phone
    */
    @Column
    private String userPhone;

    /**
    *useraddress
    */
    @Column
    private String userAddress;

    /**
    *usernmae
    */
    @Column
    private String userName;

    /**
     * mappedBy:对应到字表的关联关系字段
     */
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true ,mappedBy = "orderId")
    List<SubOrder> subOrderList;

    /**
     * 中间表
     */
    @ManyToMany
    @JoinTable(name = "cmsOrderCategory",
            joinColumns = {@JoinColumn(name = "order_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id", referencedColumnName = "id")})
    List<Category> categoryList;
}
