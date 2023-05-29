package com.dx.facade.report.resp.memberreward;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 会员vip奖励领取记录表 实体类
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/6/14
 */
@ApiModel(value = "com.ob.facade.report.resp.memberreward.MemberVipRewardRecordRespDTO", description = "会员会议邀请返回参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberVipRewardRecordRespDTO implements Serializable {

	@ApiModelProperty(value = "商户id")
	private Long merchantId;

	@ApiModelProperty(value = "会员id")
	private Long userId;

	@ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
	private Integer appId;

	@ApiModelProperty(value = "会员账号")
	private String userName;

	@ApiModelProperty(value = "VIP等级名称")
	private String vipName;

	@ApiModelProperty("币种")
	private String currency;

	@ApiModelProperty(value = "vip等级序号")
	private Integer vipSerialNum;

	@ApiModelProperty(value = "账号类型（1-试玩,2-商务,3-正式,4-测试,5-置换）")
	private Integer accountType;

	@ApiModelProperty(value = "标签名称")
	private String labelName;

	@ApiModelProperty(value = "记录日期")
	private Long reportDate;

	@ApiModelProperty(value = "上级代理id")
	private Long parentProxyId;

	@ApiModelProperty(value = "发放类型 福利类型 1-会员VIP奖励时，1-升级礼金;2-生日礼金;3-上半月红包;4-下半月红包 福利类型 2-好友邀请时，1-邀请任务 2-存款任务 3-投注任务")
	private Integer provideType;

	@ApiModelProperty(value = "红利发放类型: 1-系统发放")
	private Integer sendType;

	@ApiModelProperty(value = "福利类型 1-会员VIP奖励 2-好友邀请")
	private Integer rewardType;

	@ApiModelProperty(value = "红利发送位置: 1-中心钱包 2-红利中心 3-B端钱包")
	private Integer sendPosition;

	@ApiModelProperty(value = "发放金额")
	private BigDecimal provideAmount;

	@ApiModelProperty(value = "流水金额")
	private BigDecimal billAmount;

	@ApiModelProperty(value = "业务ID")
	private String bizId;

	@ApiModelProperty(value = "父级代理名称")
	private String parentProxyName;

	@ApiModelProperty(value = "订单号")
	private String orderNo;

	@ApiModelProperty(value = "发送状态（0-待发送/1-已发送/2-发送失败）")
	private Integer sendStatus;

	@ApiModelProperty(value = "发送时间")
	private LocalDateTime sendTime;

	/***
	 * 存款任务非必填，邀请任务和投注任务必填
	 */
	@ApiModelProperty(value = "被邀请人Id")
	private Long inviteesUserId;

	@ApiModelProperty(value = "好友邀请角色类型：0-无效 1-邀请人 2-被邀请人")
	private Integer inviteRuleType;

	@ApiModelProperty(value = "被邀请人账号")
	private String inviteesUserName;
	
}