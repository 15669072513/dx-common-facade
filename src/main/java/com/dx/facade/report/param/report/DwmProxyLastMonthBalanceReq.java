package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("上月清理结余请求参数")
public class DwmProxyLastMonthBalanceReq {

    @ApiModelProperty(value = "代理id(20)",required = true,example = "587597733479145474")
    @NotNull(message = "代理id不能为空")
    private Long proxyId;

    @ApiModelProperty(value = "备注(2000)",required = true)
    private String remake;
}
