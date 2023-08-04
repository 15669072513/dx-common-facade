package com.dx.facade.game.dto;

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
public class GameRecordRoundDeatailDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("圈层")
    private int roundCode;

    @ApiModelProperty("公牌")
    private String publicCards;

    @ApiModelProperty("手牌")
    private String handCards;

    @ApiModelProperty("座位号")
    private Integer chairId;

    @ApiModelProperty("座位类型大类 1:前位 2:中位 3:后位 4:盲位")
    private Integer seatType;

    @ApiModelProperty("座位类型,参考枚举:TexasSeatTypeEnum")
    private Integer seatCode;

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

    /**
     * 开牌结果（#PokerResultInfoEnum）
     */
    @ApiModelProperty("牌型")
    private String resultInfo;

    @ApiModelProperty("输赢筹码")
    private BigDecimal netAmount;

}
