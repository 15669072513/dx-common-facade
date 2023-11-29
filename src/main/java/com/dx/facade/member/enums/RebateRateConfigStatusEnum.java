package com.dx.facade.member.enums;
/**
 * 返点比例状态枚举
 * 
 * @author bicycle
 */
public enum RebateRateConfigStatusEnum {
	
	/** 未设置 */
	UN_SET(0,"未设置"),
	
	/** 已生效 */
	EFFECTIVE(1,"生效中"),
	
	/** 已失效 */
	EXPIRED(2,"已失效"),
	;
	
    private Integer code;
    
    private String desc;

    RebateRateConfigStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static RebateRateConfigStatusEnum getType(Integer code) {
        for (RebateRateConfigStatusEnum enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
