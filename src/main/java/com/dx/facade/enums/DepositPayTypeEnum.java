package com.dx.facade.enums;

import java.util.Objects;

/**
 * 存款支付类型：1-银行卡,2-虚拟币
 */
public enum DepositPayTypeEnum {
	银行卡支付(1, "银行卡支付"),
	虚拟币支付(2, "虚拟币支付");

	private Integer code;
	private String desc;

	DepositPayTypeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer code() {
		return this.code;
	}

	public String desc() {
		return this.desc;
	}

	public static DepositPayTypeEnum getType(Integer code) {
		if(Objects.equals(code, 银行卡支付.code)) return 银行卡支付;
		if(Objects.equals(code, 虚拟币支付.code)) return 虚拟币支付;
		throw new IllegalArgumentException("未知USDT协议code:" + code);
	}
}