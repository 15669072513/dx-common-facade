package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiOperation("牌桌详情")
public class DxTableConfigRuleResp {

    /***
     * 房主id
     */
    @ApiModelProperty("房主id")
    private Long holderId;

    /***
     * 房主id
     */
    @ApiModelProperty("房主名称")
    private String holderName;

    /***
     * 牌桌id
     */
    @ApiModelProperty("牌桌id")
    private Long tableId;

    /***
     * 牌桌code
     */
    @ApiModelProperty("牌桌code")
    private String tableCode;

    /***
     * 俱乐部id
     */
    @ApiModelProperty("俱乐部id")
    private Long clubId;

    /***
     * 牌桌类型 2001L:德州局 2002L:短牌局
     */
    @ApiModelProperty("牌桌类型 2001L:德州局 2002L:短牌局")
    private Long tableType;

    /***
     * 牌桌名称
     */
    @ApiModelProperty("牌桌名称")
    private String tableName;

    /***
     * 牌桌最大人数
     */
    @ApiModelProperty("牌桌最大人数")
    private Integer maxSeats;

    /***
     * 自动开局人数
     */
    @ApiModelProperty("自动开局人数")
    private Integer autoStartUserCounts;

    /**
     * 默认带入的筹码
     */
    @ApiModelProperty("默认带入的筹码")
    private BigDecimal bringChipScore;

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

    /**
     * 时长 单位 分钟
     */
    @ApiModelProperty("时长 单位 分钟")
    private Integer timeCount;

    /**
     * 最小带入的筹码
     */
    @ApiModelProperty("最小带入的筹码")
    private BigDecimal minBringChipScore;

    /**
     * 最大带入的筹码
     */
    @ApiModelProperty("最大带入的筹码")
    private BigDecimal maxBringChipScore;

    /**
     * 抽水比例配置
     */
    @ApiModelProperty("抽水比例配置")
    private BigDecimal rake;

    /** 人员上限 */
    @ApiModelProperty("人员上限")
    private Integer upperLimit;

    @ApiModelProperty("同时开牌桌上限")
    private Integer cardTableLimit;

    @ApiModelProperty("单牌桌旁观人数上限")
    private Integer lookOnLimit;

    @ApiModelProperty("牌桌状态：0 未开始，1 进行中 2已结束")
    private Integer status;

    @ApiModelProperty("创建时间")
    private Long createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("牌桌开始时间")
    private Long tableBeginTime;

    @ApiModelProperty("牌桌结束时间")
    private Long tableEndTime;

    @ApiModelProperty("手牌数")
    private Long handCount;

    @ApiModelProperty("牌桌总抽水")
    private BigDecimal pumpingAmountTotal = BigDecimal.ZERO;

    @ApiModelProperty("牌桌总费用")
    private BigDecimal costTotal;

    @ApiModelProperty("游戏名称")
    private String gameTypeName;

    @ApiModelProperty("累计参与者")
    private Integer participantTotal;

    @ApiModelProperty("超时（min）自动解散房间")
    private Integer gameOvertime;

    @ApiModelProperty("进行时间（min）")
    private Integer onlineTime;
}
