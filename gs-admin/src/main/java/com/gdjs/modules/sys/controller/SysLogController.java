/*
 * 项目名称:gdjs-plus
 * 类名称:SysLogController.java
 * 包名称:com.gdjs.modules.sys.controller
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.sys.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gdjs.common.utils.RestResponse;
import com.gdjs.modules.sys.service.SysLogService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 系统日志
 *
 * @author GDJS
 */
@Controller
@RequestMapping("/sys/log")
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    /**
     * 列表
     *
     * @param params 查询参数
     * @return RestResponse
     */
    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("sys:log:list")
    public RestResponse list(@RequestParam Map<String, Object> params) {
        IPage page = sysLogService.queryPage(params);

        return RestResponse.success().put("page", page);
    }
}
