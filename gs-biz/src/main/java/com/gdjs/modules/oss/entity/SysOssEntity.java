/*
 * 项目名称:gdjs-plus
 * 类名称:SysOssEntity.java
 * 包名称:com.gdjs.modules.oss.entity
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2019/1/17 16:23    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.oss.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文件上传
 *
 * @author GDJS
 * @date 2019-01-17 16:23:26
 */
@Data
@TableName("SYS_OSS")
public class SysOssEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private String id;
    /**
     * URL地址
     */
    private String url;
    /**
     * 创建时间
     */
    private Date createDate;
}
