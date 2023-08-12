package com.dx.facade.account.enums;

public enum Subject {

    /**
     *
     */
    ADD("add","充值上分"),
    SUB("sub","提现下分"),
    CREDIT_ADD("credit_add","授信上分"),
    CREDIT_SUB("credit_sub","授信下分"),
    EXCHANGE("exchange","兑换筹码"),
    REVERT("revert","归还筹码"),
    DETAIL("detail","资金明细"),
    ;

    private final String code;
    private final String desc;

    Subject(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
