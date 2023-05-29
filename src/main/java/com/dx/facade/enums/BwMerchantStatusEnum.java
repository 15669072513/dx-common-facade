package com.dx.facade.enums;

import java.util.Objects;

/**
 * 商户状态枚举
 */
public enum BwMerchantStatusEnum {
	
	FREEZE(0, "冻结"),
	NORMAL(1, "正常"),
	;


    private Integer code;
    private String desc;

    BwMerchantStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
	
	public static String getDesc(Integer code) {
		BwMerchantStatusEnum anEnum = getType(code);
		return Objects.nonNull(anEnum) ? anEnum.desc : "";
	}
	
	public static BwMerchantStatusEnum getType(Integer code) {
		BwMerchantStatusEnum[] var1 = values();
		int var2 = var1.length;
		
		for(int var3 = 0; var3 < var2; ++var3) {
			BwMerchantStatusEnum anEnum = var1[var3];
			if (anEnum.code.equals(code)) {
				return anEnum;
			}
		}
		return null;
	}
 
}
