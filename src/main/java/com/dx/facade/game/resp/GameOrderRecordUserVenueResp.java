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
public class GameOrderRecordUserVenueResp implements Serializable {

   /**
    * 会员账号
    */
   @ApiModelProperty("会员账号")
   private String userName;
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
   private Integer status;

   /**
    * 投注金额
    */
   @ApiModelProperty("投注金额")
   private Long betChip;
   /**
    * 有效投注
    */
   @ApiModelProperty("有效投注")
   private String pumpingChip;

   /**
    *  游戏盈亏
    */
   @ApiModelProperty("游戏盈亏")
   private BigDecimal netChip;
   /**
    * 结算时
    */
   @ApiModelProperty("结算时间")
   private LocalDateTime ipAddr;

}
