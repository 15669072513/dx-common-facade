package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyAmountDetailRespDto {

    //当月每日返水详情,优惠详情,总输赢详情,场馆费详情

    @ApiModelProperty(value = "日期 yyyy-mm-dd")
    private String reportDate;

    @ApiModelProperty(value = "总输赢额")
    private BigDecimal totalNetAmount;

    @ApiModelProperty(value = "总优惠额")
    private BigDecimal totalDiscountAmount;

    @ApiModelProperty(value = "总返水")
    private BigDecimal totalRebateAmount;



}
