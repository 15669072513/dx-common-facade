package com.dx.facade.enums;

import com.dx.enums.I18nEnum;

/**
 * game-record-pull 国际化错误码枚举
 */
public enum PullI18nCodeEnum implements I18nEnum {
    该笔串关注单内至少有一场赛事已开赛(8004), // 该笔串关注单内至少有一场赛事已开赛(8004,"该笔串关注单内至少有一场赛事已开赛，无法进行操作"),
    本场比赛已开赛(8003), // 本场比赛已开赛(8003,"本场比赛已开赛，无法进行操作"),
    该笔串关注单内至少有一场赛事即将开始(8006), // 该笔串关注单内至少有一场赛事即将开始(8006,"该笔串关注单内至少有一场赛事即将开始，无法进行操作");
    本场比赛即将开始(8005), // 本场比赛即将开始(8005,"本场比赛即将开始，无法进行操作"),
    该笔注单已结算(8002), // 该笔注单已结算(8002,"该笔注单已结算，无法进行操作"),
    余额不足(8001), // 余额不足(8001,"余额不足，操作失败"),
    PARPAY_STARTED(80014),
    MATCH_STARTED(80013),
    PARPAY_STARTING(80016),
    MATCH_STARTING(80015),
    ORDER_SETTLED(80012),
    INSUFFICIENT_BALANCE(80011), // 余额不足(8001,"余额不足，操作失败"),
    ;

    private int code;

    PullI18nCodeEnum(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
