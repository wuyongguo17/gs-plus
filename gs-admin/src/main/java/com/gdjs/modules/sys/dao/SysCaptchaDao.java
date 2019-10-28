/*
 * 项目名称:gdjs-plus
 * 类名称:SysCaptchaDao.java
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
import com.gdjs.modules.sys.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @author GDJS
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
