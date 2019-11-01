/*
 * 项目名称:gs-plus
 * 类名称:GoldProtocalEntity.java
 * 包名称:com.gdjs.modules.gold.entity
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-11-01 09:33:12        wuyongguo     初版做成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.gold.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 服务金协议配置表实体
 *
 * @author wuyongguo
 * @date 2019-11-01 09:33:12
 */
@Data
@TableName("GOLD_PROTOCAL")
public class GoldProtocalEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 协议ID
     */
    @TableId
    private String protocalId;
    /**
     * 协议标题
     */
    private String title;
    /**
     * 协议类型（1:会员注册,2:购买合同,3:其他）
     */
    private String type;
    /**
     * 协议内容
     */
    private String content;
    /**
     * 状态(1:启用,0:禁用）
     */
    private String avaliable;
    /**
     * 新增时间
     */
    private Date createTime;
    /**
     * 新增人ID
     */
    private String createUserId;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 修改人ID
     */
    private String updateUserId;
}
