/*
 * 项目名称:gdjs-plus
 * 类名称:SysMailLogServiceImpl.java
 * 包名称:com.gdjs.modules.sys.service.impl
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-03-21 16:46:32        GDJS     初版做成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.sys.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gdjs.common.utils.Query;
import com.gdjs.modules.sys.dao.SysMailLogDao;
import com.gdjs.modules.sys.entity.SysMailLogEntity;
import com.gdjs.modules.sys.service.SysMailLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Map;

/**
 * 邮件发送日志Service实现类
 *
 * @author GDJS
 * @date 2019-03-21 16:46:32
 */
@Service("sysMailLogService")
public class SysMailLogServiceImpl extends ServiceImpl<SysMailLogDao, SysMailLogEntity> implements SysMailLogService {

    @Override
    public Page queryPage(Map<String, Object> params) {
        //排序
        params.put("sidx", "T.SEND_DATE");
        params.put("asc", false);
        Page<SysMailLogEntity> page = new Query<SysMailLogEntity>(params).getPage();
        return page.setRecords(baseMapper.selectSysMailLogPage(page, params));
    }

    @Override
    public boolean add(SysMailLogEntity sysMailLog) {
        return this.save(sysMailLog);
    }

    @Override
    public boolean delete(String id) {
        return this.removeById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean deleteBatch(String[] ids) {
        return this.removeByIds(Arrays.asList(ids));
    }
}
