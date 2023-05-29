package com.dx.facade.enums;

import java.util.Objects;

public enum ReceiveStatusEnum {
    未领取(0,"未领取"),
    已领取(1, "已领取"),
    已过期(2, "已过期");

    private Integer code;
    private String desc;

    ReceiveStatusEnum(Integer code, String desc) {
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
        ReceiveStatusEnum anEnum = getType(code);
        return Objects.nonNull(anEnum) ? anEnum.desc : "";
    }

    public static ReceiveStatusEnum getType(Integer code) {
        ReceiveStatusEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ReceiveStatusEnum anEnum = var1[var3];
            if (anEnum.code.equals(code)) {
                return anEnum;
            }
        }
        return null;
    }

}
