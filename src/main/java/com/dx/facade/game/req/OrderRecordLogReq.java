package com.dx.facade.game.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@ApiModel("保订单记录请求参数")
@Data
public class OrderRecordLogReq {
  @ApiModelProperty(value = "订单流水号")
  @NotNull(message = "请选择牌桌")
  private String serialNo;

  @ApiModelProperty(value = "消息类型 1订单创建  2订单结果通知")
  private Integer msgType;
}
