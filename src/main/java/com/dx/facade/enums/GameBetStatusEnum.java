package com.dx.facade.enums;

/**
 * 投注状态
 */
public enum GameBetStatusEnum {
    CALL(0, "跟注"),
    RAISE(1, "加注"),
    ALLIN(2, "ALLIN"),
    FOLD(3, "弃牌"),
    SEE(4, "看牌"),
    BIPAI(5, "比牌");
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
