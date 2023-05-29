package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 统计总场馆费聚合信息(各个场馆）
 *
 * @author laway
 */
@Data
@Builder
public class ListVenueFreeRateRespDTO {
    
    @ApiModelProperty(value = "场馆ID")
    private Long venueId;
    
    @ApiModelProperty(value = "场馆名称")
    private String venueName;
    
    @ApiModelProperty(value = "场馆费率")
    private BigDecimal feeRate;
    
}
