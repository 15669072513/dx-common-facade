package com.dx.facade.report.resp.report;

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
 * @description 代理返佣结算表
 * @date 2023-09-26
 * 数据来源：dx_settlement_commission_proxy_record
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "团队返佣数据", description = "团队返佣数据")
public class DxSettlementCommissionProxyRecordRspDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty("id")
    private Long id;

    /**
     * 报表日期
     */
    @ApiModelProperty("报表日期")
    private Integer reportYm;

    /**
     * 周期类型: 1-天 2-周 3-月
     */
    @ApiModelProperty("周期类型: 1-天 2-周 3-月")
    private int cycleType;

    /**
     * 周期名称 - 结算期数
     */
    @ApiModelProperty("周期名称 - 结算期数")
    private String cycleName;

    /**
     * 周期起始日期
     */
    @ApiModelProperty("周期起始日期")
    private Integer cycleStartDate;

    /**
     * 周期结束日期
     */
    @ApiModelProperty("周期结束日期")
    private Integer cycleEndDate;

    /**
     * 订单号
     */
    @ApiModelProperty("订单号")
    private String orderNo;

    /**
     * 代理id
     */
    @ApiModelProperty("代理id")
    private Long proxyId;

    /**
     * 代理账号
     */
    @ApiModelProperty("代理账号")
    private String proxyName;
    /**
     * 代理层级
     */
    @ApiModelProperty("代理层级")
    private Long proxyLevel;

    /**
     * windControlName
     */
    @ApiModelProperty(value = "风控层级名称")
    private String windControlName;


    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus;

    /**
     * 商户id
     */
    @ApiModelProperty("商户id")
    private Long merchantId;

    /**
     * 商户名称
     */
    @ApiModelProperty("商户名称")
    private String merchantName;

    /**
     * 上级代理id
     */
    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    /**
     * 上级代理账号
     */
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    /**
     * 总代id
     */
    @ApiModelProperty("总代id")
    private Long topProxyId;
    /**
     * 总代账号
     */
    @ApiModelProperty("总代账号")
    private String topProxyName;

    /**
     * 币种
     */
    @ApiModelProperty("币种")
    private String currency;

    /**
     * 团队返佣金额
     */
    @ApiModelProperty("团队返佣金额    ->   已发放返佣=commissionAmount-commissionPayAmount")
    private BigDecimal commissionAmount;

    /**
     * 佣金调整金额
     */
    @ApiModelProperty("佣金调整金额")
    private BigDecimal commissionAdjustAmount;

    /**
     * 佣金后台调整加额
     */
    @ApiModelProperty("佣金后台调整加额")
    private BigDecimal commissionAdjustBackAddAmount;

    /**
     * 佣金后台调整减额
     */
    @ApiModelProperty("佣金后台调整减额")
    private BigDecimal commissionAdjustBackSubAmount;

    /**
     * 已支付金额
     */
    @ApiModelProperty("已支付金额 ->已发放返佣=commissionAmount-commissionPayAmount")
    private BigDecimal commissionPayAmount;

    /**
     * 上月结余
     */
    @ApiModelProperty("上月结余")
    private BigDecimal commissionLastAmount;

    /**
     * 冲正后净输赢
     */
    @ApiModelProperty("冲正后净输赢")
    private BigDecimal rushAmount;

    /**
     * 个人返佣金额
     */
    @ApiModelProperty("个人返佣金额")
    private BigDecimal personCommissionAmount;

    /**
     * 下级返佣金额
     */
    @ApiModelProperty("下级返佣金额")
    private BigDecimal childCommissionAmount;

    /**
     * 直属会员返点金额
     */
    @ApiModelProperty("直属会员返点金额")
    private Long memberRebateAmount;

    /**
     * 会员返点调整添加金额
     */
    @ApiModelProperty("会员返点调整添加金额")
    private BigDecimal memberRebateAddAmount;

    /**
     * 会员返点调整减少金额
     */
    @ApiModelProperty("会员返点调整减少金额")
    private BigDecimal memberRebateSubAmount;

    /**
     * 单量
     */
    @ApiModelProperty("单量")
    private Long betCount;

    /**
     * 投注额
     */
    @ApiModelProperty("投注额")
    private BigDecimal betAmount;
    /**
     * 有效投注额
     */
    @ApiModelProperty("有效投注额")
    private BigDecimal validBetAmount;

    /**
     * 活跃用户
     */
    @ApiModelProperty("活跃用户")
    private Long activeMemberNum;

    /**
     * 有效用户
     */
    @ApiModelProperty("有效用户")
    private Long effecactiveM0emberNum;

    /**
     * 总代返佣中控审核，非总代默认二审通过
     * 审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过
     */
    @ApiModelProperty("审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过,代返佣中控审核，非总代默认二审通过")
    private Integer orderStatus;

    /**
     */
    @ApiModelProperty("返佣状态(0-未结算 1=已结算（数据不会在进行统计变动） 2-待发放  3-已发放 ,4，已过期(返佣废弃当前状态)，5：无返佣 6-已取消)")
    private Integer payoutStatus;

    /**
     * 派发时间
     */
    @ApiModelProperty("派发时间")
    private LocalDateTime payoutTime;

    /**
     * 领取时间
     */
    @ApiModelProperty("领取时间")
    private LocalDateTime reciveDate;

    /**
     * 锁单状态(0=未锁单 1=锁单中)
     */
    @ApiModelProperty("锁单状态(0=未锁单 1=锁单中)")
    private int lockStatus;

    /**
     * 当前锁单时间
     */
    @ApiModelProperty("当前锁单时间")
    private LocalDateTime lockTime;

    /**
     * 锁单账号id
     */
    @ApiModelProperty("锁单账号id")
    private Long lockAccountId;

    /**
     * 锁单账号
     */
    @ApiModelProperty("锁单账号")
    private String lockAccount;

    /**
     * 审核1账号id
     */
    @ApiModelProperty("审核1账号id")
    private Long audit1OperatorId;

    /**
     * 审核账号
     */
    @ApiModelProperty("审核账号")
    private String audit1Operator;

    /**
     * 审核结果(0=未处理 1=通过 2=拒绝)
     */
    @ApiModelProperty("审核结果(0=未处理 1=通过 2=拒绝)")
    private int audit1Result;

    /**
     * 审核时间
     */
    @ApiModelProperty("审核时间")
    private LocalDateTime audit1Time;

    /**
     * 审核备注1
     */
    @ApiModelProperty("审核备注1")
    private String audit1Desc;

    /**
     * 审核时长，秒，锁单到审核完毕的耗时
     */
    @ApiModelProperty("审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit1Cost;

    /**
     * 审核2账号id
     */
    @ApiModelProperty("审核2账号id")
    private Long audit2OperatorId;

    /**
     * 审核账号
     */
    @ApiModelProperty("审核账号")
    private String audit2Operator;

    /**
     * 审核结果(0=未处理 1=通过 2=拒绝)
     */
    @ApiModelProperty("审核结果(0=未处理 1=通过 2=拒绝)")
    private int audit2Result;

    /**
     * 审核时间
     */
    @ApiModelProperty("审核时间")
    private LocalDateTime audit2Time;

    /**
     * 审核备注2
     */
    @ApiModelProperty("审核备注2")
    private String audit2Desc;

    /**
     * 审核时长，秒，锁单到审核完毕的耗时
     */
    @ApiModelProperty("审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit2Cost;

    /**
     * 报表创建时间
     */
    @ApiModelProperty("报表创建时间")
    private LocalDateTime createdAt;

}