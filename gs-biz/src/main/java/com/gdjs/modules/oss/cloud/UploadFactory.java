/*
 * 项目名称:gdjs-plus
 * 类名称:SysOssController.java
 * 包名称:com.gdjs.modules.oss.controller
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2019/1/17 16:21    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.modules.oss.cloud;


import com.gdjs.common.utils.Constant;
import com.gdjs.common.utils.SpringContextUtils;
import com.gdjs.modules.sys.service.SysConfigService;

/**
 * 文件上传Factory
 *
 * @author GDJS
 * @date 2019-01-17 16:21:01
 */
public final class UploadFactory {
    private static SysConfigService sysConfigService;

    static {
        UploadFactory.sysConfigService = (SysConfigService) SpringContextUtils.getBean("sysConfigService");
    }

    public static AbstractCloudStorageService build() {
        //获取云存储配置信息
        CloudStorageConfig config = sysConfigService.getConfigObject(Constant.CLOUD_STORAGE_CONFIG_KEY, CloudStorageConfig.class);

        if (config.getType() == Constant.CloudService.QINIU.getValue()) {
            return new QiniuCloudStorageService(config);
        } else if (config.getType() == Constant.CloudService.ALIYUN.getValue()) {
            return new AliyunCloudStorageService(config);
        } else if (config.getType() == Constant.CloudService.QCLOUD.getValue()) {
            return new QcloudCloudStorageService(config);
        } else if (config.getType() == Constant.CloudService.DISCK.getValue()) {
            return new DiskCloudStorageService(config);
        }

        return null;
    }

}
