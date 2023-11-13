package com.dx.facade.enums;


import java.util.HashMap;
import java.util.Map;

public enum DepositWithDrawEnum {

    存款(1, "存款"),
    取款(2, "取款");


    private final Integer code;

    private final String msg;

    DepositWithDrawEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }


    static Map<Integer, DepositWithDrawEnum> code2Enum = new HashMap<>();
    static {
        for (DepositWithDrawEnum value : DepositWithDrawEnum.values()) {
            code2Enum.put(value.code, value);
        }
    }

    public static DepositWithDrawEnum getType(Integer code) {
        return code2Enum.get(code);
    }
}
