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
    protected BigDecimal creditQuota = BigDecimal.ZERO;
    @ApiModelProperty("合计今日借款")
    protected BigDecimal loanAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计有效投注")
    protected BigDecimal validBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计单笔最大投注")
    protected BigDecimal maxBetAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计历史返水")
    protected BigDecimal hisRebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计当日输赢")
    protected BigDecimal netAmount = BigDecimal.ZERO;
    @ApiModelProperty("合计历史输赢")
    protected BigDecimal hisNetAmount = BigDecimal.ZERO;
}
