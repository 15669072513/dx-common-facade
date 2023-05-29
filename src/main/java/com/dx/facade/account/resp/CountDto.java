package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description: 聚合统计 返回参数封装
 * @version: v1.0.0
 * @author: agan
 */
@Data
public class CountDto {
	
	@ApiModelProperty(value = "总计")
	
	private BigDecimal total = BigDecimal.ZERO;

	@ApiModelProperty(value = "总计CNY")
	private BigDecimal totalCNY = BigDecimal.ZERO;

	@ApiModelProperty(value = "总计VND")
	private BigDecimal totalVND = BigDecimal.ZERO;

	@ApiModelProperty(value = "总计THB")
	private BigDecimal totalTHB = BigDecimal.ZERO;
	
	@ApiModelProperty(value = "小计")
	private BigDecimal subtotal = BigDecimal.ZERO;

	@ApiModelProperty(value = "小计CNY")
	private BigDecimal subtotalCNY = BigDecimal.ZERO;

	@ApiModelProperty(value = "小计VND")
	private BigDecimal subtotalVND = BigDecimal.ZERO;

	@ApiModelProperty(value = "小计THB")
	private BigDecimal subtotalTHB = BigDecimal.ZERO;
	
}
