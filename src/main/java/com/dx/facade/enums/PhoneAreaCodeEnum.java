package com.dx.facade.enums;

import java.util.Objects;

/**
 * 手机区号 枚举
 *
 * @author fitz
 * @version 1.0.0
 * @since 2022年5月24日
 */
public enum PhoneAreaCodeEnum {
	
	CN("+86","CN", "中国大陆"),
	TW("+886","TW", "中国台湾");
	
	public String areaCode;
	public String code;
	public String desc;
	
	PhoneAreaCodeEnum(String areaCode, String code, String desc) {
		this.areaCode = areaCode;
		this.code = code;
		this.desc = desc;
	}
	
	public String code() {
		return this.code;
	}
	
	public String areaCode() {
		return this.areaCode;
	}
	
	public String desc() {
		return this.desc;
	}
	
	public static String getDescByCode(String code) {
		PhoneAreaCodeEnum codeEnum = getEnumByCode(code);
		return Objects.nonNull(codeEnum) ? codeEnum.desc : "";
	}
	
	public static String getDescByAreaCode(String areaCode) {
		PhoneAreaCodeEnum codeEnum = getEnumByAreaCode(areaCode);
		return Objects.nonNull(codeEnum) ? codeEnum.desc : "";
	}
	
	public static PhoneAreaCodeEnum getEnumByCode(String code) {
		PhoneAreaCodeEnum[] var1 = values();
		int var2 = var1.length;
		
		for (int var3 = 0; var3 < var2; ++var3) {
			PhoneAreaCodeEnum codeEnum = var1[var3];
			if (codeEnum.code.equals(code)) {
				return codeEnum;
			}
		}
		return null;
	}
	
	public static PhoneAreaCodeEnum getEnumByAreaCode(String areaCode) {
		PhoneAreaCodeEnum[] var1 = values();
		int var2 = var1.length;
		
		for (int var3 = 0; var3 < var2; ++var3) {
			PhoneAreaCodeEnum codeEnum = var1[var3];
			if (codeEnum.areaCode.equals(areaCode)) {
				return codeEnum;
			}
		}
		return null;
	}
	
}
