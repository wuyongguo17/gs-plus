/*
 * 项目名称:gdjs-plus
 * 类名称:SysRoleDao.java
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
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gdjs.modules.sys.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 角色管理
 *
 * @author GDJS
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {

    /**
     * 查询用户权限下的角色列表
     *
     * @param params 查询参数
     * @return List
     */
    List<String> queryRoleIdList(Map<String, Object> params);

    /**
     * 自定义分页查询
     *
     * @param page   分页参数
     * @param params 查询参数
     * @return List
     */
    List<SysRoleEntity> selectSysRolePage(IPage page, @Param("params") Map<String, Object> params);

    /**
     * 根据条件查询（不传page则不分页）
     *
     * @param params 查询参数
     * @return List
     */
    List<SysRoleEntity> selectSysRolePage(@Param("params") Map<String, Object> params);
}
