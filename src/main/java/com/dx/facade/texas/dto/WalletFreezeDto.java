package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@ApiModel("用户钱包冻结信息")
@Data
@EqualsAndHashCode
public class WalletFreezeDto {

    /**
     * 用户id，即会员id或代理id
     */
    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("牌桌id")
    private Long tableId;

    @ApiModelProperty("牌局保留的局服务费")
    private BigDecimal freezeFee = BigDecimal.ZERO;


}
