package com.dx.facade.report.resp.proxyoverview;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiModel(value = "ProxyOverviewSubordinateProxyNotPayRespDTO", description = "下级代理-待付")
public class ProxyOverviewSubordinateProxyNotPayRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "结算年月，期数", example = "202204")
    private Integer reportYm;

    @ApiModelProperty(value = "应付金额")
    private BigDecimal payAmount;

    @ApiModelProperty(value = "剩余未付")
    private BigDecimal notPayAmount;
}
