package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyRebateListResp {

    @ApiModelProperty(value = "结算日期")
    private Integer reportDate;

    @ApiModelProperty(value = "总金额")
    private BigDecimal totalRebateRate;



}
