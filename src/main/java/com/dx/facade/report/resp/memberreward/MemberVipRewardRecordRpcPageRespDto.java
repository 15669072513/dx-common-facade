package com.dx.facade.report.resp.memberreward;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 会员vip奖励发放记录表 实体类
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/6/14
 */
@ApiModel(value = "com-ob-vip-resp-MemberVipRewardRecordRpcPageRespDto", description = "会员vip奖励发放记录 返回参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberVipRewardRecordRpcPageRespDto implements Serializable {
	
	@ApiModelProperty(value = "订单号")
	@JsonProperty("bizId")
	private String orderNo;

	@ApiModelProperty(value = "会员账号")
	private String userName;

	@ApiModelProperty(value = "vip等级序号")
	private Integer vipSerialNum;

	@ApiModelProperty(value = "福利类型 1-会员VIP奖励 2-好友邀请")
	private Integer rewardType;
	
	@ApiModelProperty(value = "奖励类型 2-升级礼金;3-生日礼金;4-上半月红包;5-下半月红包")
	private Integer provideType;

	@ApiModelProperty(value = "红利发放方式: 1-系统发放")
	private Integer sendType;

	@ApiModelProperty(value = "红利发送位置: 1-现金钱包 2-红利中心")
	private Integer sendPosition;

	@ApiModelProperty(value = "领取状态（0待领取/1-已领取/2-已过期）")
	private Integer provideStatus;

	@ApiModelProperty(value = "奖励金额")
	private BigDecimal provideAmount;
	
	@ApiModelProperty(value = "发放时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime sendTime;

	@ApiModelProperty(value = "领取时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime provideAt;

	@ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
	private Integer accountType;
	
}