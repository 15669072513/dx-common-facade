package com.dx.facade.venue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author Rock
 **/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameVenueDTO implements Serializable {

    @ApiModelProperty(value = "场馆名称")
    private String venueName;

    @ApiModelProperty(value = "场馆类型code")
    private String venueTypeCode;

    @ApiModelProperty(value = "状态(0已禁用,1开启中,2维护中)")
    private Integer venueStatus;
}