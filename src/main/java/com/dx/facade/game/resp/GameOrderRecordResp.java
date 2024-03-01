package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

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
   @ApiModelProperty("3方注单id")
   private String generatedId;
   /**
    * 游戏账号
    */
   @ApiModelProperty("游戏账号")
   private String playerName;
   /**
    * 俱乐部id
    */
   @ApiModelProperty("俱乐部id")
   private Long clubId;
   /**
    * 牌桌id
    */
   @ApiModelProperty("牌桌id")
   private String tableId;

   /**
    * 牌桌code
    */
   @ApiModelProperty("牌桌code")
   private String tableCode;

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
   private BigDecimal betAmount=BigDecimal.ZERO;
   /**
    * 有效投注（抽水金额）
    */
   @ApiModelProperty("有效投注")
   private BigDecimal validBetAmount=BigDecimal.ZERO;
   /**
    *  盈亏的筹码
    */
   @ApiModelProperty("输赢金额")
   private BigDecimal netAmount=BigDecimal.ZERO;

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

   @ApiModelProperty("币种")
   private String memberCurrency;

   @ApiModelProperty(value = "二级类型 对应枚举GameRecordTypeEnum")
   private Integer betType;

   @ApiModelProperty(value = "二级类型对应枚举GameRecordTypeEnum")
   private String betTypeDesc;

   @ApiModelProperty(value = "一级类型 对应枚举GameRecordTypeEnum")
   private Integer parentOrderType;

   @ApiModelProperty(value = "一级类型 对应枚举GameRecordTypeEnum")
   private String parentOrderTypeDesc;

   @ApiModelProperty(value = "服务费贡献")
   private BigDecimal pumpContribution;


   @ApiModelProperty("会员id")
   private Long memberId;

   @ApiModelProperty("手牌信息")
   private String handInfo;

   @ApiModelProperty("用户昵称")
   private String nickName;

   @ApiModelProperty("牌型")
   private String resultInfo;

   @ApiModelProperty(value = "公牌信息")
   private String globalPokerCode;

   @ApiModelProperty(value = "是否亮牌标识 1 亮牌，2非亮牌")
   private Integer showStatus;

   @ApiModelProperty("总输赢（打牌输赢+保险输赢）")
   private BigDecimal totalNetAmount = BigDecimal.ZERO;

   @ApiModelProperty(value = "成牌时7张牌舍弃的2张牌")
   private String loseCards;

   @ApiModelProperty(value = "游戏注单扩展属性字段JSON")
   private String extendProperty;
}
