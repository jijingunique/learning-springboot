package com.testspringboot_shiro_redis.service;

import java.util.Set;

public interface SysRoleService {
    Set<String> findRoleNameByUserId(int userId);
}
