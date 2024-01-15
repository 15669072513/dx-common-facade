package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

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

  @ApiModelProperty("代理id")
  private Long proxyId;

  @ApiModelProperty(value = "上级代理账号")
  private String parentProxyName;

  @ApiModelProperty(value = "总代账号")
  private String topProxyName;

  @ApiModelProperty("代理等级")
  private Integer proxyLevel;
//  @ApiModelProperty("上级代理id")
//  private Long parentProxyId;

  @ApiModelProperty("购保时间区间开始")
  private String createStartTime;

  @ApiModelProperty("购保时间区间结束")
  private String createEndTime;

  @ApiModelProperty("购保时间区间开始时间戳")
  private Long createStartTs;

  @ApiModelProperty("购保时间区间结束时间戳")
  private Long createEndTs;

  @ApiModelProperty("查询类型")
  private Integer queryType; // 1 列表查询，导出查询

  @ApiModelProperty("查询来源")
  private Integer querySource;//1 中控后台，2 代理后台

  @ApiModelProperty("下级代理id")
  private List<Long> subProxyIds;
}
