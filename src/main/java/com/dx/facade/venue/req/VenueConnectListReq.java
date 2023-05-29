package com.dx.facade.venue.req;


import com.dx.facade.common.PageRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class VenueConnectListReq extends PageRequest {
    @ApiModelProperty("场馆类型(选'全部'时不要传这个字段),如by,cp,qkl,见BwVenueTypeEnum枚举")
    private String venueType;

    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("场馆英文名")
    private String venueEnName;

    @ApiModelProperty("场馆泰文名")
    private String venueThName;

    @ApiModelProperty("场馆越南名")
    private String venueVnName;
}
