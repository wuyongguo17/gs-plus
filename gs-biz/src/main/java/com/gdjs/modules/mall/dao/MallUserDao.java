/*
 * 项目名称:gdjs-plus
 * 类名称:UserDao.java
 * 包名称:com.gdjs.modules.app.dao
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.mall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gdjs.modules.mall.entity.MallUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 用户
 *
 * @author GDJS
 */
@Mapper
public interface MallUserDao extends BaseMapper<MallUserEntity> {


    /**
     * 查询所有列表
     *
     * @param params 查询参数
     * @return List
     */
    List<MallUserEntity> queryAll(@Param("params") Map<String, Object> params);

    /**
     * 自定义分页查询
     *
     * @param page   分页参数
     * @param params 查询参数
     * @return List
     */
    List<MallUserEntity> selectMallUserPage(IPage page, @Param("params") Map<String, Object> params);
}
