package com.dx.facade.merchant.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 代理详情-我的返点契约 返回参数
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContractDetailRebateRespDTO {
	
	@ApiModelProperty(value = "序号")
	private Integer level;
	
	@ApiModelProperty(value = "游戏流水", required = true)
	private BigDecimal validBetAmount;

	@ApiModelProperty(value = "活跃人数", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long activeUsers;

	@ApiModelProperty(value = "有效活跃人数要求", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long effecactiveUsers;
	
	@ApiModelProperty(value = "返点比例", required = true)
	private BigDecimal rebateRate;
}
