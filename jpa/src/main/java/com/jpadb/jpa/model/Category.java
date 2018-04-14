package com.jpadb.jpa.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "cms_category")
public class Category implements Serializable{
    /**
    id
    **/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    /**
    *cataname
    */
    private String cataName;

    /**
    *catacode
    */
    private String cataCode;


}
