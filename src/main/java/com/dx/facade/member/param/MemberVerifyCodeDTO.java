package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 *
 * @author timas
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "找回密码用户名手机号邮箱验证码找回参数", description = "找回密码用户名手机号邮箱验证码找回参数")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberVerifyCodeDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "找回密码验证方式(1--用户名手机号码验证 2--用户名邮箱验证)")
	@NotNull(message = "找回密码验证类型不能为空")
	@Range(min = 1, max = 2, message = "找回密码验证类型1或2")
	private Integer verifyType;

	@ApiModelProperty(value = "发送验证码")
	@Range(min = 6, max = 6, message = "验证码长度错误")
	private String sendCode;

    @ApiModelProperty(value = "用户手机号码,邮箱允许其中一个为空",example = "+86-13144445555")
    private String userPhone;

	@ApiModelProperty(value = "用户手机号码,邮箱允许其中一个为空")
	private String userEmail;

	@ApiModelProperty(value = "商户id (20)")
	@NotNull(message = "商户id不能为空")
	private Long merchantId;

	@ApiModelProperty(value = "ip地址")
	@ToString.Exclude
	private String ip;

}
