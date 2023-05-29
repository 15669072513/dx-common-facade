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
public class RebateReportDetailRespDTO {

    @ApiModelProperty(value = "日期，比如2021-05-31", example = "2021-05-31")
    private String staticsDate;

    @ApiModelProperty(value = "返水人数")
    private Long memberCount;

    @ApiModelProperty(value = "返水金额")
    private BigDecimal amount;
}
