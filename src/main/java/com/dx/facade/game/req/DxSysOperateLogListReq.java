package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@ApiModel("操作日志记录列表请求实体")
@Data
public class DxSysOperateLogListReq extends BaseRequest {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "所属商户Id")
    private Long merchantId;

    @ApiModelProperty(value = "模块编码(操作栏目)")
    private Integer moduleCode;

    @ApiModelProperty(value = "操作页面编码(操作页面)")
    private Integer operatePageCode;

    @ApiModelProperty(value = "操作IP")
    private String requestIp;

    @ApiModelProperty(value = "操作人")
    private String operateUserName;

    @ApiModelProperty("操作开始时间")
    private Long operateStartTime;

    @ApiModelProperty("操作结束时间")
    private Long operateEndTime;
}
