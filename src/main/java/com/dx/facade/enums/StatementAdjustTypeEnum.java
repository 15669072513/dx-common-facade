package com.dx.facade.enums;

/**
 * 所需流水调整类型：0-非调整，1-所需流水调整增加，2-所需六岁扣除调整
 */
public enum StatementAdjustTypeEnum {
	非调整(0, "非流水调整"),
	调整增加(1, "所需流水调整增加"),
	调整扣除(1, "所需流水调整扣除");

	private Integer code;
	private String desc;

	StatementAdjustTypeEnum(Integer code, String desc) {
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