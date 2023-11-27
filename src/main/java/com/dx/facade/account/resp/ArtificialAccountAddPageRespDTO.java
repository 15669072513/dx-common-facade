package com.dx.facade.account.resp;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 会员人工加额记录表返回参数 分页查询参数封装
 * @author grayson
 */
@Data
public class ArtificialAccountAddPageRespDTO implements Serializable {

	@ApiModelProperty("id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;

	@ApiModelProperty("商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;

	@ApiModelProperty("商户名称")
	private String merchantName;

	@ApiModelProperty("事件id")
	private String eventId;

	@ApiModelProperty("用户id(会员/代理)")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long userId;

	@ApiModelProperty("用户类型(0=会员 1=代理)")
	private Integer userType;

	@ApiModelProperty("账户类别，1-试玩，2-商务，3-正式，4-测试，5-置换")
	private Integer accountType;

	@ApiModelProperty("用户名")
	private String userName;

	@ApiModelProperty("vip等级id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long vipId;

	@ApiModelProperty("vip等级")
	private Integer vipLevel;

	//参见枚举common-facades中ProxyAdjustType
	@ApiModelProperty("调整类型 会员(1-会员存款(后台),2-代客充值,3-会员活动,4-会员返水,5-会员福利,6-存款优惠 7-其他调整,19-官方给代理授信上分,21-官方帮代理信用还款)")
	private Integer adjustType;

	@ApiModelProperty("币种")
	private String currency;

	@ApiModelProperty("钱包类型")
	private Integer walletType;

	@ApiModelProperty("会员活动id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long activityId;

	@ApiModelProperty("活动类型，1=首存活动，2=充值送活动，3=VIP晋级优惠")
	private Integer activityType;

	@ApiModelProperty("福利类型，1会员VIP奖励，2好友邀请")
	private Integer welfareType;

	@ApiModelProperty("奖励类型 (会员VIP奖励：1.上半月红包 2.下半月红包 3.升级礼金 4.生日礼金 )")
	private Integer awardType;

	@ApiModelProperty("调整金额")
	private BigDecimal adjustAmount;

	@ApiModelProperty("流水倍数要求")
	private BigDecimal validMultiple;

	@ApiModelProperty("流水金额要求=(adjust_amount * valid_multiple)")
	private BigDecimal billAmount;

	@ApiModelProperty("申请操作人")
	private String operator;

	@ApiModelProperty("申请操作备注")
	private String remark;

	@ApiModelProperty("订单状态(1=待一审,2=一审审核,3=待二审,4=二审审核,5一审拒绝,6二审拒绝,7=二审通过)")
	private Integer orderStatus;

	@ApiModelProperty("锁单状态(0=未锁单 1=锁单中)")
	private Integer lockStatus;

	@ApiModelProperty("当前锁单时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime lockTime;

	@ApiModelProperty("锁单人id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long lockAccountId;

	@ApiModelProperty("锁单人")
	private String lockAccount;

	@ApiModelProperty("一审审核人")
	private String audit1Operator;

	@ApiModelProperty("一审审核人id")
	private Long audit1AccountId;

	@ApiModelProperty("一审审核结果(1=通过 2=拒绝)")
	private Integer audit1Result;

	@ApiModelProperty("一审审核时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime audit1Time;

	@ApiModelProperty("一审审核备注")
	private String audit1Desc;

	@ApiModelProperty("一审审核时长，秒，锁单到审核完毕的耗时")
	private Integer audit1Cost;

	@ApiModelProperty("二审审核人")
	private String audit2Operator;

	@ApiModelProperty("二审审核人id")
	private Long audit2AccountId;

	@ApiModelProperty("二审审核结果(1=通过 2=拒绝)")
	private Integer audit2Result;

	@ApiModelProperty("二审审核时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime audit2Time;

	@ApiModelProperty("二审审核备注")
	private String audit2Desc;

	@ApiModelProperty("二审审核时长，秒，锁单到审核完毕的耗时")
	private Integer audit2Cost;

	@ApiModelProperty("订单申请时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime createdAt;

	@ApiModelProperty("更新时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime updatedAt;

	@ApiModelProperty(value = "图片地址")
	private String imageAddress;
}