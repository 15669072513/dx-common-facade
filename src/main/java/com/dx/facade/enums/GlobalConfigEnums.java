package com.dx.facade.enums;

public enum GlobalConfigEnums {
    TEXAS_RAISE(1, 100, "德州倍数加注"),
    TEXAS_POT_RAISE(2, 101, "德州底池加注"),
    SHORT_DECK_RAISE(3, 200, "短牌倍数加注"),
    SHORT_DECK_POT_RAISE(4, 201, "短牌底池加注"),
    CHAT_BARRAGE(5, 300, "聊天弹幕"),
    CHAT_PHRASES(6, 301, "聊天短语"),
    CHAT_EMOJ(7, 302, "表情"),
    CHAT_VOICE(8, 303, "聊天语音"),
    VIEW_UNREVEALED_CARD(9, 304, "查看未发布公牌");
    private Integer bizType;
    private Integer dbType;
    private String desc;

    GlobalConfigEnums(Integer bizType, Integer dbType, String desc) {
        this.bizType = bizType;
        this.dbType = dbType;
        this.desc = desc;
    }

    public Integer getBizType() {
        return bizType;
    }

    public Integer getDbType() {
        return dbType;
    }

    public String getDesc() {
        return desc;
    }


    public static GlobalConfigEnums getByBizType(Integer bizType) {
        for (GlobalConfigEnums configEnum : values()) {
            if (configEnum.getBizType().equals(bizType)) {
                return configEnum;
            }
        }
        return null;
    }

    public static GlobalConfigEnums getByDbType(Integer dbType) {
        for (GlobalConfigEnums configEnum : values()) {
            if (configEnum.getBizType().equals(dbType)) {
                return configEnum;
            }
        }
        return null;
    }

}
