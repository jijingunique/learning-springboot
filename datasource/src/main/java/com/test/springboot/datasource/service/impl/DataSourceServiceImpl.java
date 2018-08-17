package com.test.springboot.datasource.service.impl;

import com.test.springboot.datasource.config.TargetDataSource;
import com.test.springboot.datasource.dao.domain.UserLogin;
import com.test.springboot.datasource.dao.mapper.DataSourceMapper;
import com.test.springboot.datasource.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author jing.ji
 * @Date 2018-08-13
 */
@Service
public class DataSourceServiceImpl implements DataSourceService {

    @Autowired
    private DataSourceMapper dataSourceMapper;

    @Override
    public List<UserLogin> selectById(Long id) {
        List<UserLogin> list = dataSourceMapper.selectById(id);
        return list;
    }

    @Override
    @TargetDataSource(name = "ds1")
    public List<UserLogin> selectAllDs1() {
        List<UserLogin> list = dataSourceMapper.selectAllDs1();
        return list;
    }

    @Override
    @TargetDataSource(name = "ds2")
    public List<UserLogin> selectAllDs2() {
        List<UserLogin> list = dataSourceMapper.selectAllDs2();
        return list;
    }
}
