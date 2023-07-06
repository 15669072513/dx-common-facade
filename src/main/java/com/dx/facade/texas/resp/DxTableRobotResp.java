package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("获取牌桌机器人信息")
@Data
public class DxTableRobotResp {
  @ApiModelProperty(value = "牌桌ID")
  private Long tableId;
  @ApiModelProperty(value = "机器人数量")
  private Integer robotNum;
}
