package com.dx.facade.enums;

/**
 * 投注状态
 */
public enum GameBetStatusEnum {


    /**
     *
     CALL(0, "跟注"),
     RAISE(1, "加注"),
     ALLIN(2, "ALLIN"),
     FOLD(3, "弃牌"),
     SEE(4, "看牌"),
     BIPAI(5, "比牌");
     */

    /***
     * 进入房间了，未入座
     */
    UN_SIT_DOWN(0, "进入房间了，未入座"),

    /***
     * 已经入座，等待游戏开始
     */
    SIT_DOWN(1, "已经入座，等待游戏开始"),

    /***
     * 已经入座，等待1手
     */
    SIT_DOWN_WAIT_ONE_HAND(2, "已经入座，等待1手"),

    /***
     * 已经入座，等待2手
     */
    SIT_DOWN_WAIT_TWO_HAND(3, "已经入座，等待2手"),

    /***
     * 等待发牌
     */
    WAIT_GET_CARD(4, "等待发牌"),

    /***
     * 等待下注
     */
    WAIT_BET(5, "等待下注"),

    /***
     * 弃牌
     */
    FOLD(6, "弃牌"),

    /***
     * 跟注
     */
    CALL(7, "跟注"),

    /***
     * 过牌
     */
    CHECK(8, "过牌"),

    /***
     * 加注
     */
    RAISE(9, "加注"),

    /***
     * 全下
     */
    ALLIN(10, "全下"),

    /***
     * 站起
     */
    STAND(12, "站起"),

    //比牌
    SETTLEMENT(13,"比牌"),

    /***
     * 占座
     */
    OCCUPY(15, "占座"),
    ;
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
