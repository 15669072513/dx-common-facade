package com.dx.facade.member.enums;
/**
 * 返点比例状态枚举
 * 
 * @author bicycle
 */
public enum RebateRateStatusEnum {
	
	/** 未设置 */
	UN_SET(0,"未设置"),
	
	/** 已生效 */
	EFFECTIVE(1,"生效中"),
	
	/** 已失效 */
	EXPIRED(2,"已失效"),
	
	/** 平台调整 这个时候也是失效的 */
	PLATFORM_ADJUSTMENT(3,"平台调整"),
	
	UN_SET_OR_PLATFORM_ADJUSTMENT(4,"未设置或者平台调整"),
	;
	
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
