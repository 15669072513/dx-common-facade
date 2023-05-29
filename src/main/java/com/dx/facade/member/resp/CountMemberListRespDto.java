package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Description: 聚合统计 返回参数封装
 * @version: v1.0.0
 * @author: fitz
 * @date: 2021/6/13
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountMemberListRespDto {
	
	@ApiModelProperty(value = "总存款")
	private BigDecimal totalDeposit = BigDecimal.ZERO;
	
	@ApiModelProperty(value = "总取款")
	private BigDecimal totalWithdraw = BigDecimal.ZERO;
}
