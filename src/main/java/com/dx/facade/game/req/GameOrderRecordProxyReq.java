package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 游戏记录结果对象
 */
@Data
public class GameOrderRecordProxyReq extends BaseRequest {
   /**
    * 上级代理id
    */
   @ApiModelProperty("上级代理id")
   private Long parentProxyId;
   /**
    * 会员账号
    */
   @ApiModelProperty("会员账号")
   private String memberName;
   /**
    * 游戏名称
    */
   @ApiModelProperty("游戏名称")
   private String gameName;

   @ApiModelProperty("注单状态 0已结算 1未结算 2取消")
   private Integer obBetStatus;

   @ApiModelProperty(value = "投注开始时间(时间戳)")
   private Long betStartTime;

   @ApiModelProperty(value = "投注结束时间(时间戳)")
   private Long betEndTime;

   @ApiModelProperty("所有下级代理id集合")
   private List<Long> subProxyIdList;

}
