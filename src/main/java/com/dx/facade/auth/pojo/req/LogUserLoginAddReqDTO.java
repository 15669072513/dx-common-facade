package com.dx.facade.auth.pojo.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 @title 登录记录新增数据请求传输对象
 @desc 新增登录记录入参
 @path 系统->操作记录->登录记录
 @author Gollum
 @version 1.0.0
 @since 2022-10-08 15:29:37
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="登录记录新增数据请求传输对象", description="新增登录记录入参")
public class LogUserLoginAddReqDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "商户id", position = 0)
    private Long merchantId;

    @ApiModelProperty(value = "商户编码", position = 1)
    private String merchantCode;

    @ApiModelProperty(value = "用户id", position = 2)
    private Long userId;

    @ApiModelProperty(value = "用户名称", position = 3)
    private String userName;

    @ApiModelProperty(value = "类型，[1：包网项目]", position = 4)
    private Integer type;

    @ApiModelProperty(value = "登录ip", position = 5)
    private String ip;

    @ApiModelProperty(value = "设备id", position = 6)
    private String deviceId;

    @ApiModelProperty(value = "浏览器信息", position = 7)
    private String browserInfo;

    @ApiModelProperty(value = "登录状态，[0：失败，1：成功]", position = 8)
    private Integer loginStatus;

    @ApiModelProperty(value = "登录地区", position = 9)
    private String loginRegion;
}
