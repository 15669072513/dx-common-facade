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
    protected BigDecimal betAmount;

    @ApiModelProperty("有效投注")
    protected BigDecimal validBetAmount;

    @ApiModelProperty("游戏盈亏")
    protected BigDecimal netAmount;

    @ApiModelProperty("返水金额")
    protected BigDecimal rebateAmount;

    @ApiModelProperty("会员优惠")
    protected BigDecimal discountAmount;

    @ApiModelProperty("账户调整")
    protected BigDecimal artificialPatchAmount;

    @ApiModelProperty("总盈亏")
    protected BigDecimal totalNetAmount;
}
