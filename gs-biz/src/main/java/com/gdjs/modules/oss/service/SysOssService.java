/*
 * 项目名称:gdjs-plus
 * 类名称:SysOssService.java
 * 包名称:com.gdjs.modules.oss.service
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2019/1/17 16:21    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.oss.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gdjs.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author GDJS
 * @date 2019-01-17 16:21:01
 */
public interface SysOssService extends IService<SysOssEntity> {

    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return Page
     */
    Page queryPage(Map<String, Object> params);
}
