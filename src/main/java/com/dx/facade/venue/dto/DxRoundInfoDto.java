package com.dx.facade.venue.dto;

import com.baomidou.mybatisplus.annotation.TableField;
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
 * @author broadway
 * @since 2023-06-06
 */
@Data
public class DxRoundInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌局主键，按业务规则生成")
    private String roundId;

    @ApiModelProperty("牌桌主键")
    private String tableId;

    @ApiModelProperty("俱乐部主键")
    private Long clubId;

    @ApiModelProperty("流水订单号，流水信息主键")
    private String orderNo;

    @ApiModelProperty("牌局开始时间")
    private LocalDateTime roundBeginTime;

    @ApiModelProperty("牌局结束时间")
    private LocalDateTime roundEndTime;

    @ApiModelProperty("局次")
    private Integer roundNum;

    @ApiModelProperty("初期金额")
    private BigDecimal beginMount;

    @ApiModelProperty("中途带入金额")
    private BigDecimal bringMidwayAmount;

    @ApiModelProperty("期末金额")
    private BigDecimal endAmount;

    @ApiModelProperty("公牌信息")
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
