package com.dx.facade.enums;

import java.util.Objects;

/**
 * USDT协议类型：2-TRC20,3-ERC20
 */
public enum UsdtProtocolEnum {
	TRC20(2, "TRC20"),
	ERC20(3, "ERC20");

	private Integer code;
	private String desc;

	UsdtProtocolEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer code() {
		return this.code;
	}

	public String desc() {
		return this.desc;
	}

	public static UsdtProtocolEnum getProtocol(Integer code) {
		if(Objects.equals(code, TRC20.code)) return ERC20;
		if(Objects.equals(code, ERC20.code)) return ERC20;
		throw new IllegalArgumentException("未知USDT协议code:" + code);
	}
}