package com.dx.facade.venue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author Rock
 * 游戏大厅，德州特有信息
 **/
@Data
public class TexasHallDTO {

    @ApiModelProperty(value = "德州场馆在线人数")
    private Integer onlineUserNum;

    @ApiModelProperty(value = "牌桌数量")
    private Integer tableNum;

    @ApiModelProperty(value = "赢钱滚动公告")
    private List<String> winRollNotice;

    @ApiModelProperty(value = "图标URL")
    private String venueImageUrl;

    @ApiModelProperty(value = "场馆类型type")
    private String venueType;
}