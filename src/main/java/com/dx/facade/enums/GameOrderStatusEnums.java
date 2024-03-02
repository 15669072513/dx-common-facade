package com.dx.facade.enums;

import com.dx.exception.BizException;

import java.util.Arrays;

/**
 * 订单状态枚举
 */
public enum GameOrderStatusEnums {

    UNSETTLED(0, "未结算"),

    SETTLED(1, "已结算"),

    ;

    private int code;
    private String desc;

    private GameOrderStatusEnums(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }

    public static GameOrderStatusEnums of(Integer code) throws BizException {
        return Arrays.stream(values()).filter(item -> item.code == code).findAny().orElse(null);
    }


}