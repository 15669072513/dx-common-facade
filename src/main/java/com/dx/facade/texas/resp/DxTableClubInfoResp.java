package com.dx.facade.texas.resp;

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
public class DxTableClubInfoResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌桌id")
    private Long tableId;

    @ApiModelProperty("牌桌code")
    private String tableCode;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @ApiModelProperty("牌桌类型 2001：德州局 2002：短牌局")
    private Long tableType;

    @ApiModelProperty("房主ID")
    private Long holderId;

    @ApiModelProperty("房主名称")
    private String holderName;

    @ApiModelProperty("关联游戏id")
    private Long gameTypeId;

    @ApiModelProperty("关联游戏名称")
    private String gameName;

    @ApiModelProperty("关联俱乐部id")
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    private String clubName;

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

    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount=BigDecimal.ZERO;

    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore=BigDecimal.ZERO;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore=BigDecimal.ZERO;

    @ApiModelProperty("玩家总带入")
    private BigDecimal bringChipTotal=BigDecimal.ZERO;

    @ApiModelProperty("玩家总带出")
    private BigDecimal afterChipTotal=BigDecimal.ZERO;

    @ApiModelProperty("牌桌总费用")
    private BigDecimal costTotal=BigDecimal.ZERO;

    @ApiModelProperty("牌桌抽水")
    private BigDecimal pumpingAmountTotal=BigDecimal.ZERO;

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
}
