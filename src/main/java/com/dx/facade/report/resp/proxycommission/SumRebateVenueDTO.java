package com.dx.facade.report.resp.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 总反水
 *
 * @author kygo
 */
@Data
@Builder
public class SumRebateVenueDTO {

    /*
    * 场馆ID
    * */
    @ApiModelProperty(value = "场馆ID")
    private Long venueId;

    /*
    * 场馆名
    * */
    @ApiModelProperty(value = "场馆名称")
    private String venueName;

    /*
    * 反水
    * */
    @ApiModelProperty(value = "反水金额")
    private BigDecimal totalReturnWaterAmount;
    
}
