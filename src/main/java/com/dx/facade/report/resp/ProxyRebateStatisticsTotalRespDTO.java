package com.dx.facade.report.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 统计-会员返水统计
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyRebateStatisticsTotalRespDTO {


    /**
     * 代理层级名称
     */
    @ApiModelProperty("代理层级名称-查询条件有proxyName时返回数据")
    private List<String> proxyPathName ;

    @ApiModelProperty(value = "个人返点金额")
    private BigDecimal personRebateAmount =BigDecimal.ZERO;

    @ApiModelProperty(value = "团队返点")
    private BigDecimal rebateAmount  =BigDecimal.ZERO;;

    @ApiModelProperty(value = "下级返点")
    private BigDecimal childRebateAmount  =BigDecimal.ZERO;;


    @ApiModelProperty(value = "抽水贡献")
    private BigDecimal totalPumpContribution = BigDecimal.ZERO;
    @ApiModelProperty(value = "会员总盈亏(游戏盈亏)")
    private BigDecimal totalNetAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "有效投注")
    private BigDecimal totalValidBetAmount = BigDecimal.ZERO;

    @ApiModelProperty("服务费-手牌")
    private BigDecimal serviceChargeHand;

    @ApiModelProperty("服务费-局抽")
    private BigDecimal serviceChargeRound;

    @ApiModelProperty(value = "德州俱乐部服务费贡献")
    private BigDecimal dxClubServiceAmount;
}
