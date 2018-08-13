package com.test.springboot_datasource.dao.mapper;

import com.test.springboot_datasource.dao.domain.UserLongin;
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
    List<UserLongin> selectById(Long id);

    @ResultMap(value = "BaseResultMap")
    @Select("SELECT * FROM user_login")
    List<UserLongin> selectAllDs1();

    @ResultMap(value = "BaseResultMap")
    @Select("SELECT * FROM user_login")
    List<UserLongin> selectAllDs2();
}
