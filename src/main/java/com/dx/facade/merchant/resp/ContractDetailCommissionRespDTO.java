package com.dx.facade.merchant.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 代理详情-我的佣金契约 返回参数
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContractDetailCommissionRespDTO {
	
	@ApiModelProperty(value = "序号")
	private Integer level;

	@ApiModelProperty(value = "游戏亏损")
	private BigDecimal netAmount;
	
	@ApiModelProperty(value = "游戏流水")
	private BigDecimal validBetAmount;

	@ApiModelProperty(value = "本月活跃人数")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long activeUsers;
	
	@ApiModelProperty(value = "本月有效活跃人数")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long effecactiveUsers;
	
	@ApiModelProperty(value = "返佣比例")
	private BigDecimal rebateRate;

	@ApiModelProperty(value = "本月新增有效活跃人数要求")
	private Long monthAddActiveCount;
}
