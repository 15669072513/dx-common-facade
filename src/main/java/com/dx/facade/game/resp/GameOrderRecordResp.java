package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 游戏记录结果对象
 */
@Data
public class GameOrderRecordResp implements Serializable {
   /**
    * 主键id
    */
   @ApiModelProperty("德信注单id")
   private String id;
   /**
    * 游戏账号
    */
   @ApiModelProperty("游戏账号")
   private String playerName;
   /**
    * 俱乐部id
    */
   @ApiModelProperty("俱乐部id")
   private String clubId;
   /**
    * 牌桌id
    */
   @ApiModelProperty("牌桌id")
   private String tableId;
   /**
    * 牌桌名称
    */
   @ApiModelProperty("牌桌名称")
   private String tableName;
   /**
    * 游戏名称
    */
   @ApiModelProperty("游戏名称")
   private String gameName;
   /**
    * 手牌id
    */
   @ApiModelProperty("手牌id")
   private String handId;
   /**
    * 投注金额
    */
   @ApiModelProperty("投注金额")
   private BigDecimal betAmount;
   /**
    * 有效投注（抽水金额）
    */
   @ApiModelProperty("有效投注")
   private BigDecimal validBetAmount;
   /**
    *  盈亏的筹码
    */
   @ApiModelProperty("输赢金额")
   private BigDecimal netAmount;
   /**
    * 玩家ip
    */
   @ApiModelProperty("玩家ip")
   private String loginIp;
   /**
    * 牌局开始时间
    */
   @ApiModelProperty("投注时间")
   private String handBeginDate;
   /**
    *  终端类型
    */
   @ApiModelProperty("终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP）")
   private Integer obDeviceType;
   /**
    * 结算状态 (0已结算 1未结算 2取消)
    */
   @ApiModelProperty("注单状态 0-未结算 1已结算 2-不结算")
   private Integer obBetStatus;
   /**
    * 牌局结束时间
    */
   @ApiModelProperty("结算时间")
   private String handEndDate;

   @ApiModelProperty("场馆类型code(如zr,ty,qkl)")
   private String venueTypeCode;
   @ApiModelProperty("游戏类型 2001 德州游戏 2002 德州短牌局")
   private Integer gameType;

}
