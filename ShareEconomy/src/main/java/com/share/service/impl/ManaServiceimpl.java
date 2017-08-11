package com.share.service.impl;

import com.share.mapper.ManagerMapper;
import com.share.pojo.Manager;
import com.share.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by weixin on 17-8-6.
 */
public class ManaServiceimpl implements ManagerService{
    @Autowired
    private ManagerMapper managerMapper;
    @Override
    public Manager Mlogin(Manager manager) {
        return managerMapper.Mlogin(manager);
    }
}
