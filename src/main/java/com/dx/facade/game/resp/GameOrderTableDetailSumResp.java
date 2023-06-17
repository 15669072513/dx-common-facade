package com.dx.facade.game.resp;

import com.dx.facade.common.utils.DateUtils;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 牌桌信息
 */
@Data
public class GameOrderTableDetailSumResp implements Serializable {
    /**
     *  牌桌id
     */
    private Long tableId;
    /**
     * 玩家id
     */
    private Long userId;
    /**
     * 头像
     */
    private String userHearUrl;

    /**
     * 玩家昵称
     */
    private String nickName;
    /**
     * 牌桌时间
     */
    private Long tableCreateDate;
    /**
     * 牌桌开始时间
     */
    private String tableCreateDateStr;
    /**
     * 时长
     */
    private Integer timeCount;

    /**
     * 牌桌名称
     */
    private String tableName;

    /**
     * 牌桌手数
     */
    private Long handCount;
    /**
     * 牌桌流水
     */
    private BigDecimal betAmountSum;
    /**
     *  牌桌带入
     */
    private BigDecimal bringChipSum;
    /**
     *  最大底池
     */
    private BigDecimal maxEffectivePool;
    /**
     *  盈亏筹码
     */
    private BigDecimal netAmountSum;
    /***
     * 小盲注
     */
    private BigDecimal sbBlindScore;

    /***
     * 大盲注
     */
    private BigDecimal bbBlindScore;

    public String getTableCreateDateStr() {
        if (tableCreateDate != null) {
            return DateUtils.getHHmm(tableCreateDate);
        }
        return null;
    }

}
