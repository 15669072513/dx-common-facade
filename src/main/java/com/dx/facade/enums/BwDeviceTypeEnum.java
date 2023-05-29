package com.dx.facade.enums;

import java.util.Objects;

/**
 * 包网设备类型
 * 1=pc，2=h5，3=ios，4=android，5=other
 */
public enum BwDeviceTypeEnum {
    PC(1, "PC"),
    H5(2, "h5"),
    IOS(3, "ios"),
    ANDROID(4, "android"),
    OTHER(5, "其它"),
    ;

    private Integer code;
    private String desc;

    BwDeviceTypeEnum(Integer code, String desc) {
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
		BwDeviceTypeEnum anEnum = getType(code);
		return Objects.nonNull(anEnum) ? anEnum.desc : "";
	}
	
	public static BwDeviceTypeEnum getType(Integer code) {
		BwDeviceTypeEnum[] var1 = values();
		int var2 = var1.length;
		
		for(int var3 = 0; var3 < var2; ++var3) {
			BwDeviceTypeEnum anEnum = var1[var3];
			if (anEnum.code.equals(code)) {
				return anEnum;
			}
		}
		return null;
	}
}
