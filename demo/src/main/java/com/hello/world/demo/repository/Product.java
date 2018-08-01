package com.hello.world.demo.repository;

import lombok.Data;

import javax.persistence.*;


/**
 * @author jing.ji
 * @date 2018/7/31
 */
@Data
@Entity
@Table(name = "product")
public class Product {
    private  String proudctName;

    private  Integer productId;

    private  Integer type;

    @Column(name = "proudctname")
    public String getProudctName() {
        return proudctName;
    }

    public void setProudctName(String proudctName) {
        this.proudctName = proudctName;
    }

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}
