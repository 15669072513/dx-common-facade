package com.dx.facade.venue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author Rock
 * 游戏大厅
 **/

@Data
public class GameHallDTO {

    @ApiModelProperty(value = "其他场馆信息")
    private List<GameVenueDTO> venues;


    @ApiModelProperty(value = "德州场馆信息")
    private TexasHallDTO texasVenue;

}