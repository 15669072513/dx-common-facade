package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel(value = "代理登录对象ProxyLoginParamDTO", description = "代理登录对象ProxyLoginParamDTO")
public class ProxyLoginParamDTO implements Serializable {


    @ApiModelProperty(value = "商户id (20)", required = true,hidden = true)
    @NotNull(message = "代理ID不能为空")
    private Long merchantId;

    @ApiModelProperty(value = "代理账号 (20)", required = true)
    @NotBlank(message = "用户名不能为空")
    @Length(min=3,max = 20,message = "用户名长度范围3-20")
    private String userName;

    @ApiModelProperty(value = "客户端类型")
    @NotNull(message = "客户端类型不能为空")
    private Integer clientType;

    @ApiModelProperty(value = "登录ip")
    private String ip;

    @ApiModelProperty(value = "终端设备号（6-100）")
    @Length(min=6,max = 100,message = "终端设备号长度范围6-100")
    private String deviceNo;

    @ApiModelProperty(value = "登录网址 (128)")
    @Length(max = 128,message = "登录网址最大长度128")
    private String loginUrl;

    @ApiModelProperty(value = "app类型")
    private String appType;

    @ApiModelProperty(value = "app版本")
    private String appVersion;

    @ApiModelProperty(value = "设备版本")
    private String deviceVersion;

    @ApiModelProperty(value = "登录状态（0-失败 1-成功）详见ConstantEnums.EnumLoginStatusType")
    private Integer loginStatus;

    @ApiModelProperty(value = "登录失败原因")
    private String loginError;

}
