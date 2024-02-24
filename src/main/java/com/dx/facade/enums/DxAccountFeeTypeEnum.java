package com.dx.facade.enums;

import java.util.Optional;

/**
 * 账户手续费类型
 */
public enum DxAccountFeeTypeEnum {

    TABLE_FEE_FREEZE(1, false, true, GameRecordTypeEnum.DX_SERVICE_JUCHOU.getType(), "局服务费冻结");

    private Integer code;
    /**
     * 是否需要改变主表账户余额，有些冻结只需要记录流水
     */
    private Boolean needChangeAccount;
    /**
     * 是否需要冻结
     */
    private Boolean needFreeze;
    /**
     * 关联的订单类型
     */
    private Integer linkOrderType;
    private String desc;

    public Integer code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }


    private DxAccountFeeTypeEnum(Integer code, Boolean needChangeAccount, Boolean needFreeze, Integer linkOrderType, String desc) {
        this.code = code;
        this.desc = desc;
        this.needChangeAccount = needChangeAccount;
        this.linkOrderType = linkOrderType;
        this.needFreeze = needFreeze;
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

    public Boolean isNeedFreeze() {
        return needFreeze;
    }

    public Integer getLinkOrderType() {
        return linkOrderType;
    }

    public static Optional<DxAccountFeeTypeEnum> of(Integer code) {
        for (DxAccountFeeTypeEnum freezeTypeEnum : values()) {
            if (freezeTypeEnum.getCode().equals(code)) {
                return Optional.of(freezeTypeEnum);
            }
        }
        return Optional.empty();
    }

}
