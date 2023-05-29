package com.dx.facade.auth.pojo.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 @title 加载用户类型数据请求传输对象
 @desc 加载用户类型入参
 @path 系统->用户管理
 @author Gollum
 @version 1.0.0
 @since 2022-10-11 16:58:20
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="加载用户类型数据请求传输对象", description="加载用户类型入参")
public class LoadUserTypeReqDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "商户id不可为空")
    @ApiModelProperty( value = "商户id", position = 0)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @NotNull(message = "当前用户类型不可为空")
    @ApiModelProperty( value = "当前用户类型", position = 1)
    private Integer userType;
}
