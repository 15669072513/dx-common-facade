package com.dx.facade.report.resp.agent;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 会员盈亏报表
 *
 * @author kygo
 * @version 1.0.0
 * @since 2022年04月13日
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberNetAmountDayDetailRespDTO {

    @ApiModelProperty("日期")
    private String staticsDate;

    @ApiModelProperty("总投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty("游戏盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty("会员返水")
    private BigDecimal rebateAmount;

    @ApiModelProperty("流水纠正")
    private BigDecimal flowCorrection;

    @ApiModelProperty("会员优惠金额")
    private BigDecimal discountAmount;

    @ApiModelProperty("帐户调整")
    private BigDecimal artificialPatchAmount;

    @ApiModelProperty("总盈亏")
    private BigDecimal netProfit;
}
