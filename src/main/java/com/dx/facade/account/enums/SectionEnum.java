package com.dx.facade.account.enums;

import java.util.Objects;

/**
 * 资金操作记录，操作栏目枚举
 */
public enum SectionEnum {

    BILL_MANAGER(1,"结算账单管理"),
    ACCOUNT_ADJUST(1,"资金调整"),
    ACCOUNT_AUDIT(3,"资金审核"),
    IN_OUT_CONFIG(4,"出入款配置"),
    EXCHANGE_RATE_CONFIG(5,"汇率配置"),
    DEPOSIT_WITHDRAW_CONFIG(6,"充提设置");


    private Integer code;
    private String desc;
    SectionEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return this.code;
    }
    public String desc() {
        return this.desc;
    }

    public static SectionEnum get(Integer code) {
        SectionEnum[] values = SectionEnum.values();
        for (SectionEnum e : values) {
            if(Objects.equals(code, e.code())) {
                return e;
            }
        }
        return null;
    }
}
