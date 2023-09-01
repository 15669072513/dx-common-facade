package com.dx.facade.venue.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class VenueGameConfigDetail {

    @ApiModelProperty("主键")
    private Long gameId;

    @ApiModelProperty("游戏类型id")
    private String gameTypeId;

    @ApiModelProperty("游戏名称")
    private String gameName;

}
