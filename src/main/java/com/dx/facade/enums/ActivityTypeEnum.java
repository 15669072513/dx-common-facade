package com.dx.facade.enums;

import java.util.Objects;

public enum ActivityTypeEnum {
    首存活动(1,"首存活动"),
    VIP晋级优化(3, "VIP晋级优惠"),
    纯展示页活动(4, "纯展示页活动"),
    好友邀请(5, "好友邀请");

    private Integer code;
    private String desc;

    ActivityTypeEnum(Integer code, String desc) {
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
        ActivityTypeEnum anEnum = getType(code);
        return Objects.nonNull(anEnum) ? anEnum.desc : "";
    }

    public static ActivityTypeEnum getType(Integer code) {
        ActivityTypeEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ActivityTypeEnum anEnum = var1[var3];
            if (anEnum.code.equals(code)) {
                return anEnum;
            }
        }
        return null;
    }
}
