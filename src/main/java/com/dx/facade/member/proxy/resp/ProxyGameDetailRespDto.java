package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyGameDetailRespDto {

    @ApiModelProperty(value = "场馆ID")
    private Long venueId;

    @ApiModelProperty(value = "场馆名称")
    private BigDecimal venueName;

    @ApiModelProperty(value = "总输赢额")
    private BigDecimal  totalNetAmount;

    @ApiModelProperty(value = "场馆费率")
    private BigDecimal  venueRate;

    @ApiModelProperty(value = "场馆费")
    private BigDecimal  platformAmount;

}
