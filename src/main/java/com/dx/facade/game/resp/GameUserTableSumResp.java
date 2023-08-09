package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("会员详情-牌桌列表返回对象")
@Data
public class GameUserTableSumResp {
    @ApiModelProperty("牌桌ID")
    private Long tableId;
    @ApiModelProperty("牌桌名称")
    private String tableName;
    @ApiModelProperty("牌桌创建时间")
    private Long tableCreateDate;
    @ApiModelProperty("游戏名称")
    private String gameName;
    @ApiModelProperty("俱乐部id")
    private Long clubId;
    @ApiModelProperty("俱乐部名称")
    private String clubName;
    @ApiModelProperty("牌桌状态")
    private Integer tableStatus;
    @ApiModelProperty("累计盈利")
    private BigDecimal netAmount;
    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount;
    @ApiModelProperty("累计抽水总额")
    private BigDecimal pumpingAmount;
}
