package com.dx.facade.report.param.agent;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyCommissionPayTotalDTO {
    @ApiModelProperty(value = "已付金额")
    private BigDecimal payedAmount;

    @ApiModelProperty(value = "未付s金额")
    private BigDecimal notPayAmount;
}
