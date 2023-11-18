package com.dx.facade.enums;

import java.util.Arrays;

/**
 * 服务费抽水方式枚举
 */
public enum ServiceChargeTypeEnum {

    POT_RATE(1,"底池比例"),
    PROFIT_RATE(2,"盈利比例");

    private int type;

    private  String desc;

    ServiceChargeTypeEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    /**
     * @param code 服务类型
     * @return
     */
    public static ServiceChargeTypeEnum getByCode(int code) {
        return Arrays.stream(ServiceChargeTypeEnum.values()).filter(s -> s.getType() == code).findAny()
                .orElse(null);
    }


    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
