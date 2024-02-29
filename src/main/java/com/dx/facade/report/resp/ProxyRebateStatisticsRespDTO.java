package com.dx.facade.report.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
/**
 * 统计-代理返点统计
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyRebateStatisticsRespDTO{


    @ApiModelProperty(value = "上级代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentProxyId;


    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "货币符号")
    private String currency;

    @ApiModelProperty(value = "报表日期")
    private Integer reportDate;

    @ApiModelProperty(value = "周期名称")
    private String cycleName;

    @ApiModelProperty(value = "返点状态")
    private Integer payoutStatus;
    @ApiModelProperty(value = "返点状态描述")
    private String payoutStatusStr;


    @ApiModelProperty(value = "周期起始日期")
    private Integer cycleStatrtDate;

    @ApiModelProperty(value = "周期结束日期")
    private Integer cycleEndDate;

    @ApiModelProperty(value = "个人返点金额")
    private BigDecimal personRebateAmount;
    @ApiModelProperty(value = "抽水贡献")
    private BigDecimal totalPumpContribution;
    @ApiModelProperty(value = "会员总盈亏(游戏盈亏)")
    private BigDecimal totalNetAmount;
    @ApiModelProperty(value = "团队返点")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "下级返点")
    private BigDecimal childRebateAmount;
    @ApiModelProperty(value = "有效投注")
    private BigDecimal totalValidBetAmount;

    @ApiModelProperty("手牌服务费")
    private BigDecimal serviceChargeHand;

    @ApiModelProperty("局抽服务费")
    private BigDecimal serviceChargeRound;

    @ApiModelProperty(value = "德州俱乐部服务费")
    private BigDecimal dxClubServiceAmount;

    @ApiModelProperty("手牌服务费贡献")
    private BigDecimal serviceChargeHandContribution;

    @ApiModelProperty("局抽服务费贡献")
    private BigDecimal serviceChargeRoundContribution;

    @ApiModelProperty(value = "德州俱乐部服务费贡献")
    private BigDecimal dxClubServiceAmountContribution;

}
