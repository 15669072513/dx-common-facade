package com.dx.facade.enums;

/**
 * 开盘结果
 */
public enum PokerResultInfoEnum {
    POKER1("POKER1", "皇家同花顺" ,"POYAL FLUSH", "", ""),
    POKER2("POKER2", "同花顺" ,"STRAIGHT FLUSH", "", ""),
    POKER3("POKER3", "四条" ,"FOUR OF A KING", "", ""),
    POKER4("POKER4", "葫芦" ,"FULL HOUSE", "", ""),
    POKER5("POKER5", "同花" ,"FLUSH", "", ""),
    POKER6("POKER6", "顺子" ,"STRAIGHT", "", ""),
    POKER7("POKER7", "一条" ,"THREE OF A KIND", "", ""),
    POKER8("POKER8", "两对" ,"TWO PAIR", "", ""),
    POKER9("POKER9", "一对" ,"ONE PAIR", "", ""),
    POKER10("POKER10", "高牌" ,"HIGH CARD", "", "");

    private String code;
    private String zh;
    private String en;
    private String tc;
    private String ja;

    PokerResultInfoEnum(String code, String zh, String en, String tc, String ja) {
        this.code = code;
        this.zh = zh;
        this.en = en;
        this.tc = tc;
        this.ja = ja;
    }


    public String getCode() {
        return code;
    }

    public String getZh() {
        return zh;
    }

    public String getEn() {
        return en;
    }

    public String getTc() {
        return tc;
    }

    public String getJa() {
        return ja;
    }
}
