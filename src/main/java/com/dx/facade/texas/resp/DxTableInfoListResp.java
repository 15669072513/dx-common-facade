package com.dx.facade.texas.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author dereck
 * @since 2022-10-13
 */
@Data
public class DxTableInfoListResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌桌id")
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

    @ApiModelProperty("关联游戏名称")
    private String gameName;

    @ApiModelProperty("关联俱乐部id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    private String clubName;

    @ApiModelProperty("牌桌最大人数")
    private Integer maxSeats=0;

    @ApiModelProperty("自动开局人数")
    private Integer autoStartUserCounts=0;

    @ApiModelProperty("牌桌局数")
    private Integer tableHandNumber=0;

    @ApiModelProperty("时长（min）")
    private Integer timeCount=0;

    @ApiModelProperty("最小带入的筹码")
    private BigDecimal minBringChipScore=BigDecimal.ZERO;

    @ApiModelProperty("最大带入的筹码")
    private BigDecimal maxBringChipScore=BigDecimal.ZERO;

    @ApiModelProperty("默认带入筹码")
    private BigDecimal bringChipScore=BigDecimal.ZERO;

    @ApiModelProperty("玩家总带出")
    private BigDecimal bringOutChipScore=BigDecimal.ZERO;

    @ApiModelProperty("玩家总带入")
    private BigDecimal bringInChipScore=BigDecimal.ZERO;

    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore=BigDecimal.ZERO;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore=BigDecimal.ZERO;

    @ApiModelProperty("抽水比例")
    private BigDecimal rake=BigDecimal.ZERO;

    @ApiModelProperty("牌桌状态：0 未开始，1 进行中 2已结束")
    private Integer status;

    @ApiModelProperty("累计参与者")
    private Integer participantTotal=0;

    @ApiModelProperty("牌桌开始时间")
    private Long tableBeginTime;

    @ApiModelProperty("牌桌结束时间")
    private Long tableEndTime;

    @ApiModelProperty("牌桌结束类型：0强制解散 1房间内解散 2正常结束")
    private Integer overType;

    @ApiModelProperty("手牌数")
    private Long handCount=0L;

    @ApiModelProperty("盈亏金额")
    private BigDecimal netAmount=BigDecimal.ZERO;

    @ApiModelProperty("总保险盈亏")
    private BigDecimal insuredNetAmount=BigDecimal.ZERO;

    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount=BigDecimal.ZERO;

    @ApiModelProperty("总打牌抽水")
    private BigDecimal pumpingAmountTotal=BigDecimal.ZERO;

    @ApiModelProperty("总牌桌盈亏")
    private BigDecimal costTotal=BigDecimal.ZERO;

    @ApiModelProperty("会员带入次数")
    private Integer userBringCount=0;

    @ApiModelProperty("进行时间（min）")
    private Integer onlineTime =0;

    @ApiModelProperty("创建时间")
    private Long createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    private Long updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    private Integer deleteFlag;

    @ApiModelProperty("超时（min）自动解散房间")
    private Integer gameOvertime;
    @ApiModelProperty("保险模式 0-不开保险 1-经典保险")
    private Integer insuranceMode;
    @ApiModelProperty("turn购买保险最低值,整数类型")
    private BigDecimal insuranceTurn=BigDecimal.ZERO;
    @ApiModelProperty("选张购买功能 0-不选张 1-选张")
    private Boolean insuranceChooseSheet;
    @ApiModelProperty("保险触发下限")
    private Integer insuranceLowerLimit=0;
}
