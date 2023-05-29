package com.dx.facade.enums;

import java.util.Objects;

/**
 * 包网语言枚举
 */
public enum BwLanguageEnum {

    ZH("zh_CN", "中文"),
    EN("en_US", "英文"),
    MS("ms_MY", "马来文"),
    TH("th_TH", "泰文"),
    VN("vi_VN", "越南文")
    ;

    private String code;
    private String desc;

    BwLanguageEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
	
	
	public static String getDesc(String code) {
		BwLanguageEnum anEnum = getType(code);
		return Objects.nonNull(anEnum) ? anEnum.desc : "";
	}
	
	public static BwLanguageEnum getType(String code) {
		BwLanguageEnum[] var1 = values();
		int var2 = var1.length;
		
		for(int var3 = 0; var3 < var2; ++var3) {
			BwLanguageEnum anEnum = var1[var3];
			if (anEnum.code.equals(code)) {
				return anEnum;
			}
		}
		return null;
	}
}
