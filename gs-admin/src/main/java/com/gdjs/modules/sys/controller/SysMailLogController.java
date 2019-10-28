/*
 * 项目名称:gdjs-plus
 * 类名称:SysMailLogController.java
 * 包名称:com.gdjs.modules.sys.controller
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-03-21 16:46:32        GDJS     初版做成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.sys.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gdjs.common.annotation.SysLog;
import com.gdjs.common.utils.RestResponse;
import com.gdjs.modules.sys.entity.SysMailLogEntity;
import com.gdjs.modules.sys.entity.SysUserEntity;
import com.gdjs.modules.sys.service.SysMailLogService;
import com.gdjs.modules.sys.service.SysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 邮件发送日志Controller
 *
 * @author GDJS
 * @date 2019-03-21 16:46:32
 */
@RestController
@RequestMapping("sys/maillog")
public class SysMailLogController extends AbstractController {
    @Autowired
    private SysMailLogService sysMailLogService;
    @Autowired
    private SysUserService sysUserService;

    /**
     * 分页查询邮件发送日志
     *
     * @param params 查询参数
     * @return RestResponse
     */
    @GetMapping("/list")
    @RequiresPermissions("sys:maillog:list")
    public RestResponse list(@RequestParam Map<String, Object> params) {

        //只能查看权限下的发送记录
        params.put("dataScope", getDataScope());

        Page page = sysMailLogService.queryPage(params);

        return RestResponse.success().put("page", page);
    }

    /**
     * 根据主键查询详情
     *
     * @param id 主键
     * @return RestResponse
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:maillog:info")
    public RestResponse info(@PathVariable("id") String id) {
        SysMailLogEntity sysMailLog = sysMailLogService.getById(id);

        return RestResponse.success().put("maillog", sysMailLog);
    }

    /**
     * 根据主键删除邮件发送日志
     *
     * @param ids ids
     * @return RestResponse
     */
    @SysLog("删除邮件发送日志")
    @RequestMapping("/delete")
    @RequiresPermissions("sys:maillog:delete")
    public RestResponse delete(@RequestBody String[] ids) {
        sysMailLogService.deleteBatch(ids);

        return RestResponse.success();
    }

    /**
     * 邮箱配置
     *
     * @param user user
     * @return RestResponse
     */
    @SysLog("修改邮箱配置")
    @RequestMapping("/config")
    @RequiresPermissions("sys:maillog:config")
    public RestResponse config(@RequestBody SysUserEntity user) {

        sysUserService.update(user, new UpdateWrapper<SysUserEntity>().eq("USER_ID", user.getUserId()));

        return RestResponse.success();
    }
}
