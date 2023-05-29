package com.dx.facade.member.enums;

public enum ThirdPlatform {

    FB(1, "facebook"),
    ZALO(2,"zalo"),
    ;

    private Integer code;
    private String desc;

    ThirdPlatform(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static ThirdPlatform getType(Integer code) {
        for (ThirdPlatform enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
