package com.dx.facade.texas.dto;

import com.baomidou.mybatisplus.annotation.TableField;
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
public class DxTableInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌桌id")
    private Long tableId;

    @ApiModelProperty("牌桌code")
    private String tableCode;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @ApiModelProperty("牌桌类型 2001：德州局 2002：短牌局")
    private Long tableType;

    @ApiModelProperty("关联游戏id")
    private Long gameTypeId;

    @ApiModelProperty("关联俱乐部id")
    private Long clubId;

    @ApiModelProperty("关联俱乐部名称")
    private String clubName;

    @ApiModelProperty("牌桌最大人数")
    private Integer maxSeats;

    @ApiModelProperty("自动开局人数")
    @TableField("auto_start_user_counts")
    private Integer autoStartUserCounts;

    @ApiModelProperty("牌桌局数")
    private Integer tableHandNumber;

    @ApiModelProperty("时长（min）")
    private Integer timeCount;

    @ApiModelProperty("玩家总带入")
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

    @ApiModelProperty("累计参与者")
    private Integer participantTotal;

    @ApiModelProperty("牌桌开始时间")
    private Long tableBeginTime;

    @ApiModelProperty("牌桌结束时间")
    private Long tableEndTime;

    @ApiModelProperty("牌桌结束类型：0强制解散 1房间内解散 2正常结束")
    private Integer overType;

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

    @ApiModelProperty("保险模式 0-不开保险 1-经典保险")
    private Integer insuranceMode;

    @ApiModelProperty("turn购买保险最低值,整数类型")
    private BigDecimal insuranceTurn;

    @ApiModelProperty("选张购买功能 0-不选张 1-选张")
    private Boolean insuranceChooseSheet;

    @ApiModelProperty("保险触发下限")
    private Integer insuranceLowerLimit;

    @ApiModelProperty("保险输赢")
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

    @ApiModelProperty("前注功能 0-关闭 1-开启 2-关闭隐藏")
    private Integer anteSwitch = 0;

    @ApiModelProperty("前注")
    private BigDecimal anteScore = BigDecimal.ZERO;

    @ApiModelProperty("前注（倍BB）,支持小数点1位")
    private BigDecimal anteLimit;

    @ApiModelProperty("局服务费 0-配置没开启  1-关 2-开 默认为0")
    private Integer tableFeeSwitch;

    @ApiModelProperty("局服务费")
    private BigDecimal tableFee;

    @ApiModelProperty("局服务费比例")
    private BigDecimal tableFeeScale;
}
