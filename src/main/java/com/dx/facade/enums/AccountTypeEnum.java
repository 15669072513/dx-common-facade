package com.dx.facade.enums;

public enum AccountTypeEnum {
	
	OFFICIAL(1, "正式"),
	BUSINESS(2, "商务"),
	PERMUTATION(3, "置换"),
	TRYMEMBER(4, "试玩"),
	;
	
	private Integer code;
	
	private String desc;
	
	public Integer code() {
		return this.code;
	}
	
	public String desc() {
		return this.desc;
	}
	
	
	private AccountTypeEnum(Integer code, String desc) {
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
		AccountTypeEnum[] var1 = values();
		int var2 = var1.length;
		for (int var3 = 0; var3 < var2; ++var3) {
			AccountTypeEnum depositStatus = var1[var3];
			if (depositStatus.code.equals(code)) {
				return depositStatus.desc;
			}
		}
		return null;
	}
	
}
