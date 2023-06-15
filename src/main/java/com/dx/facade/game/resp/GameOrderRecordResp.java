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
   private Long id;
   /**
    * 游戏账号
    */
   @ApiModelProperty("游戏账号")
   private String gameAccount;
   /**
    * 俱乐部id
    */
   @ApiModelProperty("俱乐部id")
   private Long clubId;
   /**
    * 牌桌id
    */
   @ApiModelProperty("牌桌id")
   private Long tableId;
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
   private BigDecimal betChip;
   /**
    * 有效投注（抽水金额）
    */
   @ApiModelProperty("有效投注")
   private BigDecimal pumpingChip;
   /**
    *  盈亏的筹码
    */
   @ApiModelProperty("盈亏的筹码")
   private BigDecimal netChip;
   /**
    * 玩家ip
    */
   @ApiModelProperty("玩家ip")
   private String ipAddr;
   /**
    * 牌局开始时间
    */
   @ApiModelProperty("投注时间")
   private LocalDateTime handBeginDate;
   /**
    *  终端类型
    */
   @ApiModelProperty("终端类型")
   private Integer deviceType;
   /**
    * 结算状态 (0已结算 1未结算 2取消)
    */
   private Integer status;
   /**
    * 牌局结束时间
    */
   @ApiModelProperty("结算时间")
   private LocalDateTime handEndDate;

}
