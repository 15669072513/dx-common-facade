package com.dx.facade.enums;

import com.dx.enums.I18nEnum;

/**
 * message-server 国际化错误码枚举
 */
public enum MessageI18nCodeEnum implements I18nEnum {
    PHONE_VERIFY_ERROR(3076), // PHONE_VERIFY_ERROR(3076, "请输入有效号码"),
    SEND_VERIFICATION_FAILED(10008), // SEND_VERIFICATION_FAILED(10008, "发送验证码失败！"),
    TRY_AGAIN_EMAIL(100020),//TRY_AGAIN_EMAIL(100020, "当前邮箱地址请求过于频繁，请1分钟后再试"),
    SMS_CODE_INVALID(3078),//"该验证码已失效，需要重新获取"),
    SMS_CODE_MISTAKE(3079),//"验证码输入错误"),
    SMS_FREQUENT_OPERATION_24H(10201),// "获取验证码频繁，请24H之后再试"),
    TRY_AGAIN(100019),// "当前手机号码请求过于频繁，请1分钟后再试"),
    ;

    private int code;

    MessageI18nCodeEnum(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }

    public static MessageI18nCodeEnum getInstance(int code){
        for(MessageI18nCodeEnum i18n:values()){
            if(i18n.code == code){
                return i18n;
            }
        }
        return null;
    }
}
