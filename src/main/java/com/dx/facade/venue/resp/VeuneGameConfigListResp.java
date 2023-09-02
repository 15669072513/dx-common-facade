package com.dx.facade.venue.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class VeuneGameConfigListResp {

    @ApiModelProperty("场馆游戏列表")
    private List<VenueGameConfigResp> gameList;

}
