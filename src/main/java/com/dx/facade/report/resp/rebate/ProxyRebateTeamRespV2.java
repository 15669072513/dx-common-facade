package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyRebateTeamRespV2 {


    /**
     * 返水类型
     */
    @ApiModelProperty(value = "返水类型（1：代理，2平台）")
    private String platformFlag;

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

    /**
     * 手牌服务费贡献
     */
    @ApiModelProperty(value = "手牌服务费贡献")
    private BigDecimal serviceChargeHand;

    /**
     * 局服务费贡献
     */
    @ApiModelProperty(value = "局服务费贡献")
    private BigDecimal serviceChargeRound;

    /**
     * 局服务费贡献
     */
    @ApiModelProperty(value = "局服务费贡献")
    private BigDecimal serviceAmount;

}
