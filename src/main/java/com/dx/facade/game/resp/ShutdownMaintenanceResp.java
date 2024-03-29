package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 停服维护
 */
@Data
public class ShutdownMaintenanceResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("状态：1待执行 2进行中 3半开服 4已完成,5已禁用")
    private Integer status;

    @ApiModelProperty("'停服时间'")
    private LocalDateTime shutdownTime;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

}
