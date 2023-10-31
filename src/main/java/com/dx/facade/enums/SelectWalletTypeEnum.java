package com.dx.facade.enums;

import java.util.HashMap;
import java.util.Map;

public enum SelectWalletTypeEnum {

    现金钱包(1, "现金钱包"),
    信用钱包(2, "信用钱包");

    private Integer code;

    private String desc;

    SelectWalletTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    static Map<Integer, SelectWalletTypeEnum> code2Enum = new HashMap<>();
    static {
        for (SelectWalletTypeEnum value : SelectWalletTypeEnum.values()) {
            code2Enum.put(value.code, value);
        }
    }

    public static SelectWalletTypeEnum getByCode(Integer code){
        return code2Enum.get(code);
    }

}
