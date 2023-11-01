package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 停服维护
 */
@Data
public class DxShutdownMaintenanceResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("状态：0待执行 1进行中 2已停服 3半开服 4已完成")
    private Integer status;

    @ApiModelProperty("'停服时间'")
    private Long shutdownTime;
}
