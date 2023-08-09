package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyRebateTeamResp {



    @ApiModelProperty(value = "项目")
    private String venueName;

    /**
     * 团队返点金额
     */
    @ApiModelProperty(value = "团队返点")
    private BigDecimal rebateAmount;

    /**
     * 团队返点比例
     */
    @ApiModelProperty(value = "团队返点比例")
    private BigDecimal rebateRate;

    /**
     * 团队有效投注
     */
    @ApiModelProperty(value = "团队有效投注")
    private BigDecimal validBetAmount;

}
