package com.daydreamdev.secondskill.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author G.Fukang
 * @date 6/7 10:36
 */
@Getter
@Setter
public class Stock {

    private Integer id;

    private String name;

    private Integer count;

    private Integer sale;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
