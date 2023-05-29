package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: member-server-parent
 * @description:
 * @author: hirty
 * @create: 2021/07/10
 */
@Data
public class ProxyCommissionRecordDto {

	@ApiModelProperty(value = "返佣总额")
	private BigDecimal commissionAmount;
	@ApiModelProperty(value = "报表月份")
	private Integer reportDate;

}
