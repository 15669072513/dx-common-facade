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

   @ApiModelProperty("注单号")
   private Long id;
   @ApiModelProperty("游戏账号")
   private String ganmeAccount;
   @ApiModelProperty("俱乐部id")
   private String clueId;
   @ApiModelProperty("牌桌id")
   private String tableId;
   @ApiModelProperty("场馆名称")
   private String venueName;
   @ApiModelProperty("手牌id")
   private String handId;
   @ApiModelProperty("投注金额")
   private String betChip;
   @ApiModelProperty("有效投注")
   private BigDecimal effectivePool;

}
