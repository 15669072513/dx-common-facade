package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class RebateReportBaseRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "返水金额(CNY)", required = true, example = "2343")
    private BigDecimal amountInCNY;

    @ApiModelProperty(value = "返水金额(VND)", required = true, example = "2343")
    private BigDecimal amountInVND;

    @ApiModelProperty(value = "返水金额(THB)", required = true, example = "2343")
    private BigDecimal amountInTHB;

    @ApiModelProperty(value = "返水人数", required = true, example = "1111")
    private Long memberCount;
}
