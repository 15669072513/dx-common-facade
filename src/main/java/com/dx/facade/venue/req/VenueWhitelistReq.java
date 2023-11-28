package com.dx.facade.venue.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class VenueWhitelistReq {

    @ApiModelProperty("场馆id")
    @NotNull
    private Long venueId;

    @ApiModelProperty("场馆白名单IP，逗号分割")
    private String ips;

    @ApiModelProperty("场馆白名单URL,逗号分割")
    private String url;

}
