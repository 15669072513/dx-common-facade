package com.dx.facade.report.resp.venuenetamountday;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class VenueNetAmountDayDetailInfoRespDTO {

    @ApiModelProperty("集合-list")
    private List<VenueNetAmountDayDetailRespDTO> record;

    @ApiModelProperty("汇总-list")
    private VenueNetAmountDayDetailSummaryDTO summary;

}
