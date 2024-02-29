package com.dx.facade.enums;

/**
 * 带入带出类型
 */

public enum ScoreTypeEnum {
    AUTO(1, "自动"),
    HAND(2, "手动"),
    ;

    private final Integer code;
    private final String description;

    ScoreTypeEnum(Integer code, String description) {
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
