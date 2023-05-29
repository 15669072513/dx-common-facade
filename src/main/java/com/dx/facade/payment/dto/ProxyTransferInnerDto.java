package com.dx.facade.payment.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * <p>
 * 代理自身账号余额转账记录表
 * </p>
 *
 * @author quentin
 * @since 2021-06-16
 */
@Data
@ApiModel(value = "com-ob-dto-ProxyTransferInnerDto", description = "代理自身账号余额转账")
public class ProxyTransferInnerDto {

	@NotNull(message = "转账金额不能为空")
	@ApiModelProperty(value = "转账金额", required = true)
	@Min(value = 0, message = "转账金额至少大于0")
	private BigDecimal amount;

	@NotBlank(message = "支付密码不能为空")
	@ApiModelProperty(value = "支付密码", required = true)
	private String payPassword;

}
