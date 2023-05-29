package com.dx.facade.report.param.agent;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyCommissionReciveTotalDTO {
    @ApiModelProperty(value = "已收金额")
    private BigDecimal receiveAmount;

    @ApiModelProperty(value = "未收金额")
    private BigDecimal notReceiveAmount;
}
