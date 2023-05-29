package com.dx.facade.merchant.enums;

import com.dx.exception.BizException;

import java.util.Objects;

/**
 @title
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2022-10-04 11:56:16
*/
public class AppVersion {

    /**
     * 终端类型
     */
    public enum ClientType {
        ANDROID(1, "Android"),
        IOS(2, "IOS"),
        ;
        private Integer code;
        private String desc;

        ClientType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static AppVersion.ClientType getType(Integer code) throws BizException {
            for (AppVersion.ClientType clientType : values()) {
                if (clientType.code.equals(code)) {
                    return clientType;
                }
            }
            throw new BizException("终端没有这个类型");
        }
    }

    /**
     * 更新类型
     */
    public enum UpdateType {
        弱更新(1, "弱更新"),
        强更新(2, "强更新");
        ;
        private Integer code;
        private String desc;

        UpdateType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static AppVersion.UpdateType getType(Integer code) throws BizException {
            for (AppVersion.UpdateType clientType : values()) {
                if (clientType.code.equals(code)) {
                    return clientType;
                }
            }
            throw new BizException("更新类型没有这个类型");
        }
    }

    /**
     * 生效状态
     */
    public static enum AppVersionStatus {
        待开启(0, "待开启"),
        开启中(1, "开启中");

        public Integer code;
        public String desc;

        private AppVersionStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static AppVersion.AppVersionStatus getType(Integer code) throws BizException {
            for (AppVersion.AppVersionStatus appVersionStatus : values()) {
                if (appVersionStatus.code.equals(code)) {
                    return appVersionStatus;
                }
            }
            throw new BizException("生效状态没有这个状态");
        }
    }
}
