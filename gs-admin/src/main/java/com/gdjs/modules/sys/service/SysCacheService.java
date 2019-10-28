/*
 * 项目名称:gdjs-plus
 * 类名称:SysCacheService.java
 * 包名称:com.gdjs.modules.sys.service
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.sys.service;

import com.gdjs.modules.sys.entity.SysCacheEntity;

import java.util.List;
import java.util.Map;

/**
 * redis缓存信息
 *
 * @author GDJS
 */
public interface SysCacheService {

    /**
     * 查询缓存
     *
     * @param params 查询参数
     * @return List
     */
    List<SysCacheEntity> queryAll(Map<String, String> params);

    /**
     * 删除缓存
     *
     * @param keys keys
     * @return int
     */
    int deleteBatch(String[] keys);
}
