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
 * @author dereck
 * @since 2022-10-13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("dx_game_config")
@ApiModel(value = "DxGameConfigPO对象", description = "")
public class DxGameConfigPO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("游戏类型id")
    @TableId(value = "game_type_id", type = IdType.INPUT)
    private Long gameTypeId;

    @ApiModelProperty("场馆类型(如by,ty,zr,qkl)")
    @TableField("venue_type_code")
    private String venueTypeCode;

    @ApiModelProperty("所属场馆(即bw_venue表的venue_code)")
    @TableField("venue_code")
    private String venueCode;

    @TableField("game_name")
    private String gameName;

    @ApiModelProperty("游戏中文名")
    @TableField("game_zh_name")
    private String gameZhName;

    @ApiModelProperty("游戏英文名")
    @TableField("game_en_name")
    private Long gameEnName;

    @ApiModelProperty("游戏泰语名")
    @TableField("game_th_name")
    private String gameThName;

    @ApiModelProperty("游戏越南名")
    @TableField("game_vn_name")
    private Long gameVnName;

    @ApiModelProperty("接入参数")
    @TableField("access_info")
    private String accessInfo;

    @ApiModelProperty("图标状态")
    @TableField("icon_status")
    private Integer iconStatus;

    @ApiModelProperty("支持终端")
    @TableField("support_terminals")
    private String supportTerminals;

    @ApiModelProperty("图标图标URL")
    @TableField("icon_url")
    private String iconUrl;

    @ApiModelProperty("游戏描述")
    @TableField("description")
    private String description;

    @ApiModelProperty("游戏总开关(0已禁用,1开启中)")
    @TableField("game_switch")
    private Integer gameSwitch;

    @ApiModelProperty("超时（min）自动解散房间")
    @TableField("game_overtime")
    private Integer gameOvertime;

    @ApiModelProperty("大盲BB设置")
    @TableField("bb_setting")
    private String bbSetting;

    @ApiModelProperty("默认带入值（BB）")
    @TableField("bb_default_carry")
    private String bbDefaultCarry;

    @ApiModelProperty("补码下限")
    @TableField("complement_lower_limit")
    private Integer complementLowerLimit;

    @ApiModelProperty("补码上限")
    @TableField("complement_upper_limit")
    private Integer complementUpperLimit;

    @ApiModelProperty("游戏时长（H）")
    @TableField("game_times")
    private String gameTimes;

    @ApiModelProperty("游戏人数")
    @TableField("game_people_numbers")
    private String gamePeopleNumbers;

    @ApiModelProperty("自动开始人数")
    @TableField("auto_start_numbers")
    private String autoStartNumbers;

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
