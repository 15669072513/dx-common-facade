package com.dx.facade.texas.resp;

import com.dx.facade.common.utils.DateToLongSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

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
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
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

    @ApiModelProperty("玩家总带入")
    private BigDecimal bringInChipScore;

    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore;

    @ApiModelProperty("抽水比例")
    private BigDecimal rake;

    @ApiModelProperty("牌桌状态：0 未开始，1 进行中 2已结束")
    private Integer status;

    @ApiModelProperty("累计参与者")
    private Integer participantTotal;

    @ApiModelProperty("牌桌开始时间")
    private Long tableBeginTime;

    @ApiModelProperty("牌桌结束时间")
    private Long tableEndTime;

    @ApiModelProperty("牌桌结束类型：0强制解散 1房间内解散 2正常结束")
    private Integer overType;

    @ApiModelProperty("手牌数")
    private Long handCount;

    @ApiModelProperty("盈亏金额")
    private BigDecimal netAmount;

    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount;

    @ApiModelProperty("牌桌总抽水")
    private BigDecimal pumpingAmountTotal;

    @ApiModelProperty("牌桌总费用")
    private BigDecimal costTotal;

    @ApiModelProperty("会员带入次数")
    private Integer userBringCount;

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
