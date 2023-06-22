package com.dx.facade.account.change;

/**
 * 收支类型
 */
public enum TransType {
    income(1, "收入"),
    outlay(2, "支出");

    private Integer code;
    private String desc;

    TransType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public String getDesc() {
        return desc;
    }

    public static TransType getType(Integer code) {
        for (TransType transType : values()) {
            if (transType.code.equals(code)) {
                return transType;
            }
        }
        return null;
    }
}