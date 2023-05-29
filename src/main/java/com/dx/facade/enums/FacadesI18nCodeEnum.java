package com.dx.facade.enums;


import com.dx.enums.I18nEnum;

/**
 * facades 国际化错误码枚举
 */
public enum FacadesI18nCodeEnum implements I18nEnum {
    USER_NOT_EXISTS(10024), // USER_NOT_EXISTS(10024, "用户不存在"),
    PROXY_NOT_EXIST(10018), // PROXY_NOT_EXIST(10018, "代理不存在"),
    ORDER_NOT_EXIST(10002), // ORDER_NOT_EXIST(10002, "订单不存在"),
    PROXY_NOT_EXISTS(10030), // PROXY_NOT_EXISTS(10030, "代理不存在"),
    USER_NOT_YOUR_SUB(30001), // USER_NOT_YOUR_SUB(30001, "输入账号不是您的下级"),
    PROXY_COMMISSION_RECORD_NOT_FOUND(310037), // PROXY_COMMISSION_RECORD_NOT_FOUND(310037, "代理佣金记录未找到"),
    逻辑业务异常(97777), // 逻辑业务异常(97777, "逻辑业务异常"),
    ;

    private int code;

    FacadesI18nCodeEnum(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
