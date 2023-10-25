package com.dx.facade.enums;

import java.util.Objects;

/**
 * 所需流水调整类型：0-非调整，1-所需流水调整增加，2-所需流水扣除调整，3-取款限制类型切换为流水限制，4-流水达标流水重置
 */
public enum StatementAdjustTypeEnum {
	非调整(0, "非流水调整"),
	调整增加(1, "所需流水调整增加"),
	调整扣除(2, "所需流水调整扣除"),
	取款限制类型调整重置(3, "取款限制类型切换-流水重置"),
	流水达标重置(4,"流水达标-流水重置");

	private Integer code;
	private String desc;

	StatementAdjustTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer code() {
		return this.code;
	}

	public String desc() {
		return this.desc;
	}

	public static StatementAdjustTypeEnum getType(Integer type) {
		if(Objects.equals(type, 非调整.code)) return 非调整;
		if(Objects.equals(type, 调整增加.code)) return 调整增加;
		if(Objects.equals(type, 调整扣除.code)) return 调整扣除;
		throw new IllegalArgumentException("非法流水调整类型:" + type);
	}
}