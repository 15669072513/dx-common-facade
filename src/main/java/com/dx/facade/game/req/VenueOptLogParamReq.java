package com.dx.facade.game.req;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="查询场馆操作记录入参", description="查询场馆操作记录入参")
public class VenueOptLogParamReq extends PageRequest {

    @ApiModelProperty(value = "商户编号")
    private String merchantCode;

    @ApiModelProperty(value = "查询起始时间,13位时间戳")
    private Long startTime;

    @ApiModelProperty(value = "查询结束时间,13位时间戳")
    private Long endTime;

    @ApiModelProperty(value = "操作栏目1游戏管理2俱乐部管理")
    private Integer operationMenu;

    @ApiModelProperty(value = "操作页面1游戏规则-德州扑克2游戏规则-短牌3保险赔率-德州扑克4保险赔率-短牌5牌桌详情6俱乐部申请列表7通用俱乐部管理")
    private Integer operationPage;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "操作IP")
    private String ip;

}
