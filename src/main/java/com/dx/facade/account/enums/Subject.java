package com.dx.facade.account.enums;

public enum Subject {

    /**
     *
     */
    EXCHANGE("exchange","兑换筹码"),
    REVERT("revert","归还筹码"),
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
