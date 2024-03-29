package com.dx.facade.member.param;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 返佣比例DTO父类
 * </p>
 *
 * @author bicycle
 * @since 2023-9-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "CommissionRateDTO父类", description = "返佣比例DTO父类")
public class BaseCommissionRateParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("ID")
    private Long id;
    
    @ApiModelProperty("序号")
	private Integer serialNo;

	@ApiModelProperty("净输赢")
	private BigDecimal validBetAmount;

	@ApiModelProperty("本月活跃人数")
	private Integer activeUsers;

	@ApiModelProperty("本月新增活跃人数")
	private Integer addActiveUsers;
    
    @ApiModelProperty("德州俱乐部返佣比例")
    @DecimalMin(value = "0.00", message = "德州俱乐部返佣比例不能小于0.00")
    @NotNull(message = "德州俱乐部返佣比例不能为空")
    private BigDecimal texasCommission;
    
    @ApiModelProperty("德州保险返佣比例")
    @DecimalMin(value = "0.00", message = "德州返佣比例不能小于0.00")
    @NotNull(message = "德州保险返佣比例不能为空")
    private BigDecimal texasInsuranceCommission;
    
    @ApiModelProperty("其他返佣比例")
    @DecimalMin(value = "0.00", message = "其他返佣比例不能小于0.00")
    @NotNull(message = "其他返佣比例不能为空")
    private BigDecimal otherCommission;


}
