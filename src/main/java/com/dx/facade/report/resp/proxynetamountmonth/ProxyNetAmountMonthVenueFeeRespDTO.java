package com.dx.facade.report.resp.proxynetamountmonth;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyNetAmountVenueMonthFeeRespDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午8:48:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyNetAmountMonthVenueFeeRespDTO {

    /** proxyName */
    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    /** venueName */
    @ApiModelProperty(value = "场馆名称")
    private String venueName;

    /** totalNetAmount */
    @ApiModelProperty(value = "总输赢额")
    private BigDecimal totalNetAmount;

    /** venueRate */
    @ApiModelProperty(value = "场馆费率")
    private BigDecimal venueRate;

    /** platformAmount */
    @ApiModelProperty(value = "场馆费")
    private BigDecimal platformAmount;
}
