package com.dx.facade.report.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 统计-会员返水统计
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyRebateStatisticsTotalRespDTO {



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


}
