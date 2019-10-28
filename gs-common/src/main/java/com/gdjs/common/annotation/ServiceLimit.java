package com.gdjs.common.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解  限流
 *
 * @author GDJS
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ServiceLimit {
    String description() default "";
}
