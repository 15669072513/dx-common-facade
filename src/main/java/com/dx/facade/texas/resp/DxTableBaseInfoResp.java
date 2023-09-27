package com.dx.facade.texas.resp;

import com.baomidou.mybatisplus.annotation.TableField;
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
public class DxTableBaseInfoResp implements Serializable {

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

    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore;

    @ApiModelProperty("玩家总带入")
    private BigDecimal bringChipTotal;

    @ApiModelProperty("玩家总带出")
    private BigDecimal afterChipTotal;

    @ApiModelProperty("牌桌总费用")
    private BigDecimal costTotal;

    @ApiModelProperty("牌桌抽水")
    private BigDecimal pumpingAmountTotal;

    @ApiModelProperty("保险输赢")
    private BigDecimal insuredNetAmount;

    @ApiModelProperty("机器人数量")
    private Integer robotNum;

    @ApiModelProperty("人员上限")
    private Integer upperLimit;

    @ApiModelProperty("同时开牌桌上限")
    private Integer cardTableLimit;

    @ApiModelProperty("单牌桌旁观人数上限")
    private Integer lookOnLimit;

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

    @ApiModelProperty("牌桌最大人数")
    private Integer maxSeats;

    @ApiModelProperty("自动开局人数")
    private Integer autoStartUserCounts;

    @ApiModelProperty("最小带入的筹码")
    @TableField("min_bring_chip_score")
    private BigDecimal minBringChipScore;

    @ApiModelProperty("最大带入的筹码")
    @TableField("max_bring_chip_score")
    private BigDecimal maxBringChipScore;

    @ApiModelProperty("单牌桌累计带入上限")
    private Integer bringInLimit;

    @ApiModelProperty("保险模式 0-不开保险 1-经典保险")
    private Integer insuranceMode;

    @ApiModelProperty("保险模式中文描述 0-不开保险 1-经典保险")
    private String insuranceModeStr;

    @ApiModelProperty("turn购买保险最低值,整数类型")
    private String insuranceTurn;


}
