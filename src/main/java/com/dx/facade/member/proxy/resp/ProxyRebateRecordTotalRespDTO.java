package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class ProxyRebateRecordTotalRespDTO {

    /**
     * 个人返点金额
     */
    @ApiModelProperty(value = "个人返点(CNY)",  example = "2343")
    private BigDecimal personRebateAmountIn;

    @ApiModelProperty(value = "个人返点(VND)",  example = "2343")
    private BigDecimal personRebateAmountInVND;

    @ApiModelProperty(value = "个人返点(THB)",  example = "2343")
    private BigDecimal personRebateAmountInTHB;

//    /**
//     * 下级返点金额
//     */
//    @ApiModelProperty(value = "下级返点")
//    private BigDecimal childRebateAmount;
//
//    /**
//     * 团队返点金额
//     */
//    @ApiModelProperty(value = "团队返点")
//    private BigDecimal rebateAmount;
//
//    /**
//     * 总会员游戏流水
//     */
//    @ApiModelProperty(value = "总流水")
//    private BigDecimal totalBetAmount;
//
//    /**
//     * 总会员流水纠正金额
//     */
//    @ApiModelProperty(value = "流水纠正")
//    private BigDecimal totalAdjustBetAmount;
//
//    /**
//     * 实际总流水金额
//     */
//    @ApiModelProperty(value = "实际流水")
//    private BigDecimal totalRealBetAmount;

}