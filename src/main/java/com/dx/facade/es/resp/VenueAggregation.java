package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class VenueAggregation {

    @ApiModelProperty("游戏总数")
    private Integer gameTotalCount;
}
