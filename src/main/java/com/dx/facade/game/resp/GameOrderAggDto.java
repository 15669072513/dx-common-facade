package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;


/**
 * 订单用户天维度统计Dto
 */
@Data
public class GameOrderAggDto {

  @ApiModelProperty(value = "订单日期")
  private String orderDate;

  @ApiModelProperty(value = "用户Id")
  private Long userId;

  @ApiModelProperty(value = "总笔数")
  private Long totalRecord;

  @ApiModelProperty(value = "总计订单金额")
  private BigDecimal totalOrderAmount=BigDecimal.ZERO;

  @ApiModelProperty(value = "总计实付金额")
  private BigDecimal totalPayAmount=BigDecimal.ZERO;
}
