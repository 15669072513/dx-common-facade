package com.dx.facade.report.resp.venuenetamountday;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class VenueTypeRespDTO {

    @ApiModelProperty(name = "场馆类型")
    private String venueType;

    @ApiModelProperty(name = "场馆类型名称")
    private String venueTypeName;

    @ApiModelProperty(name = "场馆英文名")
    private String venueEnName;

    @ApiModelProperty(name = "场馆泰语名")
    private String venueThName;

    @ApiModelProperty(name = "场馆越南名")
    private String venueVnName;

}
