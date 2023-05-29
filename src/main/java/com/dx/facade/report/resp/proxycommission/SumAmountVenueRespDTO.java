package com.dx.facade.report.resp.proxycommission;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 统计总场馆费
 *
 * @author kygo
 */
@Data
public class SumAmountVenueRespDTO {

    @ApiModelProperty(value = "场馆ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long venueId;

    @ApiModelProperty(value = "币种")
    private String  currency;

    @ApiModelProperty(value = "场馆名称")
    private String venueName;

    @ApiModelProperty(value = "总输赢")
    private BigDecimal totalNetAmount;

    @ApiModelProperty(value = "场馆费率")
    private BigDecimal venueRate;

    @ApiModelProperty(value = "场馆费")
    private BigDecimal platformAmount;

    @ApiModelProperty(value = "总流水")
    private BigDecimal totalBetAmount;

}
