package com.test.springboot_datasource.service;



import com.test.springboot_datasource.dao.domain.UserLongin;

import java.util.List;

public interface DataSourceService {
    List<UserLongin> selectById(Long id);

    List<UserLongin> selectAllDs1();

    List<UserLongin> selectAllDs2();
}
