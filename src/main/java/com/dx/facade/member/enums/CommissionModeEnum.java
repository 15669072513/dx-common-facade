package com.dx.facade.member.enums;
/**
 * 佣金模式枚举
 * 
 * @author bicycle
 */
public enum CommissionModeEnum {
	
	/** 返点模式 */
	REBATE(1,"返点模式"),
	
	/** 返佣模式 */
	COMMISSION(2,"返佣模式"),
	
	;
	
    private Integer code;
    
    private String desc;

    CommissionModeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static CommissionModeEnum getType(Integer code) {
        for (CommissionModeEnum enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
