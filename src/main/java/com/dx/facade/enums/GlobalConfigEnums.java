package com.dx.facade.enums;

public enum GlobalConfigEnums {

    CHAT_BARRAGE(1, 300, null, 1, "聊天弹幕", "德州扑克/短牌", "聊天弹幕"),
    CHAT_PHRASES(2, 301, null, 1, "聊天短语", "德州扑克/短牌", "聊天短语"),
    CHAT_EMOJ(3, 302, null, 1, "表情", "德州扑克/短牌", "表情"),
    CHAT_VOICE(4, 303, null, 1, "聊天语音", "德州扑克/短牌", "聊天语音"),
    VIEW_UNREVEALED_CARD(5, 304, null, 1, "查看未发布公牌", "德州扑克/短牌", "查看未发布公牌"),


    CHAT_PHRASES_CONTENT(10, 305, null, 3, "聊天短语内容", "德州扑克/短牌", "聊天短语内容配置"),

    TEXAS_RAISE(6, 100, TexasGameTypeEnum.TEXAS.code(), 2, "倍数加注", "德州扑克", "德州倍数加注"),
    TEXAS_POT_RAISE(7, 101, TexasGameTypeEnum.TEXAS.code(), 2, "底池加注", "德州扑克", "德州底池加注"),
    SHORT_DECK_RAISE(8, 200, TexasGameTypeEnum.SHORT_CARD.code(), 2, "倍数加注", "短牌", "短牌倍数加注"),
    SHORT_DECK_POT_RAISE(9, 201, TexasGameTypeEnum.SHORT_CARD.code(), 2, "底池加注", "短牌", "短牌底池加注"),
    TEXAS_RAISE_POT_PLUS(12, 102, TexasGameTypeEnum.TEXAS.code(), 1, "德州加注加号配置", "德州扑克", "德州加注加号配置"),
    SHORT_DECK_POT_RAISE_PLUS(13, 202, TexasGameTypeEnum.SHORT_CARD.code(), 1, "短牌加注加号配置", "短牌", "短牌加注加号配置"),

    MOVE_DELAY(11, 306, null, 1, "行动延迟", "德州扑克/短牌", "行动延迟"),
    PROPS(14, 307, null, 1, "互动道具", "德州扑克/短牌", "互动道具配置");
    private Integer bizType;
    private Integer dbType;
    private String desc;
    private String bizTypeName;
    private String gameName;
    private Integer gameType;
    private Integer group;

    GlobalConfigEnums(Integer bizType, Integer dbType, Integer gameType, Integer group, String bizTypeName, String gameName, String desc) {
        this.bizType = bizType;
        this.dbType = dbType;
        this.desc = desc;
        this.bizTypeName = bizTypeName;
        this.gameName = gameName;
        this.gameType = gameType;
        this.group = group;
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

    public String getBizTypeName() {
        return bizTypeName;
    }

    public String getGameName() {
        return gameName;
    }

    public Integer getGameType() {
        return gameType;
    }

    public Integer getGroup() {
        return group;
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
            if (configEnum.getDbType().equals(dbType)) {
                return configEnum;
            }
        }
        return null;
    }

}
