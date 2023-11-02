package com.dx.facade.game.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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
