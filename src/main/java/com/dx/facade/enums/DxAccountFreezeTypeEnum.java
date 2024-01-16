package com.dx.facade.enums;

/**
 * 账户冻结类型
 */
public enum DxAccountFreezeTypeEnum {

    TABLE_FEE_FREEZE(1, false, "局服务费冻结");

    private Integer code;
    //是否需要改变主表账户余额，有些冻结只需要记录流水
    private Boolean needChangeAccount;
    private String desc;

    public Integer code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }


    private DxAccountFreezeTypeEnum(Integer code, Boolean needChangeAccount, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public Boolean getNeedChangeAccount() {
        return needChangeAccount;
    }


    public static DxAccountFreezeTypeEnum of(Integer code) {
        for (DxAccountFreezeTypeEnum freezeTypeEnum : values()) {
            if (freezeTypeEnum.getCode().equals(code)) {
                return freezeTypeEnum;
            }
        }
        return null;
    }

}
