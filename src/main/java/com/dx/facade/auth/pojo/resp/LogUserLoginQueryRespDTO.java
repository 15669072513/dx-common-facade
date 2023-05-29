package com.dx.facade.auth.pojo.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 @title 登录记录查询数据响应传输对象
 @desc 查询登录记录出参
 @path 系统->操作记录->登录记录
 @author Gollum
 @version 1.0.0
 @since 2022-10-08 14:10:33
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="登录记录查询数据响应传输对象", description="查询登录记录出参")
public class LogUserLoginQueryRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键", position = 0)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户id", position = 1)
    private Long merchantId;

    @ApiModelProperty(value = "商户名称", position = 2)
    private String merchantName;

    @ApiModelProperty(value = "用户名称", position = 3)
    private String userName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @ApiModelProperty(value = "登录时间", position = 4)
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "登录ip", position = 5)
    private String ip;

    @ApiModelProperty(value = "终端设备号", position = 6)
    private String deviceId;

    @ApiModelProperty(value = "登录地区", position = 7)
    private String loginRegion;

    @ApiModelProperty(value = "状态：[0：失败，1：成功]", position = 8)
    private Integer loginStatus;
}
