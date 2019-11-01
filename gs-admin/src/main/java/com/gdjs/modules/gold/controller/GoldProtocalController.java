/*
 * 项目名称:gs-plus
 * 类名称:GoldProtocalController.java
 * 包名称:com.gdjs.modules.gold.controller
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-11-01 09:33:12        wuyongguo     初版做成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.gold.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gdjs.common.annotation.SysLog;
import com.gdjs.common.utils.RestResponse;
import com.gdjs.modules.sys.controller.AbstractController;
import com.gdjs.modules.gold.entity.GoldProtocalEntity;
import com.gdjs.modules.gold.service.GoldProtocalService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 服务金协议配置表Controller
 *
 * @author wuyongguo
 * @date 2019-11-01 09:33:12
 */
@RestController
@RequestMapping("gold/protocal")
public class GoldProtocalController extends AbstractController {
    @Autowired
    private GoldProtocalService goldProtocalService;

    /**
     * 查看所有列表
     *
     * @param params 查询参数
     * @return RestResponse
     */
    @RequestMapping("/queryAll")
    @RequiresPermissions("gold:protocal:list")
    public RestResponse queryAll(@RequestParam Map<String, Object> params) {
        List<GoldProtocalEntity> list = goldProtocalService.queryAll(params);

        return RestResponse.success().put("list", list);
    }

    /**
     * 分页查询服务金协议配置表
     *
     * @param params 查询参数
     * @return RestResponse
     */
    @GetMapping("/list")
    @RequiresPermissions("gold:protocal:list")
    public RestResponse list(@RequestParam Map<String, Object> params) {
        Page page = goldProtocalService.queryPage(params);

        return RestResponse.success().put("page", page);
    }

    /**
     * 根据主键查询详情
     *
     * @param protocalId 主键
     * @return RestResponse
     */
    @RequestMapping("/info/{protocalId}")
    @RequiresPermissions("gold:protocal:info")
    public RestResponse info(@PathVariable("protocalId") String protocalId) {
        GoldProtocalEntity goldProtocal = goldProtocalService.getById(protocalId);

        return RestResponse.success().put("protocal", goldProtocal);
    }

    /**
     * 新增服务金协议配置表
     *
     * @param goldProtocal goldProtocal
     * @return RestResponse
     */
    @SysLog("新增服务金协议配置表")
    @RequestMapping("/save")
    @RequiresPermissions("gold:protocal:save")
    public RestResponse save(@RequestBody GoldProtocalEntity goldProtocal) {

        goldProtocalService.add(goldProtocal);

        return RestResponse.success();
    }

    /**
     * 修改服务金协议配置表
     *
     * @param goldProtocal goldProtocal
     * @return RestResponse
     */
    @SysLog("修改服务金协议配置表")
    @RequestMapping("/update")
    @RequiresPermissions("gold:protocal:update")
    public RestResponse update(@RequestBody GoldProtocalEntity goldProtocal) {

        goldProtocalService.update(goldProtocal);

        return RestResponse.success();
    }

    /**
     * 根据主键删除服务金协议配置表
     *
     * @param protocalIds protocalIds
     * @return RestResponse
     */
    @SysLog("删除服务金协议配置表")
    @RequestMapping("/delete")
    @RequiresPermissions("gold:protocal:delete")
    public RestResponse delete(@RequestBody String[] protocalIds) {
        goldProtocalService.deleteBatch(protocalIds);

        return RestResponse.success();
    }
}
