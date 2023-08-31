package com.dx.facade.enums;

import java.util.Objects;

/**
 * 账单类型：0-未出账单（非历史账单） 1-已出账单（历史账单）
 */
public enum BillTypeEnum {
	UNHISTORY(0, "未出账单"),
	HISTORY(1, "已出账单");

	private Integer code;
	private String desc;

	BillTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer code() {
		return this.code;
	}

	public String desc(Integer code) {
		return this.desc;
	}
}