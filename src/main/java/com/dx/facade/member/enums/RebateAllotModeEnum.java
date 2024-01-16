package com.dx.facade.member.enums;
/**
 * 返点分配模式枚举
 * 
 * @author bicycle
 */
public enum RebateAllotModeEnum {
	
	/** 自由模式 */
	FREE(1, "自由模式"),
	/** 模板模式 */
	TEMPLATE(2, "模板模式"),
;
	

    private Integer code;
    
    private String desc;

    RebateAllotModeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static RebateAllotModeEnum getMode(Integer code) {
        for (RebateAllotModeEnum enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
