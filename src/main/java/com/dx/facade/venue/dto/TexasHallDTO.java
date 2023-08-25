package com.dx.facade.venue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Rock
 * 游戏大厅，德州特有信息
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TexasHallDTO implements Serializable {

    @ApiModelProperty(value = "德州场馆在线人数")
    private Integer onlineUserNum;

    @ApiModelProperty(value = "牌桌数量")
    private Integer tableNum;

    @ApiModelProperty(value = "赢钱滚动公告")
    private List<String> winRollNotice;

    @ApiModelProperty(value = "场馆类型typeCode")
    private String venueTypeCode;

    @ApiModelProperty(value = "状态(0已禁用,1开启中,2维护中)")
    private Integer venueStatus;
}