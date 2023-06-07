package com.dx.facade.venue.req;

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
public class DxTableInfoAddReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌桌创建牌桌后按业务规则生成ID")
    private String tableId;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @ApiModelProperty("牌桌类型 1：德州局 2：短牌局")
    private Integer tableType;

    @ApiModelProperty("关联游戏id")
    private Long gameTypeId;

    @ApiModelProperty("关联游戏名称")
    private String gameName;

    @ApiModelProperty("关联俱乐部id")
    private Long clubId;

    @ApiModelProperty("关联俱乐部名称")
    private Long clubName;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;
}
