package com.mybatis.demo.entity;

import java.io.Serializable;

/**
 * <br>实体类</br>
 *
 * @author fattyca1
 */
public class Pet implements Serializable {

    private Integer id;

    private String name;

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
}
