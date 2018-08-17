package com.test.springboot.datasource.service;



import com.test.springboot.datasource.dao.domain.UserLogin;

import java.util.List;

public interface DataSourceService {
    List<UserLogin> selectById(Long id);

    List<UserLogin> selectAllDs1();

    List<UserLogin> selectAllDs2();
}
