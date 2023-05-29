package com.dx.facade.report.param.agent;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyCommissionPaymentTotalDTO {
    @ApiModelProperty(value = "下级团队拥金")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "剩余未付金额")
    private BigDecimal notPayAmount;

    @ApiModelProperty(value = "已付金额")
    private BigDecimal payAmount;
}
