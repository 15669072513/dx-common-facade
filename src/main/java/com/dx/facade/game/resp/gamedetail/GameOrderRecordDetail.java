package com.dx.facade.game.resp.gamedetail;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author Rock
 **/
@Data
@Builder
public class GameOrderRecordDetail implements Serializable {

    private List<GameOrderRecord> recordList;

    private GameOrderRecordSummary summary;

    @Data
    public static class GameOrderRecordSummary {
        @ApiModelProperty("第一名用户id")
        private Long userId;
        @ApiModelProperty("牌桌id")
        private Long tableId;

        @ApiModelProperty("牌桌名称")
        private String tableName;

        /**
         * 牌桌时间
         */
        @ApiModelProperty("牌桌第一局开始时间")
        private Long tableBeginDate;

        /**
         * 时长
         */
        @ApiModelProperty("时长")
        private Long duration;

        /**
         * 牌桌手数
         */
        @ApiModelProperty("全部手数")
        private Long handCount;
        /**
         * 牌桌流水
         */
        @ApiModelProperty("全部流水")
        private BigDecimal betAmountSum;

        /**
         *  牌桌带入
         */
        @ApiModelProperty("全部带入")
        private BigDecimal bringChipSum;

        /**
         *  最大底池
         */
        @ApiModelProperty("最大底池")
        private BigDecimal maxPot;

        /***
         * 小盲注
         */
        @ApiModelProperty("小盲注")
        private BigDecimal sbBlindScore;

        /***
         * 大盲注
         */
        @ApiModelProperty("大盲注")
        private BigDecimal bbBlindScore;

    }
    @Data
    @Builder
    public static class GameOrderRecord {

        @ApiModelProperty("用户id")
        private Long userId;

        /**
         *  牌桌带入
         */
        @ApiModelProperty("总带入")
        private BigDecimal bringChipSum;

        /**
         *  盈亏筹码
         */
        @ApiModelProperty("当前盈亏")
        private BigDecimal netAmountSum;
    }

}
