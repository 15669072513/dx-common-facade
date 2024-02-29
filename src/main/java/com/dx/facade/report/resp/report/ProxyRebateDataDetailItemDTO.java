package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "ProxyRebateDataDetailItemDTO", description = "代理返点数据返点明细")
public class ProxyRebateDataDetailItemDTO {
    @ApiModelProperty("项目")
    private String itemName;
    @ApiModelProperty(value = "团队返点金额")
    private BigDecimal rebateAmount;
    @ApiModelProperty(value = "团队返点比例")
    private BigDecimal rebate;
    @ApiModelProperty(value = "团队相关金额(德州-俱乐部为抽水贡献,德州-保险为净输赢,其他为有效投注)")
    private BigDecimal amount;
    @ApiModelProperty("手牌服务费贡献")
    private BigDecimal serviceChargeHand;
    @ApiModelProperty("局服务费贡献")
    private BigDecimal serviceChargeRound;

    @ApiModelProperty(value = "手牌服务费贡献")
    private BigDecimal serviceChargeHandContribution;
    @ApiModelProperty(value = "局服务费贡献")
    private BigDecimal serviceChargeRoundContribution;
    @ApiModelProperty(value = "总计局服务费贡献")
    private BigDecimal serviceAmountContribution;

}
