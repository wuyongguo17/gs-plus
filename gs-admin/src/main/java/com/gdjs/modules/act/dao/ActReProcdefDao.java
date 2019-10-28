/*
 * 项目名称:gdjs-plus
 * 类名称:ActReProcdefDao.java
 * 包名称:com.gdjs.modules.act.dao
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-03-18 09:47:54        GDJS     初版做成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.act.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gdjs.modules.act.entity.ActReProcdefEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * Dao
 *
 * @author GDJS
 * @date 2019-03-18 09:47:54
 */
@Mapper
public interface ActReProcdefDao extends BaseMapper<ActReProcdefEntity> {

}
