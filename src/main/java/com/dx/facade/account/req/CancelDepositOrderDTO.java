package com.dx.facade.account.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import com.dx.facade.account.exception.ErrorCode;

/**
 * @program: payment-server
 * @description:
 * @author: hirty
 * @create: 2021/08/10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "取消存款参数", description = "取消存款参数")
public class CancelDepositOrderDTO {

	@ApiModelProperty(value = "商户id", hidden = true)
	private Long merchantId;

	@ApiModelProperty(value = "用户id", hidden = true)
	private Long userId;

	@ApiModelProperty(value = "商户订单号", required = true)
	private String eventId;

	public void check() {
		Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
		Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
		Assert.hasText(eventId,ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventId"));
	}

}
