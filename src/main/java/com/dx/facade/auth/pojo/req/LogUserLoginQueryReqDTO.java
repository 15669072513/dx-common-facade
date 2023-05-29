package com.dx.facade.auth.pojo.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 @title 登录记录查询数据请求传输对象
 @desc 查询登录记录入参
 @path 系统->操作记录->登录记录
 @author Gollum
 @version 1.0.0
 @since 2022-10-08 13:54:10
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="登录记录查询数据请求传输对象", description="查询登录记录入参")
public class LogUserLoginQueryReqDTO extends PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty( value = "商户id", position = 0)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("登录ip")
    private String ip;
}
