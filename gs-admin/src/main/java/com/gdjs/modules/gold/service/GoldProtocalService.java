/*
 * 项目名称:gs-plus
 * 类名称:GoldProtocalService.java
 * 包名称:com.gdjs.modules.gold.service
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-11-01 09:33:12        wuyongguo     初版做成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.gold.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gdjs.modules.gold.entity.GoldProtocalEntity;

import java.util.List;
import java.util.Map;

/**
 * 服务金协议配置表Service接口
 *
 * @author wuyongguo
 * @date 2019-11-01 09:33:12
 */
public interface GoldProtocalService extends IService<GoldProtocalEntity> {

    /**
     * 查询所有列表
     *
     * @param params 查询参数
     * @return List
     */
    List<GoldProtocalEntity> queryAll(Map<String, Object> params);

    /**
     * 分页查询服务金协议配置表
     *
     * @param params 查询参数
     * @return Page
     */
    Page queryPage(Map<String, Object> params);

    /**
     * 新增服务金协议配置表
     *
     * @param goldProtocal 服务金协议配置表
     * @return 新增结果
     */
    boolean add(GoldProtocalEntity goldProtocal);

    /**
     * 根据主键更新服务金协议配置表
     *
     * @param goldProtocal 服务金协议配置表
     * @return 更新结果
     */
    boolean update(GoldProtocalEntity goldProtocal);

    /**
     * 根据主键删除服务金协议配置表
     *
     * @param protocalId protocalId
     * @return 删除结果
     */
    boolean delete(String protocalId);

    /**
     * 根据主键批量删除
     *
     * @param protocalIds protocalIds
     * @return 删除结果
     */
    boolean deleteBatch(String[] protocalIds);
}
