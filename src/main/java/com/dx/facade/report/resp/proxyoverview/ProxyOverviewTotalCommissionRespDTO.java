package com.dx.facade.report.resp.proxyoverview;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import com.dx.facade.common.chart.Option;

@Data
@ApiModel(value = "ProxyOverviewTotalCommissionRespDTO", description = "累计反佣金")
public class ProxyOverviewTotalCommissionRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("累计佣金")
    private BigDecimal commissionAmount;

    @ApiModelProperty("近六个月反佣图片")
    private Option option;
}
