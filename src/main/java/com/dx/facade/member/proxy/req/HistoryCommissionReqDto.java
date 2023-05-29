package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class HistoryCommissionReqDto {

    @ApiModelProperty(value = "代理id", required = true, example = "669665445452452451415", hidden = true)
    @NotNull(message = "代理id不能为空")
    private Long proxyId;

    @ApiModelProperty(value = "开始月份", required = true, example = "202106")
    @NotNull(message = "开始月份不能为空")
    private Long startMonth;

    @ApiModelProperty(value = "结束月份", required = true, example = "202109")
    @NotNull(message = "结束月份不能为空")
    private Long endMonth;


}
