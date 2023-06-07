package com.dx.facade.venue.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author broadway
 * @since 2023-06-06
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("dx_round_info")
@ApiModel(value = "DxRoundInfoPO对象", description = "")
public class DxRoundInfoPO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌局主键，按业务规则生成")
    @TableId(value = "round_id", type = IdType.INPUT)
    private String roundId;

    @ApiModelProperty("牌桌主键")
    @TableField("table_id")
    private String tableId;

    @ApiModelProperty("俱乐部主键")
    @TableField("club_id")
    private Long clubId;

    @ApiModelProperty("流水订单号，流水信息主键")
    @TableField("order_no")
    private String orderNo;

    @ApiModelProperty("牌局开始时间")
    @TableField("round_begin_time")
    private LocalDateTime roundBeginTime;

    @ApiModelProperty("牌局结束时间")
    @TableField("round_end_time")
    private LocalDateTime roundEndTime;

    @ApiModelProperty("局次")
    @TableField("round_num")
    private Integer roundNum;

    @ApiModelProperty("初期金额")
    @TableField("begin_mount")
    private BigDecimal beginMount;

    @ApiModelProperty("中途带入金额")
    @TableField("bring_midway_amount")
    private BigDecimal bringMidwayAmount;

    @ApiModelProperty("期末金额")
    @TableField("end_amount")
    private BigDecimal endAmount;

    @ApiModelProperty("公牌信息")
    @TableField("public_cards")
    private String publicCards;

    @ApiModelProperty("有效底池")
    @TableField("valid_pot")
    private String validPot;

    @ApiModelProperty("小盲注")
    @TableField("sb_blind_score")
    private String sbBlindScore;

    @ApiModelProperty("大盲注")
    @TableField("bb_blind_score")
    private String bbBlindScore;

    @ApiModelProperty("创建时间")
    @TableField("create_at")
    private LocalDateTime createdAt;

    @ApiModelProperty("创建人")
    @TableField("create_by")
    private String createdBy;

    @ApiModelProperty("修改时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人")
    @TableField("updated_by")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    @TableField("delete_flag")
    private Integer deleteFlag;
}
