package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("牌桌用户带入信息")
@Data
public class TableUserBringListDto {
  @ApiModelProperty("用户ID")
  private Long userId;

  @ApiModelProperty("总带入金额")
  private BigDecimal totalInAmount=new BigDecimal(0.0);

  @ApiModelProperty("带入次数")
  private Integer inCount=0;

  @ApiModelProperty("总带出金额")
  private BigDecimal totalOutAmount=new BigDecimal(0.0);

  @ApiModelProperty("带出次数")
  private Integer outCount=0;
}
