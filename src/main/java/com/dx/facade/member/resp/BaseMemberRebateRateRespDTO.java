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
 * 返水比例父响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "RebateRate响应DTO对象", description = "返水比例响应DTO")
public class BaseMemberRebateRateRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("代理发放德州返水比例")
    private BigDecimal texasRebate;
    
    @ApiModelProperty("代理发放德州保险返水比例")
    private BigDecimal texasInsuranceRebate;
    
    @ApiModelProperty("代理发放真人返水比例")
    private BigDecimal actualPersonRebate;
    
    @ApiModelProperty("代理发放体育返水比例")
    private BigDecimal sportsRebate;
    
    @ApiModelProperty("代理发放彩票返水比例")
    private BigDecimal lotteryTicketRebate;
    
    @ApiModelProperty("代理发放棋牌返水比例")
    private BigDecimal chessRebate;
    
    @ApiModelProperty("代理发放电竞返水比例")
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
