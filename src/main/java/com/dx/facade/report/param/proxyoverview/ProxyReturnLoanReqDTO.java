package com.dx.facade.report.param.proxyoverview;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * .
 *
 * @author: Ellon
 * @date: 2023-12-21 13:27
 **/
@Data
public class ProxyReturnLoanReqDTO {

    @ApiModelProperty(value = "本期结束时间", required = true, example = "20231206")
    @NotNull(message = "查询时间不能为空")
    private Integer queryDateStart;

    @ApiModelProperty(value = "本期开始时间", required = true, example = "20231209")
    @NotNull(message = "查询时间不能为空")
    private Integer queryDateEnd;

    }
