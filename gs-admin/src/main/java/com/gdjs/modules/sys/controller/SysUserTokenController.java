/*
 * 项目名称:gdjs-plus
 * 类名称:SysUserTokenController.java
 * 包名称:com.gdjs.modules.sys.controller
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-02-01 11:12:49        GDJS     初版做成
 *
 * Copyright (c) 2018-2019 GDJS
 */
package com.gdjs.modules.sys.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gdjs.common.annotation.SysLog;
import com.gdjs.common.utils.RestResponse;
import com.gdjs.modules.sys.service.SysUserTokenService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 系统用户TokenController
 *
 * @author GDJS
 * @date 2019-02-01 11:12:49
 */
@RestController
@RequestMapping("sys/usertoken")
public class SysUserTokenController {
    @Autowired
    private SysUserTokenService sysUserTokenService;

    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return RestResponse
     */
    @GetMapping("/list")
    @RequiresPermissions("sys:usertoken:list")
    public RestResponse list(@RequestParam Map<String, Object> params) {
        Page page = sysUserTokenService.queryPage(params);

        return RestResponse.success().put("page", page);
    }

    /**
     * 批量下线用户(删除用户token记录)
     *
     * @param userIds userIds
     * @return RestResponse
     */
    @SysLog("批量下线用户")
    @RequestMapping("/offline")
    @RequiresPermissions("sys:usertoken:offline")
    public RestResponse offline(@RequestBody String[] userIds) {
        sysUserTokenService.offlineBatch(userIds);
        return RestResponse.success();
    }
}
