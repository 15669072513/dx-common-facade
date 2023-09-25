package com.dx.facade.member.enums;
/**
 * 返佣比例状态枚举
 * 
 * @author bicycle
 */
public enum CommissionRateStatusEnum {
	
	/** 未设置 */
	UN_SET(0,"未设置"),
	
	/** 已生效 */
	EFFECTIVE(1,"生效中"),
	
	/** 已失效 */
	EXPIRED(2,"已失效"),
	
	/** 平台调整 这个时候也是失效的 */
	PLATFORM_ADJUSTMENT(3,"平台调整"),
	
	/** 未设置或者平台调整 主要用于代理后台查询未设置的返佣比例 */
	UN_SET_OR_PLATFORM_ADJUSTMENT(4,"未设置或者平台调整"),
	;
	
    private Integer code;
    
    private String desc;

    CommissionRateStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static CommissionRateStatusEnum getType(Integer code) {
        for (CommissionRateStatusEnum enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
