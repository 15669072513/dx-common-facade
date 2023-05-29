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
import org.springframework.util.StringUtils;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 *
 * @author timas
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "用户绑定手机号码邮箱参数", description = "用户绑定手机号码邮箱参数")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberBindEmailDTO implements BaseParmDTO {
    
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "会员id")
	@NotNull(message = "会员id不能为空")
	private Long memberId;

//	@ApiModelProperty(value = "商户id (20)")
//	@NotNull(message = "商户id不能为空")
//	private Long merchantId;

    @ApiModelProperty(value = "用户手机号码,邮箱允许其中一个为空")
    private String userPhone;

	@ApiModelProperty(value = "用户手机号码,邮箱允许其中一个为空")
	private String userEmail;

	@ApiModelProperty(value = "验证码")
	@NotNull(message = "会员id不能为空")
	@Range(min = 6, max = 6, message = "验证码格式错误")
	private String verifyCode;

	@ApiModelProperty(value = "IP地址，绑定邮箱需要参数")
	private String ip;

	@Override
	public void check() {
		Assert.isTrue(StringUtils.hasText(userPhone) || StringUtils.hasText(userEmail), "电话号码或邮箱不能为空");
	}
}
