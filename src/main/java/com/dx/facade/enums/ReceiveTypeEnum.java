package com.dx.facade.enums;

import java.util.Objects;

public enum ReceiveTypeEnum {

    自动领取(1, "自动领取"),
    手动领取(2, "手动领取");

    private Integer code;
    private String desc;

    ReceiveTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static String getDesc(Integer code) {
        ReceiveTypeEnum anEnum = getType(code);
        return Objects.nonNull(anEnum) ? anEnum.desc : "";
    }

    public static ReceiveTypeEnum getType(Integer code) {
        ReceiveTypeEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ReceiveTypeEnum anEnum = var1[var3];
            if (anEnum.code.equals(code)) {
                return anEnum;
            }
        }

        return null;
    }

}
