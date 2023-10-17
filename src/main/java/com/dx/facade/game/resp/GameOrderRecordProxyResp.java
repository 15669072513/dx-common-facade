package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 游戏记录结果对象
 */
@Data
public class GameOrderRecordProxyResp implements Serializable {
   /**
    * 会员账号
    */
   @ApiModelProperty("会员账号")
   private String memberName;
   /**
    * 场馆名称
    */
   @ApiModelProperty("场馆名称")
   private String venueName;
   /**
    * 游戏名称
    */
   @ApiModelProperty("游戏名称")
   private String gameName;
   /**
    * 状态
    */
   @ApiModelProperty("状态")
   private Integer obBetStatus;
   /**
    * 投注金额
    */
   @ApiModelProperty("投注金额")
   private BigDecimal betAmount=BigDecimal.ZERO;
   /**
    * 有效投注
    */
   @ApiModelProperty("有效投注")
   private BigDecimal validBetAmount=BigDecimal.ZERO;
   /**
    *  游戏盈亏
    */
   @ApiModelProperty("游戏盈亏")
   private BigDecimal netAmount=BigDecimal.ZERO;

   @ApiModelProperty("投注时间")
   private Long handBeginDate;
   /**
    * 结算时间
    */
   @ApiModelProperty("结算时间")
   private Long handEndDate;
   /**
    * 注单id
    */
   @ApiModelProperty("注单ID")
   private String generatedId;

}
