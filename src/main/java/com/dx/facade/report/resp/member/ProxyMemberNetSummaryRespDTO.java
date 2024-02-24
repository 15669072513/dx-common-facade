package com.dx.facade.report.resp.member;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyMemberNetSummaryRespDTO {

    @ApiModelProperty("总投笔数")
    private Long betCount;
    @ApiModelProperty("总投")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("游戏盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty("返水金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty("会员优惠")
    private BigDecimal discountAmount;

    @ApiModelProperty("账户调整")
    private BigDecimal artificialPatchAmount;

    @ApiModelProperty("总盈亏")
    private BigDecimal totalNetAmount;

    @ApiModelProperty("平台返水金额")
    private BigDecimal platformRebateAmount;

    @ApiModelProperty("代理返水金额")
    private BigDecimal proxyRebateAmount;

    @ApiModelProperty("不包含德州的有效投注")
    private BigDecimal validBetAmountNoDx = BigDecimal.ZERO;

    @ApiModelProperty("包含所有的游戏盈亏")
    private BigDecimal netAmountAll = BigDecimal.ZERO;

    @ApiModelProperty("包含所有计算的盈亏")
    private BigDecimal netWinAmountAll = BigDecimal.ZERO;

    @ApiModelProperty("德州俱乐部服务费贡献")
    private BigDecimal dxClubServiceAmount = BigDecimal.ZERO;

    //======小计
    @ApiModelProperty("总投-小计")
    private BigDecimal betAmountSub = BigDecimal.ZERO;

    @ApiModelProperty("有效投注-小计")
    private BigDecimal validBetAmountSub = BigDecimal.ZERO;

    @ApiModelProperty("游戏盈亏-小计")
    private BigDecimal netAmountSub = BigDecimal.ZERO;

    @ApiModelProperty("返水金额-小计")
    private BigDecimal rebateAmountSub = BigDecimal.ZERO;

    @ApiModelProperty("会员优惠-小计")
    private BigDecimal discountAmountSub = BigDecimal.ZERO;

    @ApiModelProperty("账户调整-小计")
    private BigDecimal artificialPatchAmountSub = BigDecimal.ZERO;

    @ApiModelProperty("总盈亏-小计")
    private BigDecimal totalNetAmountSub = BigDecimal.ZERO;

    @ApiModelProperty("平台返水金额-小计")
    private BigDecimal platformRebateAmountSub = BigDecimal.ZERO;

    @ApiModelProperty("代理返水金额-小计")
    private BigDecimal proxyRebateAmountSub = BigDecimal.ZERO;

    @ApiModelProperty("不包含德州的有效投注-小计")
    private BigDecimal validBetAmountNoDxSub = BigDecimal.ZERO;

    @ApiModelProperty("包含所有的游戏盈亏-小计")
    private BigDecimal netAmountAllSub = BigDecimal.ZERO;

    @ApiModelProperty("包含所有计算的盈亏-小计")
    private BigDecimal netWinAmountAllSub = BigDecimal.ZERO;

    @ApiModelProperty("德州俱乐部服务费贡献-小计")
    private BigDecimal dxClubServiceAmountSub = BigDecimal.ZERO;
}
