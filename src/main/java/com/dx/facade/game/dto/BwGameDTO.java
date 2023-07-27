package com.dx.facade.game.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author admin
 */
@Data
@ApiModel(value = "BwGameDTO对象", description = "最近游戏表和收藏游戏表组合返回")
public class BwGameDTO {

    @ApiModelProperty("id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("用户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long memberId;

    @ApiModelProperty("游戏id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long gameId;

    @ApiModelProperty("场馆类型(如by,ty,zr,qkl)")
    private String venueTypeCode;

    @ApiModelProperty("所属场馆(即bw_venue表的venue_code)")
    private String venueCode;

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

    @ApiModelProperty("图标状态(1推荐,2火热,3新游)")
    private Integer iconStatus;

    @ApiModelProperty("支持终端,逗号隔开(1.PC,2.IOS_APP,3.IOS_H5,4.Android_H5,5.Android_APP)")
    private String supportTerminals;

    @ApiModelProperty("图标图片url")
    private String iconUrl;

    @ApiModelProperty("状态(0已禁用,1开启中,2维护中)")
    private Integer status;

    @ApiModelProperty("用户收藏状态(0--未收藏 1--已收藏)")
    private Integer collectStatus;

    @ApiModelProperty("用户收藏状态为1时，收藏id作为取消收藏使用")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long collectId;

    @ApiModelProperty("游戏状态(0已禁用,1开启中,2维护中)")
    private Integer gameStatus;

    @ApiModelProperty("场馆状态(0已禁用,1开启中,2维护中)")
    private Integer venueStatus;

}
