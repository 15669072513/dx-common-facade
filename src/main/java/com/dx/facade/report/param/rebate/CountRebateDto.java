package com.dx.facade.report.param.rebate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


/**
 * 会员返水记录统计 返回参数
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/06/22
 */
@ApiModel(value="com-ob-member-resp-CountDto")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountRebateDto {
	
	@ApiModelProperty("有效金额总计")
	
	private BigDecimal validBetTotal;
	
	@ApiModelProperty("有效金额小计")
	
	private BigDecimal validBetSubtotal;
	
	@ApiModelProperty("返水金额总计")
	
	private BigDecimal rebateTotal;
	
	@ApiModelProperty("返水金额小计")
	
	private BigDecimal rebateSubtotal;
	
}