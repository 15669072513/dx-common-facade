package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("资金明细页统计")
@Data
public class FundDetailSumResp {
  @ApiModelProperty("有效投注")
  private BigDecimal effectiveBet;
  @ApiModelProperty("输赢")
  private BigDecimal winLose;
}
