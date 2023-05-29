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
public class RebateReportDayReqDTO {

    @ApiModelProperty(value = "日期，比如20210531")
    private Integer staticsDate;

    @ApiModelProperty(value = "场馆ID -1 代表返水人工调整")
    private String venueId;

    @ApiModelProperty(value = "场馆名称")
    private String venueName;

    @ApiModelProperty(value = "返水人数")
    private Long memberCount;

    @ApiModelProperty(value = "返水金额")
    private BigDecimal amount;
}
