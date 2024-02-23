package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
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
@ApiModel(value = "DwmProxyRebateShareRspDTO", description = "其他场馆返点数据返回值")
public class DwmProxyRebateShareRspDTO {

    @ApiModelProperty("项目")
    private String venueName;

    @ApiModelProperty("会员有效投注")
    protected BigDecimal validBetAmount = BigDecimal.ZERO;

    @ApiModelProperty("团队返点比例")
    protected BigDecimal rebateRate = BigDecimal.ZERO;

    @ApiModelProperty("团队占成比例")
    protected BigDecimal zhanChengRate = BigDecimal.ZERO;

    @ApiModelProperty("团队返点金额")
    protected BigDecimal rebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("团队占成金额")
    protected BigDecimal zhanChengAmount = BigDecimal.ZERO;

    @ApiModelProperty("返点成本分摊")
    protected BigDecimal ajustAmount = BigDecimal.ZERO;

    @ApiModelProperty("直属代理团队返点金额")
    protected BigDecimal proxyRebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("直属代理团队占成金额")
    protected BigDecimal proxyZhanChengAmount = BigDecimal.ZERO;

    @ApiModelProperty("会员代理返水")
    protected BigDecimal memberProxyRebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("实际应发个人返点金额")
    protected BigDecimal realRebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("实际应发个人占成金额")
    protected BigDecimal realZhangChengAmount = BigDecimal.ZERO;

    @ApiModelProperty("会员游戏盈亏")
    protected BigDecimal netAmount = BigDecimal.ZERO;

    @ApiModelProperty("服务费贡献")
    protected BigDecimal serviceAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "手牌服务费贡献")
    protected BigDecimal serviceChargeHand = BigDecimal.ZERO;

    @ApiModelProperty(value = "局服务费贡献")
    protected BigDecimal serviceChargeRound = BigDecimal.ZERO;
}
