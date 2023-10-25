package com.dx.facade.texas.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("牌桌用户带入信息")
@Data
public class TableUserBringInfoDto {
  @ApiModelProperty("总带入金额")
  private BigDecimal bringMidwayChip=new BigDecimal(0.0);
  @ApiModelProperty("总带入次数")
  private Integer bringCount=0;
}
