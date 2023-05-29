package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 功能描述: 会员/代理加款记录审核详情返回结果封装类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArtificialPatchAccountAddDetailRespDTO {
    @ApiModelProperty(value="ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty(value="订单号")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String eventId;

    /**
     * 申请时间
     */
    @ApiModelProperty(value="申请时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime eventTime;

    @ApiModelProperty(value="图片地址")
    private String imageAddress;

    /*******************会员注册信息***************************************************************************/
    /**
     * 注册时间
     */
    @ApiModelProperty(value="注册时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createDt;

    /**
     * 最后登录时间
     */
    @ApiModelProperty(value="最后登录时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime lastLoginTime;

    /**
     * 最后下注时间
     */
    @ApiModelProperty(value="最后下注时间")
    private String lastBetTime;
    /**
     * 注册端--注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP，6-后台）
     */
    @ApiModelProperty(value="注册端--注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP，6-后台）")
    private Integer deviceType;
    /**
     * 注册ip
     */
    @ApiModelProperty(value="注册ip")
    private String registerIp;

    @ApiModelProperty("IP归属地")
    private String ipAttribution;
    /**
     * 注册端设备编号
     */
    @ApiModelProperty(value="注册端设备编号")
    private String deviceNo;
    /**
     * 账户类型
     */
    @ApiModelProperty(value="账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    /**
     * 注册域名
     */
    @ApiModelProperty(value="注册域名")
    private String registerReference;

    /**
     * 上级代理账号
     */
    @ApiModelProperty(value="上级代理账号")
    private String parentProxyName;

/*********************代理层级信息********************************************************************/
    @ApiModelProperty(value = "代理层级ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyLevelId;

    @ApiModelProperty(value = "代理层级")
    private Integer proxyLevel;

/*********************会员账号信息********************************************************************/
    @ApiModelProperty(value="会员Id")
    private Long userId;
    /**
     * 会员账号
     */
    @ApiModelProperty(value="会员账号")
    private String userName;
    /**
     * 会员(真实)姓名
     */
    @ApiModelProperty(value="会员(真实)姓名")
    private String realName;

    /**
     * vip等级id
     */
    @ApiModelProperty(value="vip等级id")
    private Long vipId;

    /**
     * vip等级序号
     */
    @ApiModelProperty(value="vip等级序号")
    private Integer vipLevel;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus;

    @ApiModelProperty(value = "游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;

    /**
     * 会员标签
     */
    @ApiModelProperty(value="会员标签")
    private String labelName;
    /**
     * 备注
     */
    @ApiModelProperty(value="备注")
    private String remark;

    /**
     * 绑定银行卡数量
     */
    @ApiModelProperty(value="绑定银行卡数量")
    private Integer bankCardNum;

    /**
     * 虚拟币账号数量
     */
    @ApiModelProperty(value="虚拟币账号数量")
    private Integer virtualNum;
/***************************账号风控层级**************************************************/
    @ApiModelProperty(value = "风控层级id")
    private Long windControlId;

	@ApiModelProperty(value = "风险会员（代理）")
    private String windControlName;
	
	@ApiModelProperty(value = "风险银行卡")
    private String cardWindControlName = "暂未实现";
	@ApiModelProperty(value = "风险虚拟币")
    private String virtualWindControlName = "暂未实现";
	@ApiModelProperty(value = "风险IP")
    private String ipWindControlName = "暂未实现";
	@ApiModelProperty(value = "风险终端设备")
    private String deviceNoWindControlName = "暂未实现";
/**************************审核详情******************************************************/
    /**
     * 申请人
     */
    @ApiModelProperty(value="申请人")
    private String operator;

    @ApiModelProperty("锁单人id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long lockAccountId;

    /**
     * 申请原因（申请备注）
     */
    @ApiModelProperty(value="申请原因（申请备注）")
    private String operatorRemark;
    /**
     * 调整类型(枚举)
     */
    @ApiModelProperty(value="调整类型")
    private Integer adjustType;

    @ApiModelProperty("币种")
    private String currency;

    @ApiModelProperty(value="增加金额")
    private BigDecimal adjustAmount;

    @ApiModelProperty("钱包类型")
    private Integer walletType;

    @ApiModelProperty("会员活动id")
    private Long activityId;

    @ApiModelProperty("活动类型，1=首存活动，2=充值送活动，3=VIP晋级优惠")
    private Integer activityType;

    @ApiModelProperty("福利类型，1会员VIP奖励，2好友邀请")
    private Integer welfareType;

    @ApiModelProperty("奖励类型 (会员VIP奖励：1.上半月红包 2.下半月红包 3.升级礼金 4.生日礼金 )")
    private Integer awardType;

    @ApiModelProperty("流水倍数要求")
    private BigDecimal validMultiple;

    
/********************审核信息******************************************************************/
    @ApiModelProperty("一审审核人")
    private String audit1Operator;

    @ApiModelProperty("一审审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit1Result;

    @ApiModelProperty("一审审核时间")
    private LocalDateTime audit1Time;

    @ApiModelProperty("一审审核备注")
    private String audit1Desc;

    @ApiModelProperty("一审审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit1Cost;

    @ApiModelProperty("二审审核人")
    private String audit2Operator;

    @ApiModelProperty("二审审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit2Result;

    @ApiModelProperty("二审审核时间")
    private LocalDateTime audit2Time;

    @ApiModelProperty("二审审核备注")
    private String audit2Desc;

    @ApiModelProperty("二审审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit2Cost;
	
	@ApiModelProperty(value="信用等级")
	private Integer creditLevel;

}
