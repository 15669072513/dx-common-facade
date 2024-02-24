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

    @ApiModelProperty("会员有效投注/服务费贡献/游戏盈亏")
    protected BigDecimal validBetAmount = BigDecimal.ZERO;

    @ApiModelProperty("团队返点比例")
    protected BigDecimal rebateRate = BigDecimal.ZERO;

    @ApiModelProperty("团队占成比例")
    protected BigDecimal zhanChengRate = BigDecimal.ZERO;

    @ApiModelProperty("团队占成/返点金额")
    protected BigDecimal rebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("返点成本分摊")
    protected BigDecimal partRebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("直属代理团队占成/返点金额")
    protected BigDecimal childRebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("会员代理返水")
    protected BigDecimal memberProxyRebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("实际应发个人占成/返点金额")
    protected BigDecimal incomeAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "占成标识：0：非占成 1：占成")
    protected Integer zhanchengFlag;
}
