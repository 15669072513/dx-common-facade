package com.dx.facade.member.enums;
/**
 * 返点比例类型枚举
 * 
 * @author bicycle
 */
public enum RebateRateTypeEnum {
	
	/** 德州 */
	TEXAS(1, "德州"),
	/** 德州保险 */
	TEXAS_INSURANCE(2, "德州保险"),
	/** 德州 */
	ACTUAL_PERSON(3, "真人"),
	/** 德州 */
	SPORTS(4, "体育"),
	/** 德州 */
	LOTTERY_TICKET(5, "彩票"),
	/** 德州 */
	CHESS(6, "棋牌"),
	/** 德州 */
	ESPORTS(7, "电竞"),
;
	

    private Integer code;
    
    private String desc;

    RebateRateTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer code() {
        return code;
    }

    public String desc() {
        return desc;
    }

    public static RebateRateTypeEnum getType(Integer code) {
        for (RebateRateTypeEnum enums : values()) {
            if (enums.code.equals(code)) {
                return enums;
            }
        }
        return null;
    }
}
