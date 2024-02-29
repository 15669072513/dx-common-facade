package com.dx.facade.game.resp.gamedetail;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

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
        private Long duration = 0L;

        /**
         * 牌桌手数
         */
        @ApiModelProperty("全部手数")
        private Long handCount = 0L;
        /**
         * 牌桌流水
         */
        @ApiModelProperty("全部流水")
        private BigDecimal betAmountSum = BigDecimal.ZERO;
        ;

        /**
         * 牌桌带入
         */
        @ApiModelProperty("全部带入")
        private BigDecimal bringChipSum = BigDecimal.ZERO;

        /**
         * 最大底池
         */
        @ApiModelProperty("最大底池")
        private BigDecimal maxPot;

        /***
         * 小盲注
         */
        @ApiModelProperty("小盲注")
        private BigDecimal sbBlindScore = BigDecimal.ZERO;

        /***
         * 大盲注
         */
        @ApiModelProperty("大盲注")
        private BigDecimal bbBlindScore = BigDecimal.ZERO;

        /**
         * 保险池
         */
        @ApiModelProperty("保险池")
        private BigDecimal insurePoolSum;

    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class GameOrderRecord {

        @ApiModelProperty("用户id")
        private Long userId;

        /**
         * 玩家昵称
         */
        @ApiModelProperty("玩家昵称")
        private String nickName;

        /**
         * 牌桌带入
         */
        @ApiModelProperty("总带入")
        private BigDecimal bringChipSum = BigDecimal.ZERO;

        /**
         * 盈亏筹码
         */
        @ApiModelProperty("当前盈亏")
        private BigDecimal netAmountSum = BigDecimal.ZERO;

        /**
         * 手牌数
         */
        @ApiModelProperty("手牌数")
        private int handCount = 0;

        /**
         * 主动入池次数
         */
        @ApiModelProperty("主动入池次数")
        private Long activeBringPoolNumber = 0L;

        /**
         * Walks手牌数
         */
        @ApiModelProperty("Walks手牌数")
        private Long walksHandNumber = 0L;

        /**
         * 总手数
         */
        @ApiModelProperty("总手数")
        private Long handNumberTotal = 0L;


        /**
         * 记录标记（2，手续费已处理完成）
         */
        @ApiModelProperty("记录标记")
        private Integer flag = 0;

        public boolean issTableFeeProcessEnd() {
            return Objects.nonNull(flag) && flag == 2;
        }
    }

}
