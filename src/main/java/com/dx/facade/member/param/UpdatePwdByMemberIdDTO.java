package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 会员详情-会员信息编辑 账号状态 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "根据会员id来修改密码参数", description = "根据会员id来修改密码参数")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePwdByMemberIdDTO implements BaseParmDTO {

	@ApiModelProperty(value = "新密码")
	@NotNull(message = "新密码不能为空")
	@Length(min = 32, max = 32, message = "新密码密码长度错误")
	private String password;

	@ApiModelProperty(value = "再次输入的新密码")
	@NotNull(message = "再次输入的新密码不能为空")
	@Length(min = 32, max = 32, message = "确认密码长度错误")
	private String confirmPassword;

	@ApiModelProperty(value = "用户账号", required = true)
	@NotBlank(message = "用户账号不能为空")
	private String username;

	@ApiModelProperty(value = "商户id (20)")
	@NotNull(message = "商户id不能为空")
	private Long merchantId;

	@Override
	public void check() {
		Assert.isTrue(password.equals(confirmPassword), ErrorCode.PARAM_EXCEPTION.messageAfter("确认密码和密码不一致"));
	}
}
