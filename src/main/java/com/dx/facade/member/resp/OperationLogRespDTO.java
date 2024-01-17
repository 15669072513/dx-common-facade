package com.dx.facade.member.resp;

import com.baomidou.mybatisplus.annotation.TableField;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OperationLogRespDTO {
	
	@ApiModelProperty("ID")
    private Long id;
	
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

    @ApiModelProperty("操作前")
    private String beforeModify;

    @ApiModelProperty("操作后")
    private String afterModify;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

}
