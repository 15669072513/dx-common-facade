package com.dx.facade.venue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author Rock
 **/

@Data
public class GameVenueDTO {

    @ApiModelProperty(value = "场馆名称")
    private String venueName;

    @ApiModelProperty(value = "场馆类型code")
    private String venueCode;
}