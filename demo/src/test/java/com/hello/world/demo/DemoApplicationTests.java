package com.hello.world.demo;

import com.hello.world.demo.entity.Product;
import com.hello.world.demo.mapper.User;
import com.hello.world.demo.mapper.UserMapper;
import com.hello.world.demo.repository.ProductRepository;
import com.hello.world.demo.service.ProductService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserMapper userMapper;

    @Test
	public void contextLoads() {
	}

    @Test
    public void testJdbc() throws Exception {
        Product product = new Product();
       for (int i= 0 ; i<5 ; i++) {
           product.setType(i);
           product.setProudctName(i+"");
           product.setProductNum(i);
           productService.addProduct(product);
       }
    }

    @Before
    public void before() {
        com.hello.world.demo.repository.Product product = new com.hello.world.demo.repository.Product();
        product.setType(10);
        product.setProudctName("jpaPP");
        productRepository.save(product);
    }

    @Test
    public void testJpa() throws Exception {
        com.hello.world.demo.repository.Product product = new com.hello.world.demo.repository.Product();
        product.setType(10);
        product.setProudctName("jpaP");
        productRepository.save(product);
    }

    @Test
    public void testCache() throws Exception {
        com.hello.world.demo.repository.Product product =  productRepository.findByProudctName("jpaP");
        Assert.assertNotNull(product);
        System.out.println("第一次查询：");


        product =  productRepository.findByProudctName("jpaP");
        Assert.assertNotNull(product);

        System.out.println("第二次查询：" );

    }


    @Test
    @Rollback
    public void findByName() throws Exception {
        userMapper.insert("AAA", 20);
        User u = userMapper.findByUserName("AAA");
        Assert.assertEquals(20, u.getAge().intValue());
    }
}
