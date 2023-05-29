package com.dx.facade.report.param.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ProxyRebateDReqDTO {
    /**
     * 商户
     */
    @ApiModelProperty(value = "商户")
    private Long merchantId;

    /**
     * 代理id
     */
    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    /**
     * 周期开始时间
     */
    @ApiModelProperty(value = "周期开始时间(yyyyMMdd)")
    private Long reportStartDate;

    /**
     * 周期结束时间
     */
    @ApiModelProperty(value = "周期结束时间(yyyyMMdd)")
    private Long reportEndDate;
}

