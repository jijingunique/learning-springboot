package com.hello.world.demo.service;

import com.hello.world.demo.entity.Product;

/**
 * @author jing.ji
 * @date 2018/7/31
 */
public interface ProductService {
    public  void  deleteProduct(Integer productId);

    public  void addProduct(Product product);

    public  Product getProduct(Integer productId);
}
