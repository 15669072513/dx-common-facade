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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("dx_table_info")
@ApiModel(value = "DxTableInfoPO对象", description = "")
public class DxTableInfoPO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("游戏类型id")
    @TableId(value = "table_id", type = IdType.INPUT)
    private String tableId;

    @ApiModelProperty("房主ID")
    @TableId(value = "holder_id")
    private Long holderId;

    @ApiModelProperty("牌桌名称")
    @TableField("table_name")
    private String tableName;

    @ApiModelProperty("牌桌类型 1：德州局 2：短牌局")
    @TableField("table_type")
    private Integer tableType;

    @ApiModelProperty("关联游戏id")
    @TableField("game_type_id")
    private Long gameTypeId;

    @ApiModelProperty("关联俱乐部id")
    @TableField("club_id")
    private Long clubId;

    @ApiModelProperty("关联俱乐部名称")
    @TableField("club_name")
    private Long clubName;

    @ApiModelProperty("牌桌最大人数")
    @TableField("max_seats")
    private Integer maxSeats;

    @ApiModelProperty("自动开局人数")
    @TableField("auto_start_user_counts")
    private Integer autoStartUserCounts;

    @ApiModelProperty("牌桌局数")
    @TableField("table_round_number")
    private Integer tableRoundNumber;

    @ApiModelProperty("时长（min）")
    @TableField("time_count")
    private Integer timeCount;

    @ApiModelProperty("玩家总带入")
    @TableField("bring_chip_score")
    private Integer bringChipScore;

    @ApiModelProperty("玩家总带出")
    @TableField("bring_out_chip_score")
    private String bringOutChipScore;

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
