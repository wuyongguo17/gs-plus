/*
 * 项目名称:gs-plus
 * 类名称:GoldProtocalServiceImpl.java
 * 包名称:com.gdjs.modules.gold.service.impl
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-11-01 09:33:12        wuyongguo     初版做成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.gold.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gdjs.common.utils.Query;
import com.gdjs.modules.gold.dao.GoldProtocalDao;
import com.gdjs.modules.gold.entity.GoldProtocalEntity;
import com.gdjs.modules.gold.service.GoldProtocalService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 服务金协议配置表Service实现类
 *
 * @author wuyongguo
 * @date 2019-11-01 09:33:12
 */
@Service("goldProtocalService")
public class GoldProtocalServiceImpl extends ServiceImpl<GoldProtocalDao, GoldProtocalEntity> implements GoldProtocalService {

    @Override
    public List<GoldProtocalEntity> queryAll(Map<String, Object> params) {
        return baseMapper.queryAll(params);
    }

    @Override
    public Page queryPage(Map<String, Object> params) {
        //排序
        params.put("sidx", "T.protocalId");
        params.put("asc", false);
        Page<GoldProtocalEntity> page = new Query<GoldProtocalEntity>(params).getPage();
        return page.setRecords(baseMapper.selectGoldProtocalPage(page, params));
    }

    @Override
    public boolean add(GoldProtocalEntity goldProtocal) {
        return this.save(goldProtocal);
    }

    @Override
    public boolean update(GoldProtocalEntity goldProtocal) {
        return this.updateById(goldProtocal);
    }

    @Override
    public boolean delete(String protocalId) {
        return this.removeById(protocalId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean deleteBatch(String[] protocalIds) {
        return this.removeByIds(Arrays.asList(protocalIds));
    }
}
