package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("保险列表请求实体")
@Data
public class InsuranceInfoListReq extends BaseRequest {

  @ApiModelProperty(value = "牌桌编码")
  private String tableCode;

  @ApiModelProperty(value = "手牌编码")
  private String handCode;

  @ApiModelProperty("牌桌类型 2001：德州局 2002：短牌局")
  private Long tableType;

//  @ApiModelProperty("游戏ID")
//  private Long gameTypeId;

  @ApiModelProperty("俱乐部主键")
  private Long clubId;

  @ApiModelProperty("保险ID")
  private Long insuranceId;

  @ApiModelProperty(value = "购买类型 0放弃购买 1主动购买 2强制购买")
  private Integer buyType;

  @ApiModelProperty("总代id")
  private Long topProxyId;
}
