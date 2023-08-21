package com.dx.facade.game.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author Rock
 **/

@Data
public class VenueWalletDTO {

    @ApiModelProperty(value = "场馆编码")
    private String venueCode;

    @ApiModelProperty(value = "钱包名称")
    private String venueWalletName;

    @ApiModelProperty(value = "钱包类型")
    private String venueWalletType;

    @ApiModelProperty(value = "钱包余额")
    private BigDecimal venueWalletBalance;

}
