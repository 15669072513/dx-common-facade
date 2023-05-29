package com.dx.facade.merchant.enums;

import com.dx.exception.BizException;

/**
 @title
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2022-10-04 14:10:01
*/
public class UserLoginLog {

    /**
     * 登录状态
     */
    public enum LoginStatus {
        FAIL(0, "失败"),
        SUCCESS(1, "成功"),
        ;
        private Integer code;
        private String desc;

        LoginStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public static UserLoginLog.LoginStatus getType(Integer code) throws BizException {
            for (UserLoginLog.LoginStatus loginStatus : values()) {
                if (loginStatus.code.equals(code)) {
                    return loginStatus;
                }
            }
            throw new BizException("登录没有这个状态");
        }
    }
}
