package com.dx.facade.venue.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class VenueGameConfigResp {

    @ApiModelProperty("场馆类型(如by,ty,zr,qkl)")
    private String venueTypeCode;

    @ApiModelProperty("场馆类型名称")
    private String venueTypeName;

    @ApiModelProperty("场馆编码(如byqp)")
    private String venueCode;

    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("场馆游戏名称")
    private List<VenueGameConfigDetail> gameTypeList;

}
