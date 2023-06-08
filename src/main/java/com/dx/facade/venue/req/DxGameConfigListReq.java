package com.dx.facade.venue.req;

import com.dx.facade.common.PageRequest;
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
 * @since 2023-06-05
 */
@Data
public class DxGameConfigListReq extends PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("游戏类型id")
    private Long gameTypeId;

    @ApiModelProperty("场馆类型(如by,ty,zr,qkl)")
    private String venueTypeCode;

    @ApiModelProperty("所属场馆(即bw_venue表的venue_code)")
    private String venueCode;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("游戏中文名")
    private String gameZhName;

    @ApiModelProperty("游戏英文名")
    private Long gameEnName;

    @ApiModelProperty("游戏泰语名")
    private String gameThName;

    @ApiModelProperty("游戏越南名")
    private Long gameVnName;

    @ApiModelProperty("游戏总开关(0已禁用,1开启中)")
    private Integer gameSwitch;

    @ApiModelProperty("抽水比例")
    private BigDecimal rake;

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
