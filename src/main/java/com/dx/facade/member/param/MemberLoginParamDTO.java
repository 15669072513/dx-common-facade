package com.dx.facade.member.param;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "登录对象loginParam", description = "登录对象loginParam")
public class MemberLoginParamDTO implements BaseParmDTO, Serializable {

    private static final long serialVersionUID = -5276753294444979337L;
    /** 会员Id */
    @ApiModelProperty(value = "会员ID")
    private Long memberId;

    /** 商户id */
    @ApiModelProperty(value = "商户id (20)", required = true)
    @NotNull(message = "商户id不能为空")
    private Long merchantId;

    /** 用户名 */
    @ApiModelProperty(value = "会员账号 (20)", required = true)
    @NotBlank(message = "用户名不能为空")
    @Length(min=3,max = 20,message = "用户名长度范围3-20")
    private String userName;

    /** 登录手机号码 */
    @ApiModelProperty(value = "手机号码(区号)", required = true,example = "+86-12365474841")
    private String mobile;

    /** 密码 */
    @ApiModelProperty(value = "密码 (32)。明文密码做一次MD5大写", required = true)
    @NotBlank(message = "密码不能为空")
    @Length(min = 32, max = 32, message = "密码长度错误")
    private String password;

    /** 客户端类型 */
    @ApiModelProperty(value = "客户端类型")
    //@NotNull(message = "客户端类型不能为空")
    private Integer clientType;

    /** 注册IP */
    @ApiModelProperty(value = "注册ip")
    @ToString.Exclude
    private String ip;

    /** 终端设备号 */
    @ApiModelProperty(value = "终端设备号（6-100）")
    @Length(min=6,max = 100,message = "终端设备号长度范围6-100")
    private String deviceNo;

    /** MAC地址 */
    @ApiModelProperty(value = "MAC地址")
    private String mac;

    /** 登录网址 */
    @ApiModelProperty(value = "登录网址 (128)")
    @Length(max = 128,message = "登录网址最大长度128")
    private String loginUrl;

    /** app类型 */
    @ApiModelProperty(value = "app类型")
    private String appType;

    /** app版本 */
    @ApiModelProperty(value = "app版本")
    private String appVersion;

    /** 设备版本 */
    @ApiModelProperty(value = "设备版本")
    private String deviceVersion;

    /** 是否允许多端登录 1：允许 0：不允许 */
    @ApiModelProperty(value = "是否允许多端登录 1：允许 0：不允许")
    private Integer isMultiple;
    
    /** 是否为客户端  true:是 false：否 */
    @ApiModelProperty(value = "是否为客户端  true:是 false：否")
    private Boolean isClient;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userName"));
        Assert.notNull(password, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("password"));
        Assert.notNull(clientType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("clientType"));
        Assert.notNull(ip, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("ip"));
    }
}
