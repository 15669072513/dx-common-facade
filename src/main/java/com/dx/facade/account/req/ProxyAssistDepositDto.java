package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * <p>
 * 代理代存记录表
 * </p>
 *
 * @author quentin
 * @since 2021-06-16
 */
@Data
@ApiModel(value = "com-ob-dto-ProxyAssistDepositDto", description = "代理代存")
public class ProxyAssistDepositDto {

	@ApiModelProperty(value = "商户id", hidden = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;

	@ApiModelProperty(value = "代理id", hidden = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long proxyId;

	@ApiModelProperty(value = "会员id", hidden = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long userId;

	@NotNull(message = "下级会员账号不能为空")
	@ApiModelProperty(value = "下级会员账号", required = true)
	private String userName;

	@NotNull(message = "操作金额不能为空")
	@ApiModelProperty(value = "操作金额", required = true, example = "10")
	@Min(value = 0, message = "操作金额最小为0")
	private BigDecimal amount;

	@ApiModelProperty(value = "备注")
	//@NotBlank(message = "备注不能为空")
	//@Length(max = 100, message = "备注长度最长100个字符")
	private String remark;

	@NotBlank(message = "支付密码不能为空")
	@ApiModelProperty(value = "支付密码", required = true)
	private String payPassword;

	private Integer walletType;


}
