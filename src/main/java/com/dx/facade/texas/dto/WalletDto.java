package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@ApiModel("用户钱包信息")
@Data
@EqualsAndHashCode
public class WalletDto {

    /**
     * ID
     */
    @ApiModelProperty("ID")
    private Long id;

    /**
     * 商户ID
     */
    @ApiModelProperty("商户ID")
    private Long merchantId;

    /**
     * 用户id，即会员id或代理id
     */
    @ApiModelProperty("用户id")
    private Long userId;

    /**
     * 用户类型（1=会员/2=代理）
     */
    @ApiModelProperty("用户类型")
    private Integer userType;

    /**
     * 钱包类型 1-德州
     */
    @ApiModelProperty("钱包类型 1-德州")
    private Integer walletType;

    /**
     * 币种
     */
    @ApiModelProperty("币种")
    private String currency;

    /**
     * 账户余额
     */
    @ApiModelProperty("账户余额")
    private BigDecimal balance = new BigDecimal(0.0);

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("带入总额")
    private BigDecimal bringInSumAmount = new BigDecimal(0.0);

    @ApiModelProperty("带出总额")
    private BigDecimal bringOutSumAmount = new BigDecimal(0.0);

    @ApiModelProperty("最近一次带出金额")
    private BigDecimal lastBringOut = new BigDecimal(0.0);

    @ApiModelProperty("牌桌id")
    private Long tableId;

    @ApiModelProperty("牌局保留的局服务费")
    private BigDecimal freezeFee = BigDecimal.ZERO;

}
