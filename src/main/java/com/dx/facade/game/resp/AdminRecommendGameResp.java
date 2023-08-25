package com.dx.facade.game.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 中控后台游戏热门
 */
@Data
public class AdminRecommendGameResp {

    @ApiModelProperty("id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("场馆code")
    private String venueCode;

    @ApiModelProperty("场馆类型code")
    private String venueTypeCode;

    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("游戏id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long gameId;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("中文图标")
    private String iconUrlCn;

    @ApiModelProperty("英文图标")
    private String iconUrlEn;

    @ApiModelProperty("泰文图标")
    private String iconUrlTh;

    @ApiModelProperty("越南文图标")
    private String iconUrlVn;

    @ApiModelProperty("客户端类型：0APP端,1H5,2PC")
    private Integer clientType;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("游戏状态(0已禁用,1开启中,2维护中)")
    private Integer status;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;
}
