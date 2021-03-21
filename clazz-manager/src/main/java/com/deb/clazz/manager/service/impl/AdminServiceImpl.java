package com.deb.clazz.manager.service.impl;

import com.deb.clazz.common.entity.Admin;
import com.deb.clazz.manager.mapper.AdminMapper;
import com.deb.clazz.manager.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author Deb
 * @Date 2021/3/20 13:24
 * @ProjectName clazz
 **/
@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminMapper adminMapper;

    @Override
    public void create(Admin admin) {
       adminMapper.create(admin);
    }

}
