package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("牌桌带入信息")
@Data
public class TableBringInfoDto {
  @ApiModelProperty("总带入金额")
  private BigDecimal bringMidwayChip;
  @ApiModelProperty("总带出金额")
  private BigDecimal bringOutChip;
}
