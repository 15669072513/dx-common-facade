package com.dx.facade.report.resp.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author yinter
 */
@Data
public class ProxyAuditTotalAmountRespDTO {


    @ApiModelProperty(value = "批量审核总人数")
    private Integer numberOfPeople;

    @ApiModelProperty(value = "批量审核总佣金")
    private BigDecimal auditTotalAmount;


}
