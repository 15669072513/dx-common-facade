package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberFlowAdjustDTO implements Serializable {

	@ApiModelProperty(value = "调整类型-1:增加，2:扣除")
    @NotNull(message = "调整类型不能为空")
	private Integer adjustType;

	@ApiModelProperty("调整数量")
	@NotNull(message = "调整数量不能为空")
	private BigDecimal amount;

	@ApiModelProperty("会员id")
	@NotNull(message = "会员id不能为空")
	private Long memberId;

	@ApiModelProperty("会员id")
	@NotNull(message = "会员id不能为空")
	private String remark;

	public BigDecimal validAmountAdj(){
		return 1 == this.adjustType.intValue() ? amount.abs() : amount.abs().negate();
	}
	
}