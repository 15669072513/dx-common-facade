package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class GameOrderRecordHandUserResp implements Serializable {

    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("手牌id")
    private Long handId;

    @ApiModelProperty("会员id")
    private String userId;
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
     * 手牌信息
     */
    @ApiModelProperty("手牌信息")
    private String handInfo;

}
