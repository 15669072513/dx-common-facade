package com.dx.facade.member.enums;
/**
 * 返佣比例类型枚举
 * 
 * @author bicycle
 */
public enum CommissionRateTypeEnum {
	
	/** 德州俱乐部 */
	TEXAS(1, "德州俱乐部"),
	/** 德州保险 */
	TEXAS_INSURANCE(2, "德州保险"),
	/** 德州 */
	OTHER(3, "其他"),

;
	

    private Integer code;
    
    private String desc;

    CommissionRateTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static CommissionRateTypeEnum getType(Integer code) {
        for (CommissionRateTypeEnum enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
