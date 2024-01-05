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
 * 返点比例试算请求参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "返点比例试算请求Param", description = "返点比例试算请求Param")
public class RebateRateTryCaclParamDTO implements BaseParmDTO, Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("商户Id")
    private Long merchantId;
    
    @ApiModelProperty("用户类型 0：会员 1：代理")
    private Integer userType;
    
    @ApiModelProperty("上级代理Id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理名称")
    private String parentProxyName;
    
    @ApiModelProperty("总Id")
    private Long topProxyId;
    
    @ApiModelProperty("总代名称")
    private String topProxyName;
    
    @ApiModelProperty("调整类型 1：全部失效 2：等差递减 3：向上持平")
    private Integer adjustmentType;
    
    @ApiModelProperty("德州俱乐部返点比例")
    private BigDecimal texasRebate;
    
    @ApiModelProperty("德州保险返点比例")
    private BigDecimal texasInsuranceRebate;
    
    @ApiModelProperty("真人返点比例")
    private BigDecimal actualPersonRebate;
    
    @ApiModelProperty("体育返点比例")
    private BigDecimal sportsRebate;
    
    @ApiModelProperty("彩票返点比例")
    private BigDecimal lotteryTicketRebate;
    
    private BigDecimal chessRebate;
    
    @ApiModelProperty("电竞返点比例")
    private BigDecimal esportsRebate;
    
	@Override
	public void check() {
	}

}
