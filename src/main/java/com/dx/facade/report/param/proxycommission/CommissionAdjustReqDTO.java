package com.dx.facade.report.param.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommissionAdjustReqDTO {

    @ApiModelProperty(value = "代理ID")
    private String proxyId;

    @ApiModelProperty(value = "调整金额")
    private BigDecimal adjustAmount;

    @ApiModelProperty(value = "调整原因")
    private String remark;

    @ApiModelProperty(value = "月份")
    private Integer reportYm;

    @ApiModelProperty(value = "操作人")
    private String operator;
}
