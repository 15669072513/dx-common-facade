package com.dx.facade.enums;

/**
 * 投注状态
 */
public enum GameBetStatusEnum {
    CALL(0, "跟注"),
    CHECK(1, "看牌"),
    RAISE(2, "加注"),
    ALLIN(3, "ALLIN"),
    FOLD(4, "弃牌");
    GameBetStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
