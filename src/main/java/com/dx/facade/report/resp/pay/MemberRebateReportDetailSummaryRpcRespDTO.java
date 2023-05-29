package com.dx.facade.report.resp.pay;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@ApiModel(value="com-ob-member-resp-MemberRebateReportDetailSummaryRpcRespDTO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberRebateReportDetailSummaryRpcRespDTO {

    @ApiModelProperty(value="总计")
    private String venueName;

    @ApiModelProperty(value="有效投注金额")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value="返水金额")
    private BigDecimal rebateAmount;

}
