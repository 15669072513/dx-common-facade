package com.dx.facade.enums;


import java.util.HashMap;
import java.util.Map;

public enum UpDownScoreEnum {

    上分(1, "上分"),
    下分(2, "下分");


    private final Integer code;

    private final String msg;

    UpDownScoreEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }


    static Map<Integer, UpDownScoreEnum> code2Enum = new HashMap<>();
    static {
        for (UpDownScoreEnum value : UpDownScoreEnum.values()) {
            code2Enum.put(value.code, value);
        }
    }

    public static UpDownScoreEnum getType(Integer code) {
        return code2Enum.get(code);
    }
}
