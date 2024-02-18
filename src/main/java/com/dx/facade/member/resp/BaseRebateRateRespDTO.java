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
 * 会员返水比例父响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "会员返水比率响应DTO对象", description = "会员返水比例响应DTO")
public class BaseRebateRateRespDTO implements Serializable {

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
    
    @ApiModelProperty("平台发放德州俱乐部返水比例")
    private BigDecimal texasRebatePlatform;
    
    @ApiModelProperty("平台发放真人返水比例")
    private BigDecimal actualPersonRebatePlatform;
    
    @ApiModelProperty("平台发放体育返水比例")
    private BigDecimal sportsRebatePlatform;
    
    @ApiModelProperty("平台发放彩票返水比例")
    private BigDecimal lotteryTicketRebatePlatform;
    
    @ApiModelProperty("平台发放棋牌返水比例")
    private BigDecimal chessRebatePlatform;
    
    @ApiModelProperty("平台发放电竞返水比例")
    private BigDecimal esportsRebatePlatform;
    
    
    
}
