package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("保险统计")
@Data
public class InsuranceInfoSummaryResp {

  @ApiModelProperty(value = "投注金额")
  private BigDecimal betAmount;

  @ApiModelProperty(value = "投保赔付额(爆牌)")
  private BigDecimal insuredRewards;

  @ApiModelProperty(value = "保险投注额")
  private BigDecimal insuredAmount;

  @ApiModelProperty(value = "保险输赢")
  private BigDecimal insuredNetAmount;

  @ApiModelProperty(value = "底池")
  private BigDecimal potAmount;

}
