package com.dx.facade.report.resp.venuenetamountday;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueNetAmountDayRespDTO extends VenueNetAmountDaySummaryRespDTO {

    @ApiModelProperty(value = "商户Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("场馆编号")
    private String gameCode;

    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("场馆类型")
    private String venueType;

    @ApiModelProperty("场馆类型名称")
    private String venueTypeName;

}
