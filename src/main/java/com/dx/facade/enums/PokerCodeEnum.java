package com.dx.facade.enums;

/**
 * 扑克牌
 * @author heart
 */
public enum PokerCodeEnum {


    KING1("KING_1", "大王" ,"red peach a", "紅桃a", "ハートa"),
    KING2("KONG_2", "小王" ,"block A", "紅桃a", "ブロックA"),

    K1("rh", "紅桃" ,"rheart", "紅桃a", "ハートa"),
    K2("sp", "黑桃" ,"spade", "紅桃a", "ブロックA"),
    K3("di", "方块" ,"diamond", "梅花A", "梅の花"),
    K4("cl", "梅花" ,"club", "黑體A", "黒体A");
    private String code;
    private String zh;
    private String en;
    private String tc;
    private String ja;

    PokerCodeEnum(String code, String zh, String en, String tc, String ja) {
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
