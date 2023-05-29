package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Description: 获取某商户下，某天会员的存取款、有效投注流水、是否连续投注 情况 参数请求封装
 * @version: v1.0.0
 * @author: fitz
 * @date: 2021/6/19
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepositAggByLastWithdrawEsRespDto {
	
	@ApiModelProperty(value = "总充值")
	private BigDecimal depositSumAmount;
	
	@ApiModelProperty(value = "是否连续提款 上次提款到本次提款之间没有发生投注视为连续提款")
	private Integer isContinuityWithDraw;

	@ApiModelProperty(value = "有效流水金额")
	private BigDecimal withdrawWater;

	@ApiModelProperty(value = "最后一次取款统计的 领取总红利")
	private BigDecimal bonusSumAmount;
}

