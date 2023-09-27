package com.dx.facade.member.enums;
/**
 * 返佣比例生效状态枚举
 * 
 * @author bicycle
 */
public enum CommissionRateEffectiveStatusEnum {
	
	/** 未生效 */
	UN_EFFECTIVE(0,"未生效"),
	
	/** 已生效 */
	EFFECTIVE(1,"已生效"),
	
	;
	
    private Integer code;
    
    private String desc;

    CommissionRateEffectiveStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static CommissionRateEffectiveStatusEnum getType(Integer code) {
        for (CommissionRateEffectiveStatusEnum enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
