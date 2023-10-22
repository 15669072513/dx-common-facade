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
@ApiModel(value = "三方返回充值银行卡信息", description = "三方返回充值银行卡信息")
public class DepositOrderBankDTO implements Serializable {

	@ApiModelProperty(value = "订单号")
	private String eventId;

	@ApiModelProperty("三方商户号")
	private String thirdPayId;

	@ApiModelProperty(value = "三方支付订单号")
	private String orderId;

	@ApiModelProperty(value = "支付方式")
	private Long payTypeId;

	@ApiModelProperty(value = "收款银行卡号")
	private String bankNum;

	@ApiModelProperty(value = "收款银行卡地址")
	private String bankAddress;

	@ApiModelProperty(value = "收款银行姓名")
	private String bankOwner;

	@ApiModelProperty(value = "收款银行卡编码")
	private String bankCode;

	@ApiModelProperty(value = "收款卡银行卡名称")
	private String bankCodeName;

	@ApiModelProperty(value = "商户订单号")
	private String merchantOrderId;

	@ApiModelProperty(value = "充值订单金额")
	private BigDecimal payAmount;

	@ApiModelProperty(value = "客户附言")
	private String postscript;

	@ApiModelProperty(value = "对于商户没有页面展示收款卡信息的可以直接显示该页面")
	private String payUrl;

	@ApiModelProperty(value = "虚拟币充值返回的充值链接")
	private String url;

}
