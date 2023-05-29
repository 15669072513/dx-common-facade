package com.dx.facade.report.param.report.gameprofit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.dx.facade.report.param.base.LocalDatePageRequest;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("游戏盈亏详情")
public class GameNetAmountDetailReqDTO extends LocalDatePageRequest {

    @ApiModelProperty("商户Id")
    private String merchantId;

    @ApiModelProperty(value = "游戏Id", example = "1")
    private String gameTypeId;

    @ApiModelProperty(value = "游戏code", example = "zr")
    private String gameCode;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

}
