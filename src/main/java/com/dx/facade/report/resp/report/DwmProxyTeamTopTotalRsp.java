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
@ApiModel(value = "DwmProxyTeamTopTotalRsp", description = "合计代理团队top详情")
public class DwmProxyTeamTopTotalRsp {

    @ApiModelProperty("合计团队可提现额")
    protected BigDecimal totalTeamWithdrawable = BigDecimal.ZERO;
    @ApiModelProperty("合计团队应还账款")
    protected BigDecimal totalTeamReturnLoan = BigDecimal.ZERO;
    @ApiModelProperty("合计有效投注")
    protected BigDecimal totalValidBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计直属会员有效投注")
    protected BigDecimal totalDirectlyMemberValidBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计团队返点")
    protected BigDecimal totalTeamRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计投注盈亏")
    protected BigDecimal totalNetAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计总授信额度")
    protected BigDecimal totalCreditQuota = BigDecimal.ZERO;
    @ApiModelProperty("合计可用额度")
    protected BigDecimal totalCreditBalance = BigDecimal.ZERO;
}
