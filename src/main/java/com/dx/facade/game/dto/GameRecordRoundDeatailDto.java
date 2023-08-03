package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
@ApiModel("牌局回顾详情明细")
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class GameRecordDeatailPackResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("圈层")
    private String roundCode;

    @ApiModelProperty("显示牌")
    private String showCards;

    @ApiModelProperty("底池金额")
    private BigDecimal potAmount;

    @ApiModelProperty("玩家位置")
    private String seatType;

    @ApiModelProperty("玩家昵称")
    private String nickName;

    @ApiModelProperty("玩家下注指令")
    private String betAction;

    @ApiModelProperty("玩家下注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("玩家剩余筹码")
    private BigDecimal afterChip;

    @ApiModelProperty("玩家操作后底池")
    private BigDecimal leijiPotAmount;

    @ApiModelProperty("弃牌玩家数")
    private Integer losePalyers;

    @ApiModelProperty("玩家手牌")
    private String handInfo;

    @ApiModelProperty("输赢筹码")
    private BigDecimal netAmount;

    @ApiModelProperty("当前局数")
    private Long roundNum;

    @ApiModelProperty("总局数")
    private Long totalRound;
}
