package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * 订单统计聚合包装对象
 */
@Data
public class GameOrderAggSumResp {

  @ApiModelProperty(value = "总笔数")
  private Long totalRecord;

  @ApiModelProperty(value = "总计订单金额")
  private BigDecimal totalOrderAmount=BigDecimal.ZERO;

  @ApiModelProperty(value = "总计实付金额")
  private BigDecimal totalPayAmount=BigDecimal.ZERO;

  @ApiModelProperty(value = "订单用户天维度统计Map")
  private Map<String,GameOrderAggDto> gameOrderAgMap;


}
