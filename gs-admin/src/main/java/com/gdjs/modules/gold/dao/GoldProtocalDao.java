/*
 * 项目名称:gs-plus
 * 类名称:GoldProtocalDao.java
 * 包名称:com.gdjs.modules.gold.dao
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-11-01 09:33:12        wuyongguo     初版做成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.gold.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gdjs.modules.gold.entity.GoldProtocalEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 服务金协议配置表Dao
 *
 * @author wuyongguo
 * @date 2019-11-01 09:33:12
 */
@Mapper
public interface GoldProtocalDao extends BaseMapper<GoldProtocalEntity> {

    /**
     * 查询所有列表
     *
     * @param params 查询参数
     * @return List
     */
    List<GoldProtocalEntity> queryAll(@Param("params") Map<String, Object> params);

    /**
     * 自定义分页查询
     *
     * @param page   分页参数
     * @param params 查询参数
     * @return List
     */
    List<GoldProtocalEntity> selectGoldProtocalPage(IPage page, @Param("params") Map<String, Object> params);
}
