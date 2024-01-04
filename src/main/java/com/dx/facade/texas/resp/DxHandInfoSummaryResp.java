package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author streak
 * @since 2023-01-05
 * 手牌数据统计合计
 */
@Data
public class DxHandInfoSummaryResp  implements Serializable {

  private static final long serialVersionUID = 1L;


  @ApiModelProperty("期初金额汇总")
  private BigDecimal beforeChip=BigDecimal.ZERO;

  @ApiModelProperty("中途带入金额汇总")
  private BigDecimal bringMidwayChip=BigDecimal.ZERO;

  @ApiModelProperty("期末余额汇总")
  private BigDecimal afterChip=BigDecimal.ZERO;

  @ApiModelProperty("有效底池")
  private BigDecimal validPot=BigDecimal.ZERO;

  @ApiModelProperty("打牌抽水")
  private BigDecimal pumpingAmount=BigDecimal.ZERO;

  @ApiModelProperty("保险盈亏")
  private BigDecimal insuredNetAmount;

  @ApiModelProperty("手牌盈亏")
  private BigDecimal handNetAmount;

}
