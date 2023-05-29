package com.dx.facade.payment.typay;

import com.dx.facade.common.OrderNoUtils;

/**
 * 常量类 - 天下支付充值方式编码
 *
 * @author: hirty
 * @create: 2021/06/15
 */
public enum TyPayType {

	银行卡转账(1, "银行卡转账", OrderNoUtils.OrderNoType.DEPOSIT_BANK),
	网银转公账号(11, "网银转公账号", OrderNoUtils.OrderNoType.DEPOSIT),
	支付宝转银行卡(110, "支付宝转银行卡", OrderNoUtils.OrderNoType.DEPOSIT_SPEED),
	银行卡大额充值(112, "银行卡大额充值", OrderNoUtils.OrderNoType.DEPOSIT_SPEED),
	云闪付转银行卡(113, "云闪付转银行卡", OrderNoUtils.OrderNoType.DEPOSIT_SPEED),
	支付宝H5转银行卡(114, "支付宝H5转银行卡", OrderNoUtils.OrderNoType.DEPOSIT),
	微信转卡(115, "微信转卡", OrderNoUtils.OrderNoType.DEPOSIT_SPEED),
	京东金融支付(116, "京东金融支付", OrderNoUtils.OrderNoType.DEPOSIT_SPEED),
	银联代付(200, "银联代付", OrderNoUtils.OrderNoType.DEPOSIT),
	快捷支付(212, "快捷支付", OrderNoUtils.OrderNoType.DEPOSIT),
	银联扫码(213, "银联扫码", OrderNoUtils.OrderNoType.DEPOSIT),
	网银支付(214, "网银支付", OrderNoUtils.OrderNoType.DEPOSIT),
	微信扫码(312, "微信扫码", OrderNoUtils.OrderNoType.DEPOSIT),
	微信H5(313, "微信H5", OrderNoUtils.OrderNoType.DEPOSIT),
	支付宝H5(410, "支付宝H5", OrderNoUtils.OrderNoType.DEPOSIT),
	支付宝扫码(411, "支付宝扫码", OrderNoUtils.OrderNoType.DEPOSIT),
	QQ扫码(511, "QQ扫码", OrderNoUtils.OrderNoType.DEPOSIT),
	QQH5(512, "QQH5", OrderNoUtils.OrderNoType.DEPOSIT),
	京东扫码(610, "京东扫码", OrderNoUtils.OrderNoType.DEPOSIT),
	云闪付(710, "云闪付", OrderNoUtils.OrderNoType.DEPOSIT),
	极速支付宝(910, "极速支付宝", OrderNoUtils.OrderNoType.DEPOSIT),
	极速微信(911, "极速微信", OrderNoUtils.OrderNoType.DEPOSIT),
	极速转卡(912, "极速转卡", OrderNoUtils.OrderNoType.DEPOSIT_SPEED),
	银行卡转卡非固定金额(913, "银行卡转卡非固定金额", OrderNoUtils.OrderNoType.DEPOSIT),
	抖音红包(1000, "抖音红包", OrderNoUtils.OrderNoType.DEPOSIT),
	三方银行卡转帐(2010, "三方银行卡转帐", OrderNoUtils.OrderNoType.DEPOSIT),
	三方支付宝转卡(2020, "三方支付宝转卡", OrderNoUtils.OrderNoType.DEPOSIT),
	三方大额充值(2030, "三方大额充值", OrderNoUtils.OrderNoType.DEPOSIT),
	三方银行卡转账信息(2040, "三方银行卡转账信息", OrderNoUtils.OrderNoType.DEPOSIT),
	三方云闪付转卡(2050, "三方云闪付转卡", OrderNoUtils.OrderNoType.DEPOSIT),
	小额银行卡转卡(2060, "小额银行卡转卡", OrderNoUtils.OrderNoType.DEPOSIT_BANK),

	USDT扫码(2110, "USDT扫码", OrderNoUtils.OrderNoType.DEPOSIT),
	虚拟币充值(2120, "虚拟币充值", OrderNoUtils.OrderNoType.DEPOSIT),
	转币交易(2130, "转币交易", OrderNoUtils.OrderNoType.DEPOSIT),
	币汇虚拟币(2140, "币汇虚拟币", OrderNoUtils.OrderNoType.DEPOSIT),
	易币付虚拟币(2150, "易币付虚拟币", OrderNoUtils.OrderNoType.DEPOSIT),
	直连二维码(2160, "直连二维码", OrderNoUtils.OrderNoType.DEPOSIT),
	卡密支付(2170, "卡密支付", OrderNoUtils.OrderNoType.DEPOSIT),
	数字人民币(2220, "数字人民币", OrderNoUtils.OrderNoType.DEPOSIT),
	ebpay支付扫码(2182, "ebpay支付扫码", OrderNoUtils.OrderNoType.DEPOSIT),
	;

	public Integer code;
	public String desc;
	public OrderNoUtils.OrderNoType orderNoType;

	TyPayType(Integer code, String desc, OrderNoUtils.OrderNoType orderNoType) {
		this.code = code;
		this.desc = desc;
		this.orderNoType = orderNoType;
	}

	public static TyPayType getCode(int code) {
		for (TyPayType tyPayType : TyPayType.values()) {
			if (tyPayType.getCode() == code) {
				return tyPayType;
			}
		}
		return 银行卡转账;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public OrderNoUtils.OrderNoType getOrderNoType() {
		return orderNoType;
	}

}
