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
 * @author broadway
 * @since 2023-06-05
 */
@Data
public class DxGameConfigListResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("游戏类型id")
    private Long gameTypeId;

    @ApiModelProperty("场馆类型(如by,ty,zr,qkl)")
    private String venueTypeCode;

    @ApiModelProperty("所属场馆(即bw_venue表的venue_code)")
    private String venueCode;

    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("游戏中文名")
    private String gameZhName;

    @ApiModelProperty("游戏英文名")
    private String gameEnName;

    @ApiModelProperty("游戏泰语名")
    private String gameThName;

    @ApiModelProperty("游戏越南名")
    private String gameVnName;

    @ApiModelProperty("接入参数")
    private String accessInfo;

    @ApiModelProperty("图标状态")
    private Integer iconStatus;

    @ApiModelProperty("支持终端")
    private String supportTerminals;

    @ApiModelProperty("图标图标URL")
    private String iconUrl;

    @ApiModelProperty("游戏描述")
    private String description;

    @ApiModelProperty("状态(0已禁用,1开启中,2维护中)")
    private Integer status;

    @ApiModelProperty("超时（min）自动解散房间")
    private Integer gameOvertime;

    @ApiModelProperty("大盲BB设置")
    private String bbSetting;

    @ApiModelProperty("默认带入值（BB）")
    private String bbDefaultCarry;

    @ApiModelProperty("补码下限")
    private Integer complementLowerLimit;

    @ApiModelProperty("补码上限")
    private Integer complementUpperLimit;

    @ApiModelProperty("游戏时长（H）")
    private String gameTimes;

    @ApiModelProperty("游戏人数")
    private String gamePeopleNumbers;

    @ApiModelProperty("自动开始人数")
    private String autoStartNumbers;

    @ApiModelProperty("抽水比例")
    private BigDecimal rake;

    @ApiModelProperty("创建时间")
    private Long createAt;

    @ApiModelProperty("创建人")
    private String createBy;

    @ApiModelProperty("修改时间")
    private Long updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    private Integer deleteFlag;
}
