package com.dx.facade.common;

import com.dx.tools.SnowFlakeUtil;
import com.dx.facade.common.utils.DateUtils;
import com.dx.facade.constant.Constants;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

/**
 * 统一生成订单号
 */
public class OrderNoUtils {
	
	/**
	 * 订单号枚举
	 */
	public enum OrderNoType {
		//存款相关订单号
		DEPOSIT("SF", "会员/代理其他方式存款订单号"),
		DEPOSIT_BANK("RK", "会员银行卡方式存款订单号"),
		DEPOSIT_SPEED("HRK", "会员极速方式存款订单号"),
		DEPOSIT_ARTIFICIAL_ADD("DK", "会员/代理人工加额(后台存款)订单号"),
		DEPOSIT_DISCOUNT("CB", "存款优惠订单号"),
		//提款相关订单号
		WITHDRAW_MEMBER("WD", "会员提款订单号"),
		WITHDRAW_PROXY_BANK("WT", "代理银行卡提款订单号"),
		WITHDRAW_PROXY_VIRTUAL("VC", "代理虚拟币提款订单号"),
		//其他
		MEMBER_ARTIFICIAL("CR", "会员人工加额(加额不包含后台存款)/减额订单号"),
		PROXY_ARTIFICIAL("PR", "代理人工加额(加额不包含后台存款)/减额订单号"),
		
		MEMBER_TRANSFER("CZ", "会员转账订单号"),
		MEMBER_REBATE("CF", "返水订单号"),
		MEMBER_ACTIVITY("CH", "会员活动订单号"),
		VIP_REWARD("CV", "VIP奖励发放订单号"),
		PROXY_TRANSFER("PZ", "代理转账订单号"),
		PROXY_VALET_DEPOSIT("PD", "代理代存订单号"),
		BACK_CENTER("PT", "转回中心钱包订单号"),
		PROXY_COMMISSION("PY", "佣金收付订单号"),
		PROXY_TOP_COMMISSION("PY", "总代佣金订单号"),
		PROXY_UN_TOP_COMMISSION("PY", "非总代佣金订单号"),
		PROXY_REBATE("PF", "返点订单号"),
		
		//以下是JAV的订单号
		JAV_COIN_ORDER("JAVC", "JAV金币消费订单号"),
		JAV_COIN_DEPOSIT("SF", "JAV金币充值订单号"),
		JAV_ADD_MOVIE("JAVA", "JAV人工加额观影券订单号"),
		JAV_ADD_COIN_DEPOSIT("DK", "JAV人工加额金币人工充值订单号"),
		JAV_ADD_COIN_OTHER("CR", "JAV人工加额金币非人工充值订单号"),
		JAV_SUB_MOVIE("JAVR", "JAV人工减额观影券订单号"),
		JAV_SUB_COIN("CR", "JAV人工减额金币订单号"),
		JAV_COIN_MOVIE("JAVG", "JAV金币观影订单号"),
		JAV_TICKET_MOVIE("JAVM", "JAV观影券观影订单号"),
		
		//私庄钱包相关订单号
		BANKER_QUOTA_TRANSFER_IN("QD", "额度钱包划拨到私庄钱包订单号"),
		BANKER_COMMISSION_TRANSFER_IN("CD", "佣金钱包划拨到私庄钱包订单号"),
		BANKER_COMMISSION_TRANSFER_OUT("DC", "私庄钱包划拨到佣金钱包订单号"),
		
		//以下是CBD的订单号
		CBD_ADD("CBDJE", "CB人工加额订单号"),
		CBD_SUB("CBDKE", "CBD人工扣额订单号"),

		BW_CZ("BWCZ", "包网充值订单号"),
		
		
		BW_MEMBER_EDIT_AUDIT("s", "用户资料修改审核订单号"),
		BW_MEMBER_BILL_ADJUST("EDMB", "用户提款流水扔调整订单号"),
		BW_MEMBER_AUDIT("s", "用户新增审核"),
		;
		
		
		public String prefix;
		public String remark;
		
		OrderNoType(String prefix, String remark) {
			this.prefix = prefix;
			this.remark = remark;
		}
		
		public String getPrefix() {
			return prefix;
		}
		
		public String getRemark() {
			return remark;
		}
	}
	
	public static String getOrderNo(OrderNoType orderNoType) {
		return orderNoType.getPrefix() + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMM")) + SnowFlakeUtil.newNextId();
	}
	
	
	/**
	 * @return 审核单号
	 */
	public static String getAuditNum() {
		return "s" + DateUtils.getDateNum(new Date()) + new Random().nextInt(Constants.AUDIT_NUM_BOUND);
	}
}
