package com.dx.facade.report.resp.agent;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyNetAmountMonthRespDTO
 *
 * @author kygo
 * @version 1.0.0
 * @since 20220412
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgentNetAmountDayRespDTO {

    @ApiModelProperty(value = "日期，比如20210531")
    private Integer staticsDate;

    @ApiModelProperty(value = "总投注")
    private BigDecimal betAmount;

    @ApiModelProperty(value = "有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value = "游戏盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty(value = "会员返水")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "会员优惠")
    private BigDecimal discountAmount;
}
