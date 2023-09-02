package com.dx.facade.venue.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 游戏表(如赤壁之战,财神到)
 * @author rudolf
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("bw_config_game")
@ApiModel(value = "ConfigGamePO对象", description = "游戏表(如赤壁之战,财神到)")
public class ConfigGamePO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "game_id", type = IdType.INPUT)
    private Long gameId;

    @ApiModelProperty("场馆类型(如by,ty,zr,qkl)")
    @TableField("venue_type_code")
    private String venueTypeCode;

    @ApiModelProperty("所属场馆(即bw_venue表的venue_code)")
    @TableField("venue_code")
    private String venueCode;

    @ApiModelProperty("游戏名称(如赤壁之战,财神到)")
    @TableField("game_name")
    private String gameName;

    @ApiModelProperty("游戏中文名")
    @TableField("game_zh_name")
    private String gameZhName;

    @ApiModelProperty("游戏英文名")
    @TableField("game_en_name")
    private String gameEnName;

    @ApiModelProperty("游戏泰语名")
    @TableField("game_th_name")
    private String gameThName;

    @ApiModelProperty("游戏越南名")
    @TableField("game_vn_name")
    private String gameVnName;

    @ApiModelProperty("接入参数")
    @TableField("access_info")
    private String accessInfo;

    @ApiModelProperty("图标状态(1推荐,2火热,3新游)")
    @TableField("icon_status")
    private Integer iconStatus;

    @ApiModelProperty("支持终端,逗号隔开(1.PC,2.IOS_APP,3.IOS_H5,4.Android_H5,5.Android_APP)")
    @TableField("support_terminals")
    private String supportTerminals;

    @ApiModelProperty("图标图片url")
    @TableField("icon_url")
    private String iconUrl;

    @ApiModelProperty("游戏描述")
    @TableField("description")
    private String description;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("状态(0已禁用,1开启中,2维护中)")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("创建人")
    @TableField("created_by")
    private String createdBy;

    @ApiModelProperty("创建时间")
    @TableField("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @ApiModelProperty("修改人")
    @TableField("updated_by")
    private String updatedBy;

    @ApiModelProperty("修改时间")
    @TableField("updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    @ApiModelProperty("场馆游戏ID")
    @TableField("game_type_id")
    private String gameTypeId;

    @ApiModelProperty("场馆类型名称")
    @TableField("venue_type_name")
    private String venueTypeName;

    @ApiModelProperty("场馆名称")
    @TableField("venue_name")
    private String venueName;
}
