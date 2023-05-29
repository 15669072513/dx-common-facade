package com.dx.facade.report.resp.member;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberNetAmountMonthRespDTO {

    @ApiModelProperty("月份")
    private String month;

    @ApiModelProperty("投注人数")
    private Integer betPersonCount;

    @ApiModelProperty("注单量")
    private Integer betCount;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount;

}
