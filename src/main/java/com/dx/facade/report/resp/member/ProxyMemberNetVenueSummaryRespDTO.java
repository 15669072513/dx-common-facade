package com.dx.facade.report.resp.member;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyMemberNetVenueSummaryRespDTO {

    //======小计
    @ApiModelProperty("总投-小计")
    private BigDecimal betAmountSub;

    @ApiModelProperty("有效投注-小计")
    private BigDecimal validBetAmountSub;

    @ApiModelProperty("游戏盈亏-小计")
    private BigDecimal netAmountSub;

    @ApiModelProperty("返水金额-小计")
    private BigDecimal rebateAmountSub;

    @ApiModelProperty("会员优惠-小计")
    private BigDecimal discountAmountSub;

    @ApiModelProperty("账户调整-小计")
    private BigDecimal artificialPatchAmountSub;

    @ApiModelProperty("总盈亏-小计")
    private BigDecimal totalNetAmountSub;

    @ApiModelProperty("平台返水金额-小计")
    private BigDecimal platformRebateAmountSub;

    @ApiModelProperty("代理返水金额-小计")
    private BigDecimal proxyRebateAmountSub;
}
