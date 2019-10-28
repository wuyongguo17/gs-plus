/*
 * 项目名称:gdjs-plus
 * 类名称:SysLog.java
 * 包名称:com.gdjs.common.annotation
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    GDJS      初版做成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.common.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 *
 * @author GDJS
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String value() default "操作日志";
}
