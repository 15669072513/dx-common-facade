package com.dx.facade.payment.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "会员或代理提款参数", description = "会员或代理提款参数")
public class WithDrawOrderDto implements Serializable {

	@ApiModelProperty(value = "商户id", hidden = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;

	@ApiModelProperty(value = "商户名称", hidden = true)
	private String merchantName;

	@ApiModelProperty(value = "用户类型(0=会员 1=代理),模拟接口为必填参数,APP接口不用传.", example = "1")
	@Min(value = 0, message = "用户类型最小值只能是0")
	@Max(value = 1, message = "用户类型最大值只能是1")
	private Integer userType;

	@ApiModelProperty(value = "用户id(会员或代理id)", hidden = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long userId;

	@ApiModelProperty(value = "会员名称")
	private String userName;

	@ApiModelProperty(value = "支付大类型")
	private Integer payType;

	@ApiModelProperty(value = "支付通道类型")
	private Integer paymentChannelType;

	@ApiModelProperty(value = "请求三方商户支付的配置id")
	private Long configId;

	@NotNull(message = "提款金额不能为空")
	@ApiModelProperty(value = "提款金额", required = true)
	private BigDecimal orderAmount;

	@ApiModelProperty(value = "币种")
	private String currency;

	@NotNull(message = "提款方式不能为空")
	@ApiModelProperty(value = "提款方式(1=人民币取款 2=USDT取款)", required = true,example = "1")
	@Min(value = 1, message = "提款方式最小值只能是1")
	@Max(value = 4, message = "提款方式最大值只能是4")
	private Integer withdrawType;

	@NotNull(message = "收款账户id不能为空")
	@ApiModelProperty(value = "收款账户id", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long accountId;

	@ApiModelProperty(value = "客户ip", hidden = true)
	private String customerIp;

	@NotNull(message = "客户设备类型不能为空")
	@Range(min = 1, max = 5, message = "客户设备类型错误,1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP")
	@ApiModelProperty(value = "终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP）", required = true)
	private Integer deviceType;

	@NotBlank(message = "客户设备号不能为空")
	@ApiModelProperty(value = "客户设备号", required = true)
	private String deviceNo;

	@ApiModelProperty(value = "支付密码,代理佣金提款时为必填参数")
	private String payPassword;

	@ApiModelProperty(value = "提款的银行卡信息，根据提款方式确认是否传参")
	private WithdrawBankReqDTO bankInfo;

	@ApiModelProperty(value = "提款的虚拟账户信息，根据提款方式确认是否传参")
	private CreateVirtualReqDTO virtualInfo;

	@ApiModelProperty(value = "取款类型: 1-账单限制，2流水限制")
	private Integer withdrawLimitType;

	/**
	 * 所需有效流水
	 */
	@ApiModelProperty(value = "所需有效流水")
	private BigDecimal validBillAmount;

	/**
	 * 已完成有效流水
	 */
	@ApiModelProperty(value = "已完成有效流水")
	private BigDecimal completeBillAmount;

	/**
	 * 剩余可提现金额
	 */
	@ApiModelProperty(value = "剩余可提现金额")
	private BigDecimal withdrawRemainAmount;

	@ApiModelProperty(value = "银行卡提现手续费", hidden = true)
	private BigDecimal withdrawBankFee;

	@ApiModelProperty(value = "trc20提现手续费", hidden = true)
	private BigDecimal withdrawTrcFee;

	@ApiModelProperty(value = "erc20提现手续费", hidden = true)
	private BigDecimal withdrawErcFee;

}
