package com.dx.facade.member.enums;
/**
 * 代理佣金结算周期枚举
 * 
 * @author bicycle
 *
 */
public enum ProxyCommissionSettleCycleEnum {

	MONTH(1, "月结"),
	HALF_MONTH(2, "半月结"),
    ;

    private Integer code;
    private String desc;

    ProxyCommissionSettleCycleEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static ProxyCommissionSettleCycleEnum getType(Integer code) {
        for (ProxyCommissionSettleCycleEnum enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
