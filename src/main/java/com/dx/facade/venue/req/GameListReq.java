package com.dx.facade.venue.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

import com.dx.facade.common.PageRequest;

@Data
public class GameListReq extends PageRequest {
    @ApiModelProperty("主键")
    private Long gameId;

    @ApiModelProperty("游戏名称(如赤壁之战,财神到)")
    private String gameName;

    @ApiModelProperty("游戏中文名")
    private String gameZhName;

    @ApiModelProperty("游戏英文名")
    private String gameEnName;

    @ApiModelProperty("游戏泰语名")
    private String gameThName;

    @ApiModelProperty("游戏越南名")
    private String gameVnName;

    @ApiModelProperty("所属场馆(即bw_venue表的venue_code)")
    private List<String> venueCode;

    @ApiModelProperty("状态(0已禁用,1开启中,2维护中)")
    private List<String> status;

    @ApiModelProperty("图标状态(1推荐,2火热,3新游)")
    private List<String> iconStatus;

    @ApiModelProperty("支持终端,只能传一个(1.PC,2.IOS_APP,3.IOS_H5,4.Android_H5,5.Android_APP)")
    private List<String> supportTerminal;
}
