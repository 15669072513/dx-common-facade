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
}
