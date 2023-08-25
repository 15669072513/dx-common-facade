<<<<<<< HEAD
package com.dx.facade.game.resp;

import com.dx.facade.enums.TexasGameTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("资金明细页返回实体")
@Data
public class FundDetailRecordResp {
  @ApiModelProperty("generatedId")
  private String generatedId;
  @ApiModelProperty("用户ID")
  private Long userId;
  @ApiModelProperty("游戏名称")
  private String gameName;
  @ApiModelProperty("游戏ID")
  private String gameId;
  @ApiModelProperty("游戏类型 2001:德州局 2002:短牌局")
  private TexasGameTypeEnum gameType;
  @ApiModelProperty("注单状态 0未结算 1已结算 2不结算")
  private Integer obBetStatus;
  @ApiModelProperty("投注金额")
  private BigDecimal betAmount;
  @ApiModelProperty("有效投注")
  private BigDecimal validBetAmount;
  @ApiModelProperty("输赢")
  private BigDecimal netAmount;
  @ApiModelProperty("时间")
  private Long handBeginDate;
}
=======
package com.dx.facade.game.resp;

import com.dx.facade.enums.TexasGameTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("资金明细页返回实体")
@Data
public class FundDetailRecordResp {
  @ApiModelProperty("generatedId")
  private String generatedId;
  @ApiModelProperty("用户ID")
  private Long userId;
  @ApiModelProperty("游戏名称")
  private String gameName;
  @ApiModelProperty("游戏ID")
  private String gameId;
  @ApiModelProperty("游戏类型 0德州 1短牌")
  private TexasGameTypeEnum gameType;
  @ApiModelProperty("注单状态 0未结算 1已结算 2不结算")
  private Integer obBetStatus;
  @ApiModelProperty("投注金额")
  private BigDecimal betAmount;
  @ApiModelProperty("有效投注")
  private BigDecimal validBetAmount;
  @ApiModelProperty("输赢")
  private BigDecimal netAmount;
  @ApiModelProperty("时间")
  private Long handBeginDate;
}
>>>>>>> origin/feature/develop_v2
