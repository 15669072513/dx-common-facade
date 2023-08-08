package com.dx.facade.venue.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class VenueTypeCodeAndVenues {

    @ApiModelProperty("场馆类型code,如ty,zr,dy,qkl")
    private String venueTypeCode;

    @ApiModelProperty("场馆类型的图片")
    private String venueTypeIconUrl;

    @ApiModelProperty("场馆列表")
    private List<VenueResp> venueList = new ArrayList<>();
}
