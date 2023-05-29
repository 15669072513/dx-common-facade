package com.dx.facade.report.resp.proxycommission;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 统计总反水聚合信息(各个场馆）
 *
 * @author laway
 */
@Data
@Builder
public class SumRebateVenueRespDTO {
    /*
     * 场馆ID
     * */
    @ApiModelProperty(value = "场馆ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
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
