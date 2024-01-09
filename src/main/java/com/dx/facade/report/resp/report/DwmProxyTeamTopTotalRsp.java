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
    private BigDecimal totalTeamWithdrawable = BigDecimal.ZERO;
    @ApiModelProperty("合计团队应还账款")
    private BigDecimal totalTeamReturnLoan = BigDecimal.ZERO;
    @ApiModelProperty("合计有效投注")
    private BigDecimal totalValidBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计直属会员有效投注")
    private BigDecimal totalDirectlyMemberValidBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计团队返点")
    private BigDecimal totalTeamRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计投注盈亏")
    private BigDecimal totalNetAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计总授信额度")
    private BigDecimal totalCreditQuota = BigDecimal.ZERO;
    @ApiModelProperty("合计可用额度")
    private BigDecimal totalCreditBalance = BigDecimal.ZERO;
}
