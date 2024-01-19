package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("上月清理结余返回对象")
public class DwmProxyLastMonthBalanceResqDTO {
    @ApiModelProperty(value = "待清理结余")
    private BigDecimal balanceToCleared;

    @ApiModelProperty(value = "备注")
    protected String remark = "";
}
