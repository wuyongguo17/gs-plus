/*
 * 项目名称:gdjs-plus
 * 类名称:TokenGenerator.java
 * 包名称:com.gdjs.modules.sys.oauth2
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.common.utils;

import com.gdjs.common.exception.BusinessException;

import java.security.MessageDigest;
import java.util.UUID;

/**
 * 生成token
 *
 * @author GDJS
 */
public class TokenGenerator {

    public static String generateValue() {
        return generateValue(UUID.randomUUID().toString());
    }

    private static final char[] HEX_CODE = "0123456789abcdef".toCharArray();

    public static String toHexString(byte[] data) {
        if (data == null) {
            return null;
        }
        StringBuilder r = new StringBuilder(data.length * 2);
        for (byte b : data) {
            r.append(HEX_CODE[(b >> 4) & 0xF]);
            r.append(HEX_CODE[(b & 0xF)]);
        }
        return r.toString();
    }

    public static String generateValue(String param) {
        try {
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(param.getBytes());
            byte[] messageDigest = algorithm.digest();
            return toHexString(messageDigest);
        } catch (Exception e) {
            throw new BusinessException("生成Token失败", e);
        }
    }
}
