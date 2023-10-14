package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@ApiModel("用户钱包信息")
@Data
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
  private BigDecimal balance;

  /**
   * 创建时间
   */
  @ApiModelProperty("创建时间")
  private LocalDateTime createdAt;

  @ApiModelProperty("带入总额")
  private BigDecimal bringInSumAmount;
}
