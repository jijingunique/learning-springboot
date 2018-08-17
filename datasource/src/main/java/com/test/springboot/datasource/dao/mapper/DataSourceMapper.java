package com.test.springboot.datasource.dao.mapper;

import com.test.springboot.datasource.dao.domain.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *  * @Author jing.ji
 * @Date 2018-08-13
 */
@Mapper
public interface DataSourceMapper {
    @ResultMap(value = "BaseResultMap")
    @Select("SELECT * FROM user_login WHERE  id = #{id}")
    List<UserLogin> selectById(Long id);

    @ResultMap(value = "BaseResultMap")
    @Select("SELECT * FROM user_login")
    List<UserLogin> selectAllDs1();

    @ResultMap(value = "BaseResultMap")
    @Select("SELECT * FROM user_login")
    List<UserLogin> selectAllDs2();
}
