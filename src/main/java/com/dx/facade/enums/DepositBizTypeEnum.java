package com.dx.facade.enums;

import java.util.Objects;

/**
 * 存款BizType类型
 */
public enum DepositBizTypeEnum {
	会员存款(1, "会员存款"),
	佣金充值(6, "佣金充值"),
	额度充值(7, "额度充值"),
	代理存款(17, "代理存款");

	private Integer code;
	private String desc;

	DepositBizTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer code() {
		return this.code;
	}

	public String desc() {
		return this.desc;
	}

	public static DepositBizTypeEnum getType(Integer code) {
		if(Objects.equals(code, 会员存款.code)) return 会员存款;
		if(Objects.equals(code, 佣金充值.code)) return 佣金充值;
		if(Objects.equals(code, 额度充值.code)) return 额度充值;
		if(Objects.equals(code, 代理存款.code)) return 代理存款;
		throw new IllegalArgumentException("未知bizType的code:" + code);
	}
}