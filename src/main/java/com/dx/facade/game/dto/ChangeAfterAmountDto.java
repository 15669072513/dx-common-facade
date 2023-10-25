package com.dx.facade.game.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("根据用户牌桌纬度获取最后一条账变后的余额实体")
@Data
public class ChangeAfterAmountDto {
  @ApiModelProperty("账变后的余额")
  private BigDecimal changeAfter;
}
