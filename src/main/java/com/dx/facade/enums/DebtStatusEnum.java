package com.dx.facade.enums;

import java.util.Objects;

/**
 * 是否欠款：0-无欠款 1-有欠款
 */
public enum DebtStatusEnum {
	NO_DEBT(0, "无欠款"),
	HAVE_DEBT(1, "有欠款");
	
	public Integer code;
	public String desc;
	
	private DebtStatusEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
	public static String getDesc(Integer code) {
		DebtStatusEnum debtStatus = getType(code);
		return Objects.nonNull(debtStatus) ? debtStatus.desc : "";
	}
	
	public static DebtStatusEnum getType(Integer code) {
		DebtStatusEnum[] var1 = values();
		int var2 = var1.length;
		
		for (int var3 = 0; var3 < var2; ++var3) {
			DebtStatusEnum debtStatus = var1[var3];
			if (debtStatus.code.equals(code)) {
				return debtStatus;
			}
		}
		
		return null;
	}
}