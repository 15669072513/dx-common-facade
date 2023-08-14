package com.dx.facade.venue.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class GameTypeListResp {

    @ApiModelProperty("场馆类型LIST")
    private List<VenueTypeCodeAndName> list;
}
