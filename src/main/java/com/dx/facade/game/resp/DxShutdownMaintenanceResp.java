package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 停服维护
 * @author Administrator
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DxShutdownMaintenanceResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("状态：1待执行 2进行中 3半开服 4已完成,5已禁用 参与枚举DxShutdownMaintenanceEnum")
    private Integer status;

    @ApiModelProperty("'停服时间'")
    private Long shutdownTime;
}
