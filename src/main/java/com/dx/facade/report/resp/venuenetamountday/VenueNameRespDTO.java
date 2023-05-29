package com.dx.facade.report.resp.venuenetamountday;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class VenueNameRespDTO {

    @ApiModelProperty(name = "ID")
    private Long id;

    @ApiModelProperty(name = "场馆code")
    private String gameCode;

    @ApiModelProperty(name = "场馆名称")
    private String venueName;

    @ApiModelProperty(name = "场馆英文名")
    private String venueEnName;

    @ApiModelProperty(name = "场馆泰语名")
    private String venueThName;

    @ApiModelProperty(name = "场馆越南名")
    private String venueVnName;


}
