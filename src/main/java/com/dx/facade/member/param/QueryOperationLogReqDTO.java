package com.dx.facade.member.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class QueryOperationLogReqDTO {
	
	@ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty("操作模块")
    private String operationModule;

    @ApiModelProperty("操作栏目")
    private String operationItem;

    @ApiModelProperty("操作页面")
    private String operationPage;

    @ApiModelProperty("操作类型")
    private String operationType;

    @ApiModelProperty("操作功能")
    private String operationFunc;

    @ApiModelProperty("操作对象")
    private String operationTarget;

    @ApiModelProperty("操作人")
    @TableField("operator")
    private String operator;

    @ApiModelProperty("操作人类型")
    private String operatorType;

    @ApiModelProperty("操作IP")
    private String operationIp;
    
    @ApiModelProperty("操作日志创建开始时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String createdAtStart;
    
    @ApiModelProperty("操作日志创建结束时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private String createdAtEnd;

}
