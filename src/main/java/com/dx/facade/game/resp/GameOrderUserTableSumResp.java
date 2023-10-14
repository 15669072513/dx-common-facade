package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 牌局信息表
 */
@Data
public class GameOrderUserTableSumResp implements Serializable {
    /**
     *  牌桌id
     */
    @ApiModelProperty("牌桌id")
    private Long tableId;
    /**
     * 牌桌创建时间
     */
    @ApiModelProperty("牌桌创建时间")
    private Long tableCreateDate;
    /**
     * 时长
     */
    @ApiModelProperty("牌桌时长")
    private Long timeCount=0L;
    /**
     * 牌桌名称
     */
    @ApiModelProperty("牌桌名称")
    private String tableName;
    /**
     * 头像
     */
    @ApiModelProperty("头像")
    private String userHeadUrl;
    /**
     * 玩家昵称
     */
    @ApiModelProperty("玩家昵称")
    private String nickName;
    /**
     * 盈亏筹码
     */
    @ApiModelProperty("盈亏筹码")
    private BigDecimal netAmount=BigDecimal.ZERO;
    /***
     * 小盲注
     */
    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore=BigDecimal.ZERO;

    /***
     * 大盲注
     */
    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore=BigDecimal.ZERO;

}
