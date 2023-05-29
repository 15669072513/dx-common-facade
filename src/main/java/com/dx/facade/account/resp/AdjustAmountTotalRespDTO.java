package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author grayson
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdjustAmountTotalRespDTO {

    @ApiModelProperty(value = "CNY总计")
    private BigDecimal adjustAmountTotalCNY = BigDecimal.ZERO;

    @ApiModelProperty(value = "THB总计")
    private BigDecimal adjustAmountTotalTHB = BigDecimal.ZERO;

    @ApiModelProperty(value = "VND总计")
    private BigDecimal adjustAmountTotalVND = BigDecimal.ZERO;
}
