package com.dx.facade.report.resp.venuenetamountday;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueNetAmountDayDetailRespDTO extends VenueNetAmountDaySummaryRespDTO {

    @ApiModelProperty("日期")
    private String staticsDate;


}
