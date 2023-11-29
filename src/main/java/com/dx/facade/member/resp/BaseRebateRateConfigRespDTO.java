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
 * 返点比例配置父响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "RebateRateConfig响应DTO对象", description = "返点比例配置响应DTO")
public class BaseRebateRateConfigRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("德州返点比例")
    private BigDecimal texasRebate;
    
    @ApiModelProperty("德州保险返点比例")
    private BigDecimal texasInsuranceRebate;
    
    @ApiModelProperty("真人返点比例")
    private BigDecimal actualPersonRebate;
    
    @ApiModelProperty("体育返点比例")
    private BigDecimal sportsRebate;
    
    @ApiModelProperty("彩票返点比例")
    private BigDecimal lotteryTicketRebate;
    
    @ApiModelProperty("棋牌返点比例")
    private BigDecimal chessRebate;
    
    @ApiModelProperty("电竞返点比例")
    private BigDecimal esportsRebate;
    
}
