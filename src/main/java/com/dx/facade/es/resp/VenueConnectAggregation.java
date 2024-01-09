package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class VenueConnectAggregation {

    @ApiModelProperty("商户总数")
    private Integer totalCount;
}
