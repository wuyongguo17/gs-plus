/*
 * 项目名称:gdjs-plus
 * 类名称:SysOssDao.java
 * 包名称:com.gdjs.modules.oss.dao
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-01-22 10:20:20        GDJS     初版做成
 *
 * Copyright (c) 2018-2019 GDJS
 */
package com.gdjs.modules.oss.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gdjs.modules.oss.entity.SysOssEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 文件上传Dao
 *
 * @author GDJS
 * @date 2019-01-22 10:20:20
 */
@Mapper
public interface SysOssDao extends BaseMapper<SysOssEntity> {

    /**
     * 自定义分页查询
     *
     * @param page   分页参数
     * @param params 查询参数
     * @return
     */
    List<SysOssEntity> selectSysOssPage(IPage page, @Param("params") Map<String, Object> params);
}
