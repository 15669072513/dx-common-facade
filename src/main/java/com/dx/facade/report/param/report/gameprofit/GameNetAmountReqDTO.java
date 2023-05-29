package com.dx.facade.report.param.report.gameprofit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.dx.facade.report.param.base.LocalDatePageRequest;

import java.util.List;
import java.util.Map;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("游戏盈亏-请求参数")
public class GameNetAmountReqDTO extends LocalDatePageRequest {

    @ApiModelProperty("商户Id")
    private String merchantId;

    @ApiModelProperty(value = "场馆code", example = "zr")
    private String gameCode;

    @ApiModelProperty(value = "游戏名称", example = "炸金花")
    private String gameTypeName;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

}
