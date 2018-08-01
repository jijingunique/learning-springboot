package com.hello.world.demo.repository;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author jing.ji
 * @date 2018/7/31
 */
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByProudctName(String proudctName);

    Product findByProudctNameAndType(String proudctName, Integer type);

    @Query("from Product p where p.proudctName=:proudctName")
    Product findProduct(@Param("proudctName") String proudctName);

    Product save(Product product);
}
