package com.dx.facade.game.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author admin
 */
@Data
@ApiModel(value = "ShutdownMaintenanceDTO对象", description = "停服维护")
public class ShutdownMaintenanceDTO {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("状态：0待执行 1进行中 2已停服 3半开服 4已完成 5禁用")
    private Integer status;

    @ApiModelProperty("停服时间")
    private Long shutdownTime;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;
}
