package com.dx.facade.enums;

/**
 * 业务模式：0-现金+信用业务，1-现金业务，2-信用业务
 * @author orbit
 */
public enum BizModelEnum {
	MIX(0, "现金+信用业务"),
	CASH(1, "现金业务"),
	CREDIT(2, "信用业务");

	private Integer code;
	private String desc;

	BizModelEnum(Integer code, String desc) {
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