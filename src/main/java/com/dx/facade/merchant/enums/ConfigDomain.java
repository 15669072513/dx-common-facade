package com.dx.facade.merchant.enums;

import com.dx.exception.BizException;

/**
 @title
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2022-09-23 11:59:07
*/
public class ConfigDomain {

    /**
     * 状态
     */
    public enum DomainStatus {
        OFF(0, "停用"),
        ON(1, "启用"),
        ;
        private Integer code;
        private String desc;

        DomainStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static DomainStatus getType(Integer code) throws BizException {
            for (DomainStatus status : values()) {
                if (status.code.equals(code)) {
                    return status;
                }
            }
            throw new BizException("域名没有这个状态");
        }
    }

    /**
     * 业务类型1-activity，2-member，3-launch，4-其他
     */
    public enum DomainType {
        ACTIVITY(1, "activity"),
        MEMBER(2, "member"),
        LAUNCH(3, "launch"),
        OTHER(4, "其他"),
        ;
        private Integer code;
        private String desc;

        DomainType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static DomainType getType(Integer code) throws BizException {
            for (DomainType type : values()) {
                if (type.code.equals(code)) {
                    return type;
                }
            }
            throw new BizException("域名没有这个类型");
        }
    }
}
