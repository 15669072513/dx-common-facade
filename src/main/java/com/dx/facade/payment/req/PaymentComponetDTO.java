package com.dx.facade.payment.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: payment-server
 * @description:
 * @author: karthus
 * @create: 2021/11/10
 */
@Data
@Builder
@ApiModel(value = "代理取款当日剩余", description = "代理取款当日剩余")
public class PaymentComponetDTO {

	@ApiModelProperty(value = "当日剩余额度", hidden = true)
	private BigDecimal remainingAmount;

	@ApiModelProperty(value = "用户id", hidden = true)
	private Integer remainingNum;

	@ApiModelProperty(value = "是否大额")
	private Boolean isBig;

}
