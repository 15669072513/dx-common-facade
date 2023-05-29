package com.dx.facade.report.param.rebate;


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
public class RebateReportSummaryRespDTO {

    @ApiModelProperty(value = "返水人数")
    private Long memberCount;

    @ApiModelProperty(value = "返水金额")
    private BigDecimal amount;
}
