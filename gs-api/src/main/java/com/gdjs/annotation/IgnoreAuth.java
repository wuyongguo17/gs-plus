/*
 * 项目名称:gdjs-plus
 * 类名称:Login.java
 * 包名称:com.gdjs.modules.app.annotation
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.annotation;

import java.lang.annotation.*;

/**
 * app登录效验
 *
 * @author GDJS
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreAuth {
}
