/*
 * 项目名称:gdjs-plus
 * 类名称:SysRoleMenuDao.java
 * 包名称:com.gdjs.modules.sys.dao
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gdjs.modules.sys.entity.SysRoleMenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色与菜单对应关系
 *
 * @author GDJS
 */
@Mapper
public interface SysRoleMenuDao extends BaseMapper<SysRoleMenuEntity> {

    /**
     * 根据角色ID，获取菜单ID列表
     *
     * @param roleId 角色Id
     * @return List
     */
    List<String> queryMenuIdList(String roleId);

    /**
     * 根据角色ID数组，批量删除
     *
     * @param roleIds 角色Ids
     * @return int
     */
    int deleteBatch(String[] roleIds);
}
