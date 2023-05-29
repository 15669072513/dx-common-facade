package com.dx.facade.auth.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class OperationLogReqDTO {
    /**
     * 系统标识：0、b2b，1、游戏管理
     */
    @ApiModelProperty(value = "系统标识：0、b2b，1、游戏管理")
    private Integer type;
    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;
    /**
     * 商户ID
     */
    @ApiModelProperty(value = "商户ID")
    private Long agentId;
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;
    /**
     * 角色
     */
    @ApiModelProperty(value = "角色")
    private String roleName;
    /**
     * 操作类型
     */
    @ApiModelProperty(value = "操作类型")
    private String operation;
    /**
     * 操作内容
     */
    @ApiModelProperty(value = "操作内容")
    private String operationType;
    /**
     * ip
     */
    @ApiModelProperty(value = "ip")
    private String ip;
    /**
     * 方法
     */
    @ApiModelProperty(value = "方法")
    private String method;
    /**
     * 参数
     */
    @ApiModelProperty(value = "参数")
    private String parameter;


    @ApiModelProperty(value = "resp_code")
    private Integer respCode;

    @ApiModelProperty(value = "resp_msg")
    private String respMsg;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "业务ID")
    private Long bizId;

    /**
     * 响应时间
     */
    @ApiModelProperty(value = "响应时间")
    private Integer time;

    /**
     * 浏览器唯一标识
     */
    @ApiModelProperty(value = "浏览器唯一标识")
    private String browserVersion;
}
