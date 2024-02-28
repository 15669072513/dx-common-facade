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
    
    @ApiModelProperty("德州保险占成比例")
    private BigDecimal texasInsuranceZhancheng;
    
    @ApiModelProperty("真人占成比例")
    private BigDecimal actualPersonZhancheng;
    
    @ApiModelProperty("体育占成比例")
    private BigDecimal sportsZhancheng;
    
    @ApiModelProperty("彩票占成比例")
    private BigDecimal lotteryTicketZhancheng;
    
    @ApiModelProperty("棋牌占成比例")
    private BigDecimal chessZhancheng;
    
    @ApiModelProperty("电竞占成比例")
    private BigDecimal esportsZhancheng;


    public void convertNullToZero(){
        if (texasRebate == null) {
            texasRebate = BigDecimal.ZERO;
        }
        if (texasInsuranceRebate == null) {
            texasInsuranceRebate = BigDecimal.ZERO;
        }
        if (actualPersonRebate == null) {
            actualPersonRebate = BigDecimal.ZERO;
        }
        if (sportsRebate == null) {
            sportsRebate = BigDecimal.ZERO;
        }
        if (lotteryTicketRebate == null) {
            lotteryTicketRebate = BigDecimal.ZERO;
        }
        if (chessRebate == null) {
            chessRebate = BigDecimal.ZERO;
        }
        if (esportsRebate == null) {
            esportsRebate = BigDecimal.ZERO;
        }
        if (texasInsuranceZhancheng == null) {
            texasInsuranceZhancheng = BigDecimal.ZERO;
        }
        if (actualPersonZhancheng == null) {
            actualPersonZhancheng = BigDecimal.ZERO;
        }
        if (sportsZhancheng == null) {
            sportsZhancheng = BigDecimal.ZERO;
        }
        if (lotteryTicketZhancheng == null) {
            lotteryTicketZhancheng = BigDecimal.ZERO;
        }
        if (chessZhancheng == null) {
            chessZhancheng = BigDecimal.ZERO;
        }
        if (esportsZhancheng == null) {
            esportsZhancheng = BigDecimal.ZERO;
        }
    }
}
