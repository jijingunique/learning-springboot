package com.test.springboot_datasource.service.impl;

import com.test.springboot_datasource.config.TargetDataSource;
import com.test.springboot_datasource.dao.domain.UserLongin;
import com.test.springboot_datasource.dao.mapper.DataSourceMapper;
import com.test.springboot_datasource.service.DataSourceService;
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
    public List<UserLongin> selectById(Long id) {
        List<UserLongin> list = dataSourceMapper.selectById(id);
        return list;
    }

    @Override
    @TargetDataSource(name = "ds1")
    public List<UserLongin> selectAllDs1() {
        List<UserLongin> list = dataSourceMapper.selectAllDs1();
        return list;
    }

    @Override
    @TargetDataSource(name = "ds2")
    public List<UserLongin> selectAllDs2() {
        List<UserLongin> list = dataSourceMapper.selectAllDs2();
        return list;
    }
}
