package com.hello.world.demo.service;

import com.hello.world.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author jing.ji
 * @date 2018/7/31
 */
@Service
public class ProductServiceImpl implements  ProductService {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void deleteProduct(Integer productId) {
        jdbcTemplate.update("DELETE  FROM  product WHERE productId= ?" ,productId);
    }

    @Override
    public void addProduct(Product product) {
        jdbcTemplate.update("INSERT INTO product(proudctName,type,productNum) VALUE ( ?, ?, ?)",product.getProudctName(),product.getType(),product.getProductNum());
    }

    @Override
    public Product getProduct(Integer productId) {
        Product product = jdbcTemplate.queryForObject("select * from product where productId= ?", new Integer[]{productId}, new ProductMapper());
        return product;
    }
    class  ProductMapper implements  RowMapper<Product>{

        public Product mapRow(ResultSet rs, int i) throws SQLException {
            Product product = new Product();
            product.setProductId(rs.getInt("productId"));
            product.setProductNum(rs.getInt("productNum"));
            product.setProudctName(rs.getString("productNum"));
            product.setType(rs.getInt("type"));

            return product;
        }
    }
}
