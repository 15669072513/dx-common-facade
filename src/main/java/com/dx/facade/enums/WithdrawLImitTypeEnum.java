package com.dx.facade.enums;

/**
 * 取款限制类型：1-账单限制，2-流水限制
 */
public enum WithdrawLImitTypeEnum {
    /**
     * 账单限制
     */
    BILL_LIMIT(1, "账单限制"),
    /**
     * 流水限制
     */
    STATEMENT_LIMIT(2,"流水限制");
    private Integer code;
    private String desc;

    WithdrawLImitTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
