package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @program: member-server
 * @description:
 * @author: Jerrmy
 * @create: 2021-08-26 20:39
 **/
@Data
public class UserEmailParamDTO {

    @ApiModelProperty(value = "会员账号 (20)",hidden = true)
    private Long userId;

    @ApiModelProperty(value = "会员邮箱地址", required = true)
    @NotBlank(message = "会员邮箱地址不允许为空")
    @Email(message="邮箱格式错误")
    @Size(min = 2, max = 32, message = "请输入长度2-32个字符之间的邮箱账号")
    private String email;

    @ApiModelProperty(value = "邮箱验证码 (6)", required = true)
    @NotBlank(message = "邮箱验证码不允许为空")
    @Pattern(regexp = "^\\d{6}$",message = "请输入6位纯数字验证码")
    private String v;


}
