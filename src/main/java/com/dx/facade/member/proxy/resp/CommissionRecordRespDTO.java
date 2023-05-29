package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 佣金账目审核
 */
@Builder
@Data
public class CommissionRecordRespDTO {

    @ApiModelProperty(value = "佣金记录id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "游戏亏损")
    private BigDecimal totalNetAmount;

    @ApiModelProperty(value = "游戏流水")
    private BigDecimal totalBetAmount;

    @ApiModelProperty(value = "币种")
    private String  currency;

    /**
     * 活跃下级
     */
    @ApiModelProperty(value = "活跃下级")
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer activeSubordinate;

    /**
     * 有效活跃下级
     */
    @ApiModelProperty(value = "有效活跃下级")
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer effectivelyActiveSubordinates;

    /**
     * 新增活跃下级
     */
    @ApiModelProperty(value = "新增活跃下级")
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer addActiveSubordinates;

    /**
     * 新增有效活跃下级
     */
    @ApiModelProperty(value = "新增有效活跃下级")
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer addEffectiveActiveSubordinates;

    /**
     * 代理等级
     */
    @ApiModelProperty(value = "代理等级")
    private String  proxyLevel;


    @ApiModelProperty(value = "佣金契约ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long contractId;

    @ApiModelProperty(value = "佣金契约等级序号")
    private Integer contractLevel;

    @ApiModelProperty(value = "专享比例id")
    private Integer exclusiveId;

    ////////////////////////////////////////////////////////

    /**
     * 日期
     */
    @ApiModelProperty(value = "日期")
    private Integer reportDate ;

    /**
     * 总输赢
     */
    @ApiModelProperty(value = "总输赢")
    private BigDecimal totalWinLossAmount;

    /**
     * 场馆费
     */
    @ApiModelProperty(value = "场馆费")
    private BigDecimal totalPlatformAmount;

    /**
     * 总返水
     */
    @ApiModelProperty(value = "总返水")
    private BigDecimal totalBackAmount;


    /**
     * 总优惠
     */
    @ApiModelProperty(value = "总优惠")
    private BigDecimal totalActivityAmount;

    /**
     * 账户调整
     */
    @ApiModelProperty(value = "账户调整")
    private BigDecimal totalAdjustAmount;

    /**
     * 总返点
     */
    @ApiModelProperty(value = "总返点")
    private BigDecimal totalRebateAmount;

    /**
     * 代理净输赢
     */
    @ApiModelProperty(value = "代理净输赢")
    private BigDecimal totalPureAmount;

    /**
     * 上月结余
     */
    @ApiModelProperty(value = "上月结余")
    private BigDecimal totalLastAmount;

    /**
     * 冲正后净输赢
     */
    @ApiModelProperty(value = "冲正后净输赢")
    private BigDecimal totalRushAmount;

    /**
     * 佣金比例
     */
    @ApiModelProperty(value = "佣金比例")
    private BigDecimal commissionRate;


    /**
     * 返佣金额
     */
    @ApiModelProperty(value = "返佣金额")
    private BigDecimal totalCommission;

    /**
     * 专享比例
     */
    @ApiModelProperty(value = "等级专享比例")
    private BigDecimal exclusiveRatio;

    /**
     * 等级专享佣金
     */
    @ApiModelProperty(value = "等级专享佣金")
    private BigDecimal rewardAmount;

    @ApiModelProperty(value = "个人佣金")
    private BigDecimal totalPersonCommissionAmount;

    @ApiModelProperty(value = "下级总佣金")
    private BigDecimal totalChildCommissionAmount;

    @ApiModelProperty(value = "团队总佣金")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "佣金调整")
    private BigDecimal adjustCommissionAmount;

}
