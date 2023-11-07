package com.dx.facade.enums;

import java.util.HashSet;
import java.util.Set;

public enum SystemCodeEnum {

    德州游戏("1000", "德州游戏"),
    场馆("2000","庄家"),
    资金("3000","资金");

    private String code;
    private String description;

    SystemCodeEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static SystemCodeEnum getByCode(Integer code) {
        for (SystemCodeEnum gameTypeEnum : SystemCodeEnum.values()) {
            if (gameTypeEnum.code.equals(code)) {
                return gameTypeEnum;
            }
        }
        return null;
    }

}
