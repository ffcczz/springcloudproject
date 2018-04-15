package com.mybatis.op.model;

public class CmsCategory {
    private Integer id;

    private String cataCode;

    private String cataName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCataCode() {
        return cataCode;
    }

    public void setCataCode(String cataCode) {
        this.cataCode = cataCode == null ? null : cataCode.trim();
    }

    public String getCataName() {
        return cataName;
    }

    public void setCataName(String cataName) {
        this.cataName = cataName == null ? null : cataName.trim();
    }
}