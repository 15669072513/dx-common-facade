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
@ApiModel(value = "DwmMemberNetTopTotalRsp", description = "合计会员盈亏top")
public class DwmMemberNetTopTotalRsp {

    @ApiModelProperty("合计授信额度")
    private BigDecimal totalCreditQuota;
    @ApiModelProperty("合计今日借款")
    private BigDecimal totalLoanAmount;
    @ApiModelProperty("合计有效投注")
    private BigDecimal totalValidBetAmount;
    @ApiModelProperty("合计单笔最大投注")
    private BigDecimal totalMaxBetAmount;
    @ApiModelProperty("合计历史返水")
    private BigDecimal totalHisRebateAmount;
    @ApiModelProperty("合计当日输赢")
    private BigDecimal totalNetAmount;
    @ApiModelProperty("合计历史输赢")
    private BigDecimal totalHisNetAmount;
}
