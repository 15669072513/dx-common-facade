package com.dx.facade.venue.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

import com.dx.facade.common.PageRequest;

@Data
public class GameVenueListReq extends PageRequest {

    @ApiModelProperty(value = "所属场馆(即bw_venue表的venue_code)")
    private String venueCode;

    @ApiModelProperty(value = "设备类型", hidden = true)
    private Integer clientType;
}
