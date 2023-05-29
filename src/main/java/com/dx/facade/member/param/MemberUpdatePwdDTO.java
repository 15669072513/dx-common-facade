package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 会员详情-会员信息编辑 账号状态 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "设置修改密码参数", description = "设置修改密码参数")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberUpdatePwdDTO implements BaseParmDTO {
    
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "会员id")
	@NotNull(message = "会员id不能为空")
	private Long memberId;

    @ApiModelProperty(value = "当前使用密码")
	@NotNull(message = "当前使用密码不能为空")
	@Length(min = 32, max = 32, message = "密码长度错误")
    private String nowPwd;

	@ApiModelProperty(value = "新密码")
	@NotNull(message = "新密码不能为空")
	@Length(min = 32, max = 32, message = "密码长度错误")
	private String newPwd;

	@ApiModelProperty(value = "再次输入的新密码")
	@NotNull(message = "再次输入的新密码不能为空")
	@Length(min = 32, max = 32, message = "密码长度错误")
	private String confirmNewPwd;

	@Override
	public void check() {
		Assert.isTrue(newPwd.equals(confirmNewPwd), ErrorCode.PARAM_EXCEPTION.messageAfter("确认密码和新密码不一致"));
//		Assert.isTrue(!newPwd.equals(nowPwd), ErrorCode.PARAM_EXCEPTION.messageAfter("不可与当前密码相同"));
	}
}
