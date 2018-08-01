package com.hello.world.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author jing.ji
 * @date 2018/8/1
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user WHERE USERNAME = #{userName}")
    User findByUserName(@Param("userName") String userName);

    @Insert("INSERT INTO user(USERNAME, AGE) VALUES(#{userName}, #{age})")
    int insert(@Param("userName") String userName, @Param("age") Integer age);

}
