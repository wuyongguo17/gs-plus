/*
 * 项目名称:gdjs-plus
 * 类名称:DataScope.java
 * 包名称:com.gdjs.datascope
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2019/2/14 09:04    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.datascope;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;

/**
 * @author GDJS
 * <p>
 * 数据权限查询参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DataScope extends HashMap {

    /**
     * SQL中数据创建用户（通常传入CREATE_USER_ID）的别名
     */
    private String userAlias = "T.CREATE_USER_ID";

    /**
     * SQL中数据CREATE_USER_ORG_NO的别名
     */
    private String orgAlias = "T.CREATE_USER_ORG_NO";

    /**
     * 具体的数据范围
     */
    private String orgNos;

    /**
     * true：没有机构数据权限，也能查询本人数据
     */
    private Boolean self = true;
}
