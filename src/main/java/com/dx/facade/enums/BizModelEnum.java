package com.dx.facade.enums;

import java.util.HashMap;
import java.util.Map;

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

	private static Map<Integer, BizModelEnum> code2Enum = new HashMap<>();
	static {
		for (BizModelEnum modelEnum : BizModelEnum.values()) {
			code2Enum.put(modelEnum.code, modelEnum);
		}
	}

	public static BizModelEnum getByCode(Integer code){
		return code2Enum.get(code);
	}

	public boolean isAllMode(Integer mode) {
		return mode != null && mode.intValue() == BizModelEnum.MIX.code();
	}

	public boolean isCash(Integer mode) {
		return mode != null && mode.intValue() == BizModelEnum.CASH.code();
	}

	public boolean isCredit(Integer mode) {
		return mode != null && mode.intValue() == BizModelEnum.CREDIT.code();
	}
}