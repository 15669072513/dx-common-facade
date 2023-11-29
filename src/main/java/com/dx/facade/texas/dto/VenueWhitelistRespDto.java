package com.dx.facade.texas.dto;

import com.dx.facade.texas.resp.DxGameConfigListResp;
import com.dx.facade.venue.resp.VenueWhitelistResp;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class VenueWhitelistRespDto {

    @ApiModelProperty("游戏集合")
    private List<VenueWhitelistResp> gameConfigList;

}
