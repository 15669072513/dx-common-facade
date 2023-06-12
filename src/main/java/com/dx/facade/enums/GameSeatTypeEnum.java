package com.dx.facade.enums;

/**
 * 座位类型
 */
public enum GameSeatTypeEnum {
    NORMAL(0, "普通"),
    DEALER(1, "庄"),
    BIGBLIND(2, "大盲"),
    SMALLBLIND(3, "小盲");

    GameSeatTypeEnum(int code, String desc) {
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
