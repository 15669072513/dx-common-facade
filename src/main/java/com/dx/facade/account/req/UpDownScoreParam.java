package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Data
public class UpDownScoreParam {


	@NotNull(message = "用户Id不能为空")
	@ApiModelProperty(value = "用户账号", required = true)
	private Long userId;

	@NotNull(message = "用户类型不能为空")
	@ApiModelProperty(value = "用户类型0=会员，1=代理", required = true)
	private Integer userType;

	@NotNull(message = "用户名不能为空")
	@ApiModelProperty(value = "用户名",required = true)
	private String userName;

	// 不同于walletType
	@NotNull(message = "钱包类型(1=现金钱包,2=信用钱包)不能为空")
	@ApiModelProperty(value = "调整钱包类型(1=现金钱包，2=信用钱包)", required = true)
	private Integer walletType;

	// 不同于bizType
	@ApiModelProperty(value = "账变类型(1=上分，2=下分)", required = true)
	private Integer bizType;

	@NotNull(message = "调整金额不能为空")
	@ApiModelProperty(value = "调整金额不", required = true)
	@Min(value = 0, message = "调整金额最小为0")
	private BigDecimal amount;

	@NotBlank(message = "支付密码不能为空")
	@ApiModelProperty(value = "支付密码", required = true)
	private String payPassword;


	@ApiModelProperty(value = "商户id")
	private Long merchantId;

	@ApiModelProperty(value = "操作代理id")
	private Long proxyId;

}
