package com.dx.facade.venue.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
public class GameEditReq {
    @ApiModelProperty("主键")
    @NotNull
    private Long gameId;

    @ApiModelProperty("游戏名称(如赤壁之战,财神到)")
    @NotEmpty
    private String gameName;

    @ApiModelProperty("游戏中文名")
    private String gameZhName;

    @ApiModelProperty("游戏英文名")
    private String gameEnName;

    @ApiModelProperty("游戏泰语名")
    private String gameThName;

    @ApiModelProperty("游戏越南名")
    private String gameVnName;

    @ApiModelProperty("接入参数")
    @NotEmpty
    private String accessInfo;

    @ApiModelProperty("图标状态(1推荐,2火热,3新游)")
    private Integer iconStatus;

    @ApiModelProperty(value = "支持终端,逗号隔开(1.PC,2.IOS_APP,3.IOS_H5,4.Android_H5,5.Android_APP)")
    @NotEmpty
    private List<String> supportTerminalList = new ArrayList<>();

    @ApiModelProperty("图标图片url")
    @NotEmpty
    private String iconUrl;

    @ApiModelProperty("游戏描述")
    private String description;

    @ApiModelProperty("备注")
    private String remark;

    //隐藏的属性

    @ApiModelProperty(value = "修改人", hidden = true)
    private String updatedBy;

    @ApiModelProperty(value = "支持终端,逗号隔开(1.PC,2.IOS_APP,3.IOS_H5,4.Android_H5,5.Android_APP)", hidden = true)
    private String supportTerminals;
}
