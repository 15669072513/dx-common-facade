package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiOperation("牌桌详情")
public class DxTableConfigRuleResp implements Serializable {

    private static final long serialVersionUID = -2030176995976248512L;
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
    private Integer maxSeats=0;

    /***
     * 自动开局人数
     */
    @ApiModelProperty("自动开局人数")
    private Integer autoStartUserCounts=0;

    /**
     * 默认带入的筹码
     */
    @ApiModelProperty("默认带入的筹码")
    private BigDecimal bringChipScore=BigDecimal.ZERO;

    /**
     * 默认带入的筹码BB = 默认带入的筹码 除以 大盲注
     */
    @ApiModelProperty("默认带入的筹码(倍BB)")
    private BigDecimal bringChipTimes = BigDecimal.ZERO;

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

    /**
     * 时长 单位 分钟
     */
    @ApiModelProperty("时长 单位 分钟")
    private Integer timeCount=0;

    /**
     * 最小带入的筹码
     */
    @ApiModelProperty("最小带入的筹码")
    private BigDecimal minBringChipScore=BigDecimal.ZERO;

    /**
     * 最大带入的筹码
     */
    @ApiModelProperty("最大带入的筹码")
    private BigDecimal maxBringChipScore=BigDecimal.ZERO;

    /**
     * 抽水比例配置
     */
    @ApiModelProperty("抽水比例配置, 游戏内计算")
    private BigDecimal rake=BigDecimal.ZERO;

    /**
     * 抽水比例配置
     */
    @ApiModelProperty("抽水比例配置, 游戏配置")
    private BigDecimal gameRake=BigDecimal.ZERO;

    /** 人员上限 */
    @ApiModelProperty("人员上限")
    private Integer upperLimit=0;

    @ApiModelProperty("同时开牌桌上限")
    private Integer cardTableLimit=0;

    @ApiModelProperty("单牌桌旁观人数上限")
    private Integer lookOnLimit=0;

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

    @ApiModelProperty("总输赢（打牌输赢+保险输赢）")
    private BigDecimal totalNetAmount= BigDecimal.ZERO;

    @ApiModelProperty("打牌输赢")
    private BigDecimal netAmount= BigDecimal.ZERO;

    @ApiModelProperty("保险输赢")
    private BigDecimal insuredNetAmount= BigDecimal.ZERO;

    @ApiModelProperty("总带出")
    private BigDecimal bringOutChipScore= BigDecimal.ZERO;

    @ApiModelProperty("手牌数")
    private Long handCount=0L;

    @ApiModelProperty("牌桌总抽水")
    private BigDecimal pumpingAmountTotal = BigDecimal.ZERO;

    @ApiModelProperty("牌桌总输赢")
    private BigDecimal costTotal=BigDecimal.ZERO;

    @ApiModelProperty("游戏类型名称")
    private String gameTypeName;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("累计参与者")
    private Integer participantTotal=0;

    @ApiModelProperty("超时（min）自动解散房间")
    private Integer gameOvertime=0;

    @ApiModelProperty("进行时间（min）")
    private Integer onlineTime=0;

    @ApiModelProperty("实际最小带入的筹码")
    private BigDecimal realMinBringChipScore=BigDecimal.ZERO;

    @ApiModelProperty("实际最大带入的筹码")
    private BigDecimal realMaxBringChipScore=BigDecimal.ZERO;

    @ApiModelProperty("入座实时人数上限（控制实时账单 展示人数控制）")
    private Integer seatsNumberLimit=0;

    @ApiModelProperty("时长（小时）")
    private BigDecimal hourTimeCount=BigDecimal.ZERO;

    @ApiModelProperty("单牌桌累计带入上限（倍数）")
    private Integer bringInLimit=0;

    @ApiModelProperty("单牌桌累计带入上限（金额）")
    private BigDecimal bringInLimitChipScore=BigDecimal.ZERO;

    @ApiModelProperty("单牌桌可坐下人数上限")
    private Integer sitDownLimit=0;

    @ApiModelProperty("保险模式 0-不开保险 1-经典保险")
    private Integer insuranceMode;

    @ApiModelProperty("保险模式中文描述 0-不开保险 1-经典保险")
    private String insuranceModeStr;

    @ApiModelProperty("turn购买保险最低值,整数类型")
    private BigDecimal insuranceTurn=BigDecimal.ZERO;
    @ApiModelProperty("选张购买功能 false-不选张 true-选张")
    private Boolean insuranceChooseSheet;
    @ApiModelProperty("保险触发下限")
    private Integer insuranceLowerLimit=0;
}
