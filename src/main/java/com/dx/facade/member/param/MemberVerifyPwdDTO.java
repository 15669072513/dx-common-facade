package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@ApiModel(value = "找回密码用户名手机号邮箱验证是否匹配参数", description = "找回密码用户名手机号邮箱验证是否匹配参数")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberVerifyPwdDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "商户id (20)")
	@NotNull(message = "商户id不能为空")
	private Long merchantId;

	@ApiModelProperty(value = "用户名")
	@NotNull(message = "用户名不能为空")
	private String userName;

    @ApiModelProperty(value = "用户手机号码,邮箱允许其中一个为空")
    private String userPhone;

	@ApiModelProperty(value = "用户手机号码,邮箱允许其中一个为空")
	private String userEmail;

	@ApiModelProperty(value = "找回密码验证方式(1--用户名手机号码验证 2--用户名邮箱验证)")
	@NotNull(message = "找回密码验证类型不能为空")
	@Range(min = 1, max = 2, message = "找回密码验证类型1或2")
	private Integer verifyType;
}
