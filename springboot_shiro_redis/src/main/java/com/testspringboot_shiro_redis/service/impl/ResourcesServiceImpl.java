package com.testspringboot_shiro_redis.service.impl;

import com.testspringboot_shiro_redis.service.ResourcesService;
import com.testspringboot_shiro_redis.dao.domain.SysResources;
import com.testspringboot_shiro_redis.dao.mapper.SysResourcesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    @Override
    public List<SysResources> selectAll() {
        List<SysResources> resourcesList = sysResourcesMapper.selectAll();
        return resourcesList;
    }
}
