/*
 * 项目名称:gdjs-plus
 * 类名称:ShiroServiceImpl.java
 * 包名称:com.gdjs.modules.sys.service.impl
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gdjs.common.utils.Constant;
import com.gdjs.modules.sys.dao.SysMenuDao;
import com.gdjs.modules.sys.dao.SysUserDao;
import com.gdjs.modules.sys.dao.SysUserTokenDao;
import com.gdjs.modules.sys.entity.SysMenuEntity;
import com.gdjs.modules.sys.entity.SysUserEntity;
import com.gdjs.modules.sys.entity.SysUserTokenEntity;
import com.gdjs.modules.sys.service.ShiroService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author GDJS
 */
@Service("shiroService")
public class ShiroServiceImpl extends ServiceImpl<SysUserTokenDao, SysUserTokenEntity> implements ShiroService {
    @Autowired
    private SysMenuDao sysMenuDao;
    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public Set<String> getUserPermissions(String userId) {
        List<String> permsList;

        //系统管理员，拥有最高权限
        if (Constant.SUPER_ADMIN.equals(userId)) {
            List<SysMenuEntity> menuList = sysMenuDao.selectList(null);
            permsList = new ArrayList<>(menuList.size());
            for (SysMenuEntity menu : menuList) {
                permsList.add(menu.getPerms());
            }
        } else {
            permsList = sysUserDao.queryAllPerms(userId);
        }
        //用户权限列表
        Set<String> permsSet = new HashSet<>();
        for (String perms : permsList) {
            if (StringUtils.isBlank(perms)) {
                continue;
            }
            permsSet.addAll(Arrays.asList(perms.trim().split(",")));
        }
        return permsSet;
    }

    @Override
    public SysUserTokenEntity queryByToken(String token) {
        return baseMapper.selectOne(new QueryWrapper<SysUserTokenEntity>().eq("TOKEN", token));
    }

    @Override
    public SysUserEntity queryUser(String userId) {
        return sysUserDao.selectById(userId);
    }
}
