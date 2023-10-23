package com.dx.facade.enums;

import java.util.Objects;


public enum DepositWithdrawRecordEnum {
	存款(1, "存款"),
	取款(2, "取款");

	public Integer code;
	public String desc;

	private DepositWithdrawRecordEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
	public static String getDesc(Integer code) {
		DepositWithdrawRecordEnum debtStatus = getType(code);
		return Objects.nonNull(debtStatus) ? debtStatus.desc : "";
	}
	
	public static DepositWithdrawRecordEnum getType(Integer code) {
		DepositWithdrawRecordEnum[] var1 = values();
		int var2 = var1.length;
		
		for (int var3 = 0; var3 < var2; ++var3) {
			DepositWithdrawRecordEnum debtStatus = var1[var3];
			if (debtStatus.code.equals(code)) {
				return debtStatus;
			}
		}
		
		return null;
	}
}