package com.dx.facade.game.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@ApiModel("保险列表")
@Data
public class InsuranceInfoResp {

  @ApiModelProperty(value = "主键")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long id;

  @ApiModelProperty(value = "牌桌id")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long tableId;

  @ApiModelProperty(value = "牌桌编码")
  private String tableCode;

  @ApiModelProperty(value = "牌桌名称")
  private String tableName;

  @ApiModelProperty(value = "牌桌类型 2001:德州局 2002:短牌局")
  private Long tableType;

  @ApiModelProperty(value = "俱乐部id")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long clubId;

  @ApiModelProperty(value = "俱乐部名称")
  private String clubName;

  @ApiModelProperty(value = "手牌号")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long handId;

  @ApiModelProperty(value = "手牌编码")
  private String handCode;

  @ApiModelProperty(value = "局次")
  private Long roundNo;

  @ApiModelProperty(value = "消息事件id")
  private String eventId;

  @ApiModelProperty(value = "游戏类型注单id（关联注单表bw_game_record_dx主键id）")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long orderId;

  @ApiModelProperty(value = "保险类型注单id（关联注单表bw_game_record_dx主键id，保险注单类型id可以为空，没有购买就为空）")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long insuredOrderId;

  @ApiModelProperty(value = "购买类型 0放弃购买 1主动购买 2强制购买")
  private Integer buyType;

  @ApiModelProperty(value = "手牌圈层")
  private Integer roundCode;

  @ApiModelProperty(value = "玩家ID")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long userId;

  @ApiModelProperty(value = "玩家账号")
  private String userName;

  @ApiModelProperty(value = "玩家昵称")
  private String nickName;

  @ApiModelProperty(value = "最大投保额")
  private BigDecimal maxInsuredAmount;

  @ApiModelProperty(value = "最小投保额")
  private BigDecimal minInsuredAmount;

  @ApiModelProperty(value = "投注金额")
  private BigDecimal betAmount;

  @ApiModelProperty(value = "投保赔付额(爆牌)")
  private BigDecimal insuredRewards;

  @ApiModelProperty(value = "保险投注额")
  private BigDecimal insuredAmount;

  @ApiModelProperty(value = "保险输赢")
  private BigDecimal insuredNetAmount;

  @ApiModelProperty(value = "底池")
  private BigDecimal potAmount;

  @ApiModelProperty(value = "池子编号")
  private String potNo;

  @ApiModelProperty(value = "公牌")
  private String publicCards;

  @ApiModelProperty(value = "手牌")
  private String handCards;

  @ApiModelProperty(value = "创建时间")
  private Long createTime;

  @ApiModelProperty(value = "创建人")
  private String createBy;

  @ApiModelProperty(value = "修改时间")
  private Long updateTime;

  @ApiModelProperty(value = "修改人")
  private String updateBy;

  @ApiModelProperty(value = "上级代理账号")
  private String parentProxyName;

//  @ApiModelProperty(value = "总代账号")
//  private String topProxyName;
}
