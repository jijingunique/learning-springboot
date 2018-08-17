package com.test.springboot.datasource.controller;

import com.test.springboot.datasource.dao.domain.UserLogin;
import com.test.springboot.datasource.service.DataSourceService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author jing.ji
 * @Date 2018-08-13
 */
@RestController
public class DataSourceController {

    private Logger logger = Logger.getLogger(DataSourceController.class);

    @Autowired
    private DataSourceService dataSourceService;

    @GetMapping("/default/{id}")
    public List<UserLogin> useDefaultDataSource(@PathVariable("id") Long id) {
        logger.info("使用默认数据源");
        List<UserLogin> list = dataSourceService.selectById(id);
        return list;
    }

    @GetMapping("/ds1")
    public List<UserLogin> useDS1DataSource() {
        logger.info("使用ds1数据源");
        List<UserLogin> list = dataSourceService.selectAllDs1();
        return list;
    }

    @GetMapping("/ds2")
    public List<UserLogin> useDS2DataSource() {
        logger.info("使用ds2数据源");
        StringBuilder stringBuilder = new StringBuilder();
        List<UserLogin> list = dataSourceService.selectAllDs2();
        return list;
    }
}
