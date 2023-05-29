package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 统计总输赢聚合信息(各个场馆）
 *
 * @author laway
 */
@Data
@Builder
public class SumWinVenueRespDTO {
    
    @ApiModelProperty(value = "场馆ID")
    private Long venueId;
    
    @ApiModelProperty(value = "场馆名称")
    private String venueName;
    
    @ApiModelProperty(value = "总输赢")
    private BigDecimal netAmount;
    
    @ApiModelProperty(value = "有效投注")
    private BigDecimal validBetAmount;
    
}
