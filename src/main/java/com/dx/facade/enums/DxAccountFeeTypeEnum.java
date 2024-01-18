package com.dx.facade.enums;

/**
 * 账户手续费类型
 */
public enum DxAccountFeeTypeEnum {

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


    private DxAccountFeeTypeEnum(Integer code, Boolean needChangeAccount, String desc) {
        this.code = code;
        this.desc = desc;
        this.needChangeAccount = needChangeAccount;
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


    public static DxAccountFeeTypeEnum of(Integer code) {
        for (DxAccountFeeTypeEnum freezeTypeEnum : values()) {
            if (freezeTypeEnum.getCode().equals(code)) {
                return freezeTypeEnum;
            }
        }
        return null;
    }

}
