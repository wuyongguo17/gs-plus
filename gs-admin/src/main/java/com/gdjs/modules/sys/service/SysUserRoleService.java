/*
 * 项目名称:gdjs-plus
 * 类名称:SysUserRoleService.java
 * 包名称:com.gdjs.modules.sys.service
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gdjs.modules.sys.entity.SysUserRoleEntity;

import java.util.List;

/**
 * 用户与角色对应关系
 *
 * @author GDJS
 */
public interface SysUserRoleService extends IService<SysUserRoleEntity> {

    /**
     * saveOrUpdate
     *
     * @param userId     用户Id
     * @param roleIdList roleIdList
     */
    void saveOrUpdate(String userId, List<String> roleIdList);

    /**
     * 根据用户ID，获取角色ID列表
     *
     * @param userId 用户Id
     * @return List
     */
    List<String> queryRoleIdList(String userId);

    /**
     * 根据角色ID数组，批量删除
     *
     * @param roleIds roleIds
     * @return int
     */
    int deleteBatch(String[] roleIds);
}
