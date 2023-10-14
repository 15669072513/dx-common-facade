package com.dx.facade.game.resp;

import com.dx.facade.common.utils.DateUtils;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 牌桌信息
 */
@Data
public class GameOrderTableDetailSumResp implements Serializable {
    /**
     *  牌桌id
     */
    @ApiModelProperty("牌桌id")
    private Long tableId;
    /**
     * 玩家id
     */
    @ApiModelProperty("玩家id")
    private Long userId;
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
     * 牌桌时间
     */
    @ApiModelProperty("牌桌时间")
    private Long tableCreateDate;
    /**
     * 牌桌开始时间
     */
    @ApiModelProperty("牌桌开始时间")
    private String tableCreateDateStr;
    /**
     * 时长
     */
    @ApiModelProperty("时长")
    private Integer timeCount=0;

    /**
     * 牌桌名称
     */
    @ApiModelProperty("牌桌名称")
    private String tableName;

    /**
     * 牌桌手数
     */
    @ApiModelProperty("牌桌手数")
    private Long handCount=0L;
    /**
     * 牌桌流水
     */
    @ApiModelProperty("牌桌流水")
    private BigDecimal betAmountSum=BigDecimal.ZERO;
    /**
     *  牌桌带入
     */
    @ApiModelProperty("牌桌带入")
    private BigDecimal bringChipSum=BigDecimal.ZERO;
    /**
     *  最大底池
     */
    @ApiModelProperty("最大底池")
    private BigDecimal maxEffectivePool=BigDecimal.ZERO;
    /**
     *  盈亏筹码
     */
    @ApiModelProperty("盈亏筹码")
    private BigDecimal netAmountSum=BigDecimal.ZERO;
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

    public String getTableCreateDateStr() {
        if (tableCreateDate != null) {
            return DateUtils.getHHmm(tableCreateDate);
        }
        return null;
    }

}
