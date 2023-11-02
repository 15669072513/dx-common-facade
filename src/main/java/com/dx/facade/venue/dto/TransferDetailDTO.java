package com.dx.facade.venue.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author Rock
 **/

@Data
public class TransferDetailDTO {

    @ApiModelProperty(value = "现金余额")
    private BigDecimal centerWalletBalance;

    @ApiModelProperty(value = "场馆钱包余额")
    private BigDecimal venueWalletBalance;

    @ApiModelProperty(value = "自动带入开关,1-开启，0-关闭")
    private Integer autoBring;
}
