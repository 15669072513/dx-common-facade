package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyRebateTeamRespSumV2 {



    /**
     * 团队返点金额
     */
    @ApiModelProperty(value = "团队返点")
    private BigDecimal rebateAmount = BigDecimal.ZERO;

    /**
     * 团队有效投注
     */
    @ApiModelProperty(value = "团队有效投注")
    private BigDecimal validBetAmount= BigDecimal.ZERO;

}
