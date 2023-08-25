package com.dx.facade.game.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author admin
 */
@Data
@ApiModel(value = "RecommendGameDTO对象", description = "游戏热门")
public class RecommendGameDTO {

    @ApiModelProperty("id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户id")
    @NotNull(message = "商户不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("场馆code")
    @NotBlank(message = "场馆不能为空")
    private String venueCode;

    @ApiModelProperty("游戏id")
    @NotNull(message = "游戏不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long gameId;

    @ApiModelProperty("中文图标")
    private String iconUrlCn;

    @ApiModelProperty("英文图标")
    private String iconUrlEn;

    @ApiModelProperty("泰文图标")
    private String iconUrlTh;

    @ApiModelProperty("越南文图标")
    private String iconUrlVn;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("客户端类型：0APP端,1H5,2PC")
    private Integer clientType;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改人")
    private String updatedBy;
}
