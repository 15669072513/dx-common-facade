package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author dereck
 * @since 2022-10-13
 */
@Data
public class DxTableInfoAddReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("游戏类型id")
    private Long tableId;

    @ApiModelProperty("牌桌code")
    private String tableCode;

    @ApiModelProperty("房主ID")
    private Long holderId;

    @ApiModelProperty("房主名称")
    private String holderName;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @ApiModelProperty("牌桌类型 2001：德州局 2002：短牌局")
    private Long tableType;

    @ApiModelProperty("关联游戏id")
    private Long gameTypeId;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("关联俱乐部id")
    private Long clubId;

    @ApiModelProperty("关联俱乐部名称")
    private String clubName;

    @ApiModelProperty("牌桌最大人数")
    private Integer maxSeats;

    @ApiModelProperty("自动开局人数")
    private Integer autoStartUserCounts;

    @ApiModelProperty("牌桌局数")
    private Integer tableHandNumber;

    @ApiModelProperty("时长（min）")
    private Integer timeCount;

    @ApiModelProperty("最小带入的筹码")
    private BigDecimal minBringChipScore;

    @ApiModelProperty("最大带入的筹码")
    private BigDecimal maxBringChipScore;

    @ApiModelProperty("默认带入筹码")
    private BigDecimal bringChipScore;

    @ApiModelProperty("玩家总带出")
    private BigDecimal bringOutChipScore;

    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore;

    @ApiModelProperty("抽水比例")
    private BigDecimal rake;

    @ApiModelProperty("牌桌状态：0 未开始，1 进行中 2已结束")
    private Integer status;

    @ApiModelProperty("牌桌结束时间")
    private LocalDateTime tableEndTime;

    @ApiModelProperty("牌桌结束类型：0强制解散 1房间内解散 2正常结束")
    private Integer overType;

    @ApiModelProperty("累计参与者")
    private Integer participantTotal;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    private Integer deleteFlag;

    @ApiModelProperty("牌桌开始时间")
    private LocalDateTime tableBeginTime;

    @ApiModelProperty("进行时间（min）")
    private Integer onlineTime;

    /** 人员上限 */
    @ApiModelProperty("人员上限")
    private Integer upperLimit;

    @ApiModelProperty("同时开牌桌上限")
    private Integer cardTableLimit;

    @ApiModelProperty("单牌桌旁观人数上限")
    private Integer lookOnLimit;

    @ApiModelProperty("入座实时人数上限（控制实时账单 展示人数控制）")
    private Integer seatsNumberLimit;

    @ApiModelProperty("总代id")
    private Long topProxyId;

    @ApiModelProperty("总代名称")
    private String topProxyName;

    @ApiModelProperty("时长（小时）")
    private BigDecimal hourTimeCount;

    @ApiModelProperty("单牌桌累计带入上限")
    private Integer bringInLimit;
    @ApiModelProperty("单牌桌可坐下人数上限")
    private Integer sitDownLimit;

    @ApiModelProperty("玩家总带入")
    private BigDecimal bringInChipScore;

    @ApiModelProperty("总打牌抽水")
    private BigDecimal pumpingAmountTotal;

    @ApiModelProperty("盈亏金额")
    private BigDecimal netAmount;

    @ApiModelProperty("牌桌总费用")
    private BigDecimal costTotal;
    @ApiModelProperty("保险模式 0-不开保险 1-经典保险")
    private Integer insuranceMode;
    @ApiModelProperty("turn购买保险最低值,整数类型")
    private BigDecimal insuranceTurn;
    @ApiModelProperty("选张购买功能 false-不选张 true-选张")
    private Boolean insuranceChooseSheet;
    @ApiModelProperty("保险触发下限")
    private Integer insuranceLowerLimit;

    @ApiModelProperty("保险盈亏")
    private BigDecimal insuredNetAmount;

    @ApiModelProperty("ALLIN展示OUTS与胜率 0-关闭 1-开启 2-关闭隐藏")
    private Integer showOutsWinn;

    @ApiModelProperty("允许主动带出0-关闭 1-开启 2-关闭隐藏")
    private Integer isActiveTakeout;

    @ApiModelProperty("必要保留筹码（倍大盲）")
    private Integer needKeepChips;

    @ApiModelProperty("服务费类型 1-按底池比例 2-按盈利比例 3-无")
    private Integer serviceChargeType;

    @ApiModelProperty("每手收费上限（倍大盲）")
    private BigDecimal handChargeUpperLimit;

    @ApiModelProperty("隐藏小数开关 0-关闭 1-开启 2-关闭隐藏")
    private Integer isHiddenDecimal;

    @ApiModelProperty("收费比例")
    private BigDecimal chargeScale;

    @ApiModelProperty("preflop看牌 0-配置没开启  1-关 2-开 默认为0")
    private Integer preflopDelay;

    @ApiModelProperty("前注功能 0-关闭 1-开启 2-关闭隐藏")
    private Integer anteSwitch;

    @ApiModelProperty("前注金额")
    private BigDecimal anteScore;

    @ApiModelProperty("前注（倍BB）,支持小数点1位")
    private BigDecimal anteLimit;

    @ApiModelProperty("语音聊天功能 0-关闭 1-开启 2-关闭隐藏")
    private Integer voiceChatSwitch;

    @ApiModelProperty("入桌密码功能 0-关闭 1-开启 2-关闭隐藏")
    private Integer tableEntryPasswordSwitch;

    @ApiModelProperty("入桌密码")
    private String tableEntryPassword;

    @ApiModelProperty("仅限直属会员可见开关 0-隐藏 1-可见'")
    private Integer onlyDirectMemberSwitch;

    @ApiModelProperty("仅限直属会员可见(默认关闭) 0-关闭 1-开启")
    private Integer onlyDirectMember;

    @ApiModelProperty("局服务费 0-配置没开启  1-关 2-开 默认为0")
    private Integer tableFeeSwitch;

    @ApiModelProperty("局服务费")
    private BigDecimal tableFee;

    @ApiModelProperty("局服务费比例")
    private BigDecimal tableFeeScale;
}
