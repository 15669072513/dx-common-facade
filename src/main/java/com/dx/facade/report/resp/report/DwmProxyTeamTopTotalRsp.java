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
    protected BigDecimal teamWithdrawable = BigDecimal.ZERO;
    @ApiModelProperty("合计团队应还账款")
    protected BigDecimal teamReturnLoan = BigDecimal.ZERO;
    @ApiModelProperty("合计有效投注")
    protected BigDecimal validBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计直属会员有效投注")
    protected BigDecimal directlyMemberValidBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计团队返点")
    protected BigDecimal teamRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计投注盈亏")
    protected BigDecimal netAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计总授信额度")
    protected BigDecimal creditQuota = BigDecimal.ZERO;
    @ApiModelProperty("合计可用额度")
    protected BigDecimal creditBalance = BigDecimal.ZERO;
}
