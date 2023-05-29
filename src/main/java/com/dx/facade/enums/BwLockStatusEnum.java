package com.dx.facade.enums;

import java.util.Objects;

/**
 * 新增商户审核状态枚举
 */
public enum BwLockStatusEnum {
	
	unlock(0, "未锁单"),
	lock(1, "已锁单"),
	;


    private Integer code;
    private String desc;

    BwLockStatusEnum(Integer code, String desc) {
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
		BwLockStatusEnum anEnum = getType(code);
		return Objects.nonNull(anEnum) ? anEnum.desc : "";
	}
	
	public static BwLockStatusEnum getType(Integer code) {
		BwLockStatusEnum[] var1 = values();
		int var2 = var1.length;
		
		for(int var3 = 0; var3 < var2; ++var3) {
			BwLockStatusEnum anEnum = var1[var3];
			if (anEnum.code.equals(code)) {
				return anEnum;
			}
		}
		return null;
	}
 
}
