package com.dx.facade.account.enums;

public enum Status {
    NO(0, "状态通用枚举，停用/否定/不是/一切无的含义"),
    YES(1, "状态通用枚举，启用/是的/肯定/一切有的含义"),
    ;

    private Integer code;
    private String desc;

    Status(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static Status getType(Integer code) {
        for (Status enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
