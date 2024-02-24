package com.dx.facade.game.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiModel("战绩详情信息")
public class RecordDetailSummary implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 牌桌id
     */
    @ApiModelProperty("牌桌id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long tableId;

    @ApiModelProperty("创建者")
    private String creator;

    /**
     * 玩家id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("玩家id")
    private Long userId;
    /**
     * 头像
     */
    @ApiModelProperty("头像")
    private String userHearUrl;

    /**
     * 玩家昵称
     */
    @ApiModelProperty("玩家昵称")
    private String nickName;
    /**
     * 牌桌时间
     */
    @ApiModelProperty("牌桌时间")
    private Long tableTime;
    /**
     * 时长
     */
    @ApiModelProperty("时长 单位毫秒")
    private Long ms;

    /**
     * 牌桌名称
     */
    @ApiModelProperty("牌桌名称")
    private String tableName;

    /**
     * 牌桌手数
     */
    @ApiModelProperty("牌桌手数")
    private int handCount;
    /**
     * 牌桌流水
     */
    @ApiModelProperty("牌桌流水")
    private BigDecimal betChipSum=BigDecimal.ZERO;
    /**
     * 牌桌带入
     */
    @ApiModelProperty("牌桌带入")
    private BigDecimal bringChipSum=BigDecimal.ZERO;
    /**
     * 最大底池
     */
    @ApiModelProperty("最大底池")
    private BigDecimal maxEffectivePool=BigDecimal.ZERO;

    @ApiModelProperty("盈亏筹码")
    private BigDecimal netAmount=BigDecimal.ZERO;

    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore=BigDecimal.ZERO;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore=BigDecimal.ZERO;

    @ApiModelProperty("带入钱最多的展示为土豪的用户")
    private UserSummary bringChipSumMaxUser;

    @ApiModelProperty("赢钱最多的展示为MVP的用户")
    private UserSummary netAmountMaxUser;

    @ApiModelProperty("输钱最多的展示为大鱼的用户")
    private UserSummary NetAmountMinUser;

    @ApiModelProperty("前注功能 0-关闭 1-开启 2-关闭隐藏")
    private Integer anteSwitch = 0;

    @ApiModelProperty("前注实际金额")
    private BigDecimal anteScore;

    @ApiModelProperty("保险池")
    private BigDecimal insuredPool=BigDecimal.ZERO;

    @Data
    @Builder
    public static class UserSummary {

        /**
         * 玩家id
         */
        @JsonSerialize(using = ToStringSerializer.class)
        @ApiModelProperty("玩家id")
        private Long userId;
        /**
         * 头像
         */
        @ApiModelProperty("头像")
        private String userHearUrl;

        /**
         * 玩家昵称
         */
        @ApiModelProperty("玩家昵称")
        private String nickName;

        /**
         * 备注名
         */
        @ApiModelProperty("备注名")
        private String userNameRemark;
    }
}
