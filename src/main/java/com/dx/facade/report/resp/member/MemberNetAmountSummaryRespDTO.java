package com.dx.facade.report.resp.member;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@ApiModel(description = "会员盈亏汇总/小计")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberNetAmountSummaryRespDTO {
    @ApiModelProperty("注单量")
    private Long betCount;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty("返水金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty("优惠金额")
    private BigDecimal discountAmount;

    @ApiModelProperty("调整金额")
    private BigDecimal artificialPatchAmount;

    @ApiModelProperty("净盈亏")
    private BigDecimal netProfit;

    @ApiModelProperty("币种")
    private String currency;

    @ApiModelProperty("首存金额")
    private BigDecimal firstDeposit;

    @ApiModelProperty(value = "首存金额时间")
    private LocalDateTime firstDepositDatetime;

    // 会员盈利率=投注盈亏/投注金额
    @ApiModelProperty(value = "会员盈利率")
    private BigDecimal netRate;

}
