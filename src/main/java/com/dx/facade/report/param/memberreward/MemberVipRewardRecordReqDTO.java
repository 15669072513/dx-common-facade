package com.dx.facade.report.param.memberreward;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
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
@ApiModel(value = "com-ob-vip-req-MemberVipRewardRecordRpcPageReqDto", description = "会员vip奖励领取记录 请求参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberVipRewardRecordReqDTO implements Serializable {


	@NotNull
	@ApiModelProperty(value = "会员id")
	private Long userId;

	@NotNull
	@ApiModelProperty(value = "记录日期")
	private Long reportDate;

	@NotNull
	@ApiModelProperty(value = "发放类型 福利类型 1-会员VIP奖励时，1-升级礼金;2-生日礼金;3-上半月红包;4-下半月红包 福利类型 2-好友邀请时，1-邀请任务 2-存款任务 3-投注任务")
	private Integer provideType;

	@NotNull
	@ApiModelProperty(value = "红利发放类型: 1-系统发放")
	private Integer sendType;

	@NotNull
	@ApiModelProperty(value = "福利类型 1-会员VIP奖励 2-好友邀请")
	private Integer rewardType;

	@NotNull
	@ApiModelProperty(value = "红利发送位置: 1-现金钱包 2-红利中心 3-B端钱包")
	private Integer sendPosition;

	@NotNull
	@ApiModelProperty(value = "发放金额")
	private BigDecimal provideAmount;

	@NotEmpty
	@ApiModelProperty(value = "订单号")
	private String orderNo;

	@NotNull
	@ApiModelProperty(value = "发送时间")
	private LocalDateTime sendTime;

	@NotNull
	@ApiModelProperty(value = "流水金额")
	private BigDecimal billAmount;

	/***
	 * 存款任务非必填，邀请任务和投注任务必填
	 */
	@ApiModelProperty(value = "好友邀请角色类型：0-无效 1-邀请人 2-被邀请人")
	private Integer inviteRuleType;

	/***
	 * 存款任务非必填，邀请任务和投注任务必填
	 */
	@ApiModelProperty(value = "被邀请人Id")
	private Long inviteesUserId;

	/***
	 * 存款任务非必填，邀请任务和投注任务必填
	 */
	@ApiModelProperty(value = "被邀请人账号")
	private String inviteesUserName;

}