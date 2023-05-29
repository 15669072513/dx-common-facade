package com.dx.facade.enums;

/**
 * 注单状态枚举
 */
public enum ObBetStatusEnum {
    UNSETTLED(0, "未结算"),
    SETTLED(1, "已结算"),
    WONT_SETTLE(2, "不结算");

    private final Integer code;
    private final String description;

    ObBetStatusEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
