package com.dx.facade.member.member.common;

/**
 * 代理支付业务类型
 */
public enum ProxyPaymentTypeEnum {

    TOP_PROXY_COMMISSION_PAYMENT(1, "总代佣金支付"),
    PROXY_COMMISSION_PAYMENT(2, "代理佣金支付"),
    COMMISSION_REPLACE_PAYMENT(3, "佣金代发"),
    PROXY_REBATE_RECEIVE(4, "流水返点"),
    PROXY_INCOME(5, "代理收益");


    private Integer code;
    private String remark;

    private ProxyPaymentTypeEnum(Integer code, String remark) {
        this.code = code;
        this.remark = remark;
    }

    public Integer getCode() {
        return code;
    }

    public String getRemark() {
        return remark;
    }
}
