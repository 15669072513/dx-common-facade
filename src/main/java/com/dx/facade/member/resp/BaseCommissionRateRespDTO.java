package com.dx.facade.member.resp;

import java.io.Serializable;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 返佣比例父响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-9-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "CommissionRate响应DTO对象", description = "返佣比例响应DTO")
public class BaseCommissionRateRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("序号")
	private Integer serialNo;

	@ApiModelProperty("净输赢")
	private BigDecimal validBetAmount;

	@ApiModelProperty("本月活跃人数")
	private Integer activeUsers;

	@ApiModelProperty("本月新增活跃人数")
	private Integer addActiveUsers;
    
    @ApiModelProperty("德州俱乐部返佣比例")
    private BigDecimal texasCommission;
    
    @ApiModelProperty("德州保险返佣比例")
    private BigDecimal texasInsuranceCommission;
    
    @ApiModelProperty("其他返佣比例")
    private BigDecimal otherCommission;
}
