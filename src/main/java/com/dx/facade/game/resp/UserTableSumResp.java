package com.dx.facade.game.resp;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel("用户牌桌维度数据统计-返回对象")
@Data
public class UserTableSumResp {

  @ApiModelProperty("用户总盈亏")
  private BigDecimal totalNetAmount= new BigDecimal(0);
}
