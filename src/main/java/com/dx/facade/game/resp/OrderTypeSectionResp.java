package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;

/**
 * 查询订单类型下拉框
 */
@Data
public class OrderTypeSectionResp {

  @ApiModelProperty("订单类型code")
  private int type;

  @ApiModelProperty("订单父类型code")
  private int parentType;

  @ApiModelProperty("订单类型描述")
  private  String desc;

  @ApiModelProperty("排序值")
  private int sortValue;

  @ApiModelProperty("是否启用")
  private boolean enable;

  @ApiModelProperty("订单子类")
  private List<OrderTypeSectionResp> subList;

}
