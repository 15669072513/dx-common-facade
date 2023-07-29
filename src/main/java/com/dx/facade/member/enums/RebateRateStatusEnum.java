package com.dx.facade.member.enums;
/**
 * 返点比例状态枚举
 * 
 * @author bicycle
 */
public enum RebateRateStatusEnum {
	
	/** 待生效 */
	TO_BE_EFFECTIVE(0, "待生效"),
	
	/** 已生效 */
	EFFECTIVE(1, "已生效"),
	
	/** 已失效 */
	EXPIRED(-1,"已失效");
	

    private Integer code;
    
    private String desc;

    RebateRateStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static RebateRateStatusEnum getType(Integer code) {
        for (RebateRateStatusEnum enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
