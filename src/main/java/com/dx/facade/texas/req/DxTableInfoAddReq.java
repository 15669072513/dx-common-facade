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
    private Integer hourTimeCount;

    @ApiModelProperty("德州扑克单牌桌累计带入上限")
    private Integer texasBringInLimit;

    @ApiModelProperty("短牌单牌桌累计带入上限")
    private Integer shortCardBringInLimit;
}
