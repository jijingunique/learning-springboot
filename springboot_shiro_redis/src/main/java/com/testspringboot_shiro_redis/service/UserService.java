package com.testspringboot_shiro_redis.service;

import com.testspringboot_shiro_redis.dao.domain.SysUser;

import java.util.Set;

public interface UserService {
    /***
     * 获取用户
     *
     * @param user
     * @return
     */
    SysUser getUser(SysUser user);

    /**
     * 获取用户权限
     *
     * @param userId userId
     * @return 用户权限
     */
    Set<String> findPermissionsByUserId(int userId);
}
