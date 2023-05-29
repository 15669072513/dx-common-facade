package com.dx.facade.report.resp.proxynetamountmonth;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyNetAmountVenueMonthFeeSummaryRespDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午8:48:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyNetAmountMonthVenueFeeSummaryRespDTO {

    /** totalNetAmountTotal */
    @ApiModelProperty(value = "总输赢额总计")
    private BigDecimal totalNetAmountTotal;

    /** platformAmountTotal */
    @ApiModelProperty(value = "场馆费总计")
    private BigDecimal platformAmountTotal;
}
