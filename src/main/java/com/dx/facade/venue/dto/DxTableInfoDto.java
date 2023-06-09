package com.dx.facade.venue.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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
public class DxTableInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "table_id", type = IdType.INPUT)
    private String tableId;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @ApiModelProperty("牌桌类型 1：德州局 2：短牌局")
    private Integer tableType;

    @ApiModelProperty("关联游戏id")
    private Long gameTypeId;

    @ApiModelProperty("关联俱乐部id")
    @TableField("club_id")
    private Long clubId;

    @ApiModelProperty("关联俱乐部名称")
    @TableField("club_name")
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
    private Integer bringChipScore;

    @ApiModelProperty("玩家总带出")
    private String bringOutChipScore;

    @ApiModelProperty("小盲注")
    private String sbBlindScore;

    @ApiModelProperty("大盲注")
    private String bbBlindScore;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    private Integer deleteFlag;
}
