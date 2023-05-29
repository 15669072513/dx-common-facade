package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "登录对象loginParam", description = "登录对象loginParam")
public class MemberLoginParamDTO implements BaseParmDTO, Serializable {

    private static final long serialVersionUID = -5276753294444979337L;

    @ApiModelProperty(value = "会员ID")
    private Long memberId;

    @ApiModelProperty(value = "商户id (20)", required = true)
    @NotNull(message = "商户id不能为空")
    private Long merchantId;

    @ApiModelProperty(value = "会员账号 (20)", required = true)
    @NotBlank(message = "用户名不能为空")
    @Length(min=3,max = 20,message = "用户名长度范围3-20")
    private String userName;

    @ApiModelProperty(value = "手机号码(区号)", required = true,example = "+86-12365474841")
    //@NotBlank(message = "登录手机号码不能为空")
    //@Length(min = 15, max = 15, message = "手机号码长度错误")
    private String mobile;

    @ApiModelProperty(value = "密码 (32)。明文密码做一次MD5大写", required = true)
    @NotBlank(message = "密码不能为空")
    @Length(min = 32, max = 32, message = "密码长度错误")
    private String password;

    @ApiModelProperty(value = "客户端类型")
    @NotNull(message = "客户端类型不能为空")
    private Integer clientType;

    @ApiModelProperty(value = "注册ip")
    private String ip;

    @ApiModelProperty(value = "终端设备号（6-100）")
    @Length(min=6,max = 100,message = "终端设备号长度范围6-100")
    private String deviceNo;

    @ApiModelProperty(value = "登录网址 (128)")
    @Length(max = 128,message = "登录网址最大长度128")
    private String loginUrl;

/*
    @ApiModelProperty(value = "数据类型 （0-会员 1-代理）",required = true)
    @NotNull(message = "数据类型 不能为空")
    @Min(value = 0, message = "数据类型不正确")
    @Max(value = 1, message = "数据类型不正确")
    private Integer userType;
*/

    @ApiModelProperty(value = "app类型")
    private String appType;

    @ApiModelProperty(value = "app版本")
    private String appVersion;

    @ApiModelProperty(value = "设备版本")
    private String deviceVersion;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userName"));
        Assert.notNull(password, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("password"));
        Assert.notNull(clientType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("clientType"));
        Assert.notNull(ip, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("ip"));
    }
}
