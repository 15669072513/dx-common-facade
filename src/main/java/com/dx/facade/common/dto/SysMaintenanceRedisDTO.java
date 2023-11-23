package com.dx.facade.common.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysMaintenanceRedisDTO  implements Serializable {

    private static final long serialVersionUID = 1L;

    //维护标题
    @ApiModelProperty("维护标题")
    private String title;

    //维护内容
    @ApiModelProperty("维护内容")
    private String content;

    //开始时间
    @ApiModelProperty("开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime startTime;

    //结束时间
    @ApiModelProperty("结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime endTime;

    // 1pc客户端  2代理后台
    @ApiModelProperty(" 1pc客户端  2代理后台")
    private Integer terminalInfo;

    // 0待开启  1开启中  2半维护   3已结束
    @ApiModelProperty(" 0待开启  1开启中  2半维护   3已结束")
    private Integer status;

}
