package com.dx.facade.report.resp;

import com.alibaba.excel.annotation.ExcelProperty;
import com.dx.annotation.I18nField;
import com.fasterxml.jackson.annotation.JsonFormat;
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
 @title 总代佣金记录分页接口响应数据传输对象
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年09月27日 23:08:26
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("总代佣金记录分页接口响应数据传输对象")
public class FundsGeneralProxyCommissionRecordListRespDTO implements Serializable {

    @ApiModelProperty(value = "币种")
    private String currency;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "客户端状态 (0-已取消 1-已发放 2-无佣金)")
    private Integer payoutStatus;

    @ApiModelProperty(value = "月份")
    private Integer reportYm;

    @ApiModelProperty(value = "所属商户")
    private String merchantName;

    @ApiModelProperty(value = "代理类型（1-试玩，2-商务，3-正式，4-测试，5-置换 ）")
    private Integer accountType;

    @ApiModelProperty(value = "账号状态")
    private Integer accountStatus;

    @ApiModelProperty(value = "风控层级")
    private Integer windControlLevel;

    @ApiModelProperty(value = "风控层级名称")
    private String windControlName;

    @ApiModelProperty(value = "上级代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentProxyId;

    @ApiModelProperty(value = "代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    @ApiModelProperty(value = "代理层级ID")
    private Integer proxyLevelId;

    @ApiModelProperty(value = "代理层级名称")
    private String proxyLevelName;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "代理佣金")
    private BigDecimal commissionOnlyAmount;

    @ApiModelProperty(value = "代理账号")
    private String proxyAccount;

    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 3-二审通过")
    private Integer orderStatus;

    @ApiModelProperty(value = "锁单状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;

    @ApiModelProperty(value = "当前锁单时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lockTime;

    @ApiModelProperty(value = "当前锁单账号")
    private String lockAccount;

    @ApiModelProperty(value = "报表日期，每月一条")
    private Integer reportDate;

    @ApiModelProperty(value = "会员总输赢")
    private BigDecimal totalNetAmount;

    @ApiModelProperty(value = "场馆费")
    private BigDecimal totalPlatformAmount;

    @ApiModelProperty(value = "会员总优惠")
    private BigDecimal totalDiscountAmount;

    @ApiModelProperty(value = "会员VIP红包")
    private BigDecimal totalVipRedpackAmount;

    @ApiModelProperty(value = "会员VIP升级奖励")
    private BigDecimal totalVipUpgradeAmount;

    @ApiModelProperty(value = "会员VIP生日奖励")
    private BigDecimal totalVipBirthdayAmount;

    @ApiModelProperty(value = "会员VIP活动优惠")
    private BigDecimal totalVipActiveAmount;

    @ApiModelProperty(value = "会员VIP首存优惠")
    private BigDecimal totalVipFirstDepositAmount;

    @ApiModelProperty(value = "会员VIP存款优惠")
    private BigDecimal totalVipDepositAmount;

    @ApiModelProperty(value = "会员返水")
    private BigDecimal totalRebateAmount;

    @ApiModelProperty(value = "会员账号调整")
    private BigDecimal totalAdjustAmount;

    @ApiModelProperty(value = "补单输赢")
    private BigDecimal totalPatchNetAmount;

    @ApiModelProperty(value = "代理净输赢")
    private BigDecimal totalPureAmount;

    @ApiModelProperty(value = "上月结余")
    private BigDecimal totalLastAmount;

    @ApiModelProperty(value = "冲正后净输赢")
    private BigDecimal totalRushAmount;

    @ApiModelProperty(value = "本月活跃用户")
    private Integer monthActiveNum;

    @ApiModelProperty(value = "本月活跃用户")
    private Integer monthActiveNumNew;

    @ApiModelProperty(value = "本月有效活跃用户数")
    private Integer monthEffecactiveNum;

    @ApiModelProperty(value = "本月新增有效活跃用户数")
    private Integer monthEffecactiveNumNew;

    @ApiModelProperty(value = "流水纠正金额")
    private BigDecimal betAdjustAmount;

    @ApiModelProperty(value = "会员游戏流水金额")
    private BigDecimal totalBetAmount;

    @ApiModelProperty(value = "会员有效游戏流水金额")
    private BigDecimal totalValidBetAmount;

    @ApiModelProperty(value = "会员游戏注单量")
    private Integer totalBetNum;

    @ApiModelProperty(value = "会员游戏人数")
    private Integer totalBetMemberNum;

    @ApiModelProperty(value = "代理总返点金额")
    private BigDecimal totalProxyRebateAmount;

    @ApiModelProperty(value = "佣金比例")
    private BigDecimal commissionRate;

    @ApiModelProperty(value = "代理VIP等级专享层级比例")
    private BigDecimal proxyVipLevelRate;

    @ApiModelProperty(value = "等级专享佣金")
    private BigDecimal rewardAmount;

    @ApiModelProperty(value = "团队总拥金")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "预计佣金加减金额")
    private BigDecimal adjustCommissionAmount;

    @ApiModelProperty(value = "佣金契约ID")
    private Integer contractId;

    @ApiModelProperty(value = "佣金契约等级序号")
    private Integer contractLevel;

    @ApiModelProperty(value = "代理VIP等级专享层级ID")
    private Integer proxyVipLevel;

    @ApiModelProperty(value = "代理VIP等级专享层级名称")
    private Integer proxyVipLevelName;

    @ApiModelProperty(value = "个人佣金")
    private BigDecimal totalPersonCommissionAmount;

    @ApiModelProperty(value = "下级总佣金")
    private BigDecimal totalChildCommissionAmount;

    @ApiModelProperty(value = "剩余未收金额")
    private Integer notRecviedAmount;

    @ApiModelProperty(value = "剩余未付金额")
    private Integer notPayAmount;

    @ApiModelProperty(value = "实际收益金额")
    private Integer realPersonCommissionAmount;

    @ApiModelProperty(value = "报表创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "派发时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime payoutTime;

    @ApiModelProperty(value = "审核账号")
    private String audit1Operator;

    @ApiModelProperty(value = "审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit1Result;

    @ApiModelProperty(value = "审核时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime audit1Time;

    @ApiModelProperty(value = "审核备注")
    @I18nField
    private String audit1Desc;

    @ApiModelProperty(value = "审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit1Cost;

    @ApiModelProperty(value = "审核账号")
    private String audit2Operator;

    @ApiModelProperty(value = "审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit2Result;

    @ApiModelProperty(value = "审核时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime audit2Time;

    @ApiModelProperty(value = "审核备注")
    @I18nField
    private String audit2Desc;

    @ApiModelProperty(value = "审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit2Cost;
}
