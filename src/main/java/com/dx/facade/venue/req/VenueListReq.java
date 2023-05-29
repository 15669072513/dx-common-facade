package com.dx.facade.venue.req;

import com.dx.facade.common.PageRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class VenueListReq extends PageRequest {
    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("场馆英文名")
    private String venueEnName;

    @ApiModelProperty("场馆泰文名")
    private String venueThName;

    @ApiModelProperty("场馆越南名")
    private String venueVnName;

    @ApiModelProperty("显示状态(0已禁用,1开启中,2维护中),如果是'全部',则不要传这个参数")
    private String status;

    @ApiModelProperty(value = "操作人")
    private String updatedBy;
}
