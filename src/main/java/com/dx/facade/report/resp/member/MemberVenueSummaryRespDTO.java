package com.dx.facade.report.resp.member;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@ApiModel("会员场馆总计")
public class MemberVenueSummaryRespDTO {
    @ApiModelProperty("注单量")
    private BigDecimal betCount;
    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;
    @ApiModelProperty("有效投注金额")
    private BigDecimal effectiveBetAmount;
    @ApiModelProperty("抽水贡献")
    private BigDecimal  pumPing;
    @ApiModelProperty("投注盈亏")
    private BigDecimal  betProfitLoss;
}
