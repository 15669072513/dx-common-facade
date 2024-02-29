package com.dx.facade.report.resp.member;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

@ApiModel(description = "会员盈亏汇总/小计")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberNetAmountSummaryRespDTO {

    @ApiModelProperty("注单量")
    private Long betCount = 0L;

    @ApiModelProperty("投注金额")
    private BigDecimal firstDeposit = BigDecimal.ZERO;;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount = BigDecimal.ZERO;

    @ApiModelProperty("投注金额VND")
    private BigDecimal betAmountVND = BigDecimal.ZERO;

    @ApiModelProperty("投注金额THB")
    private BigDecimal betAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount = BigDecimal.ZERO;

    @ApiModelProperty("有效投注VND")
    private BigDecimal validBetAmountVND = BigDecimal.ZERO;

    @ApiModelProperty("有效投注THB")
    private BigDecimal validBetAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount = BigDecimal.ZERO;

    @ApiModelProperty("投注盈亏VND")
    private BigDecimal netAmountVND = BigDecimal.ZERO;

    @ApiModelProperty("投注盈亏THB")
    private BigDecimal netAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("返水金额")
    private BigDecimal rebateAmount = BigDecimal.ZERO;


    @ApiModelProperty("代理发放会员返水")
    private BigDecimal memberRebateAmountByProxy;


    @ApiModelProperty("平台发放会员返水")
    private BigDecimal memberRebateAmountByPlat;
    @ApiModelProperty("其他调整")
    private BigDecimal otherAdjustAmount = BigDecimal.ZERO;

    @ApiModelProperty("返水金额VND")
    private BigDecimal rebateAmountVND = BigDecimal.ZERO;

    @ApiModelProperty("返水金额THB")
    private BigDecimal rebateAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("优惠金额")
    private BigDecimal discountAmount = BigDecimal.ZERO;

    @ApiModelProperty("优惠金额VND")
    private BigDecimal discountAmountVND = BigDecimal.ZERO;

    @ApiModelProperty("优惠金额THB")
    private BigDecimal discountAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("其他调整")
    private BigDecimal artificialPatchAmount = BigDecimal.ZERO;

    @ApiModelProperty("其他调整VND")
    private BigDecimal artificialPatchAmountVND = BigDecimal.ZERO;

    @ApiModelProperty("其他调整THB")
    private BigDecimal artificialPatchAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("净盈亏")
    private BigDecimal netProfit = BigDecimal.ZERO;

    @ApiModelProperty("净盈亏VND")
    private BigDecimal netProfitVND = BigDecimal.ZERO;

    @ApiModelProperty("净盈亏THB")
    private BigDecimal netProfitTHB = BigDecimal.ZERO;

    @ApiModelProperty("服务费-手牌")
    private BigDecimal serviceChargeHand;

    @ApiModelProperty("服务费-局抽")
    private BigDecimal serviceChargeRound;

    // 会员盈利率=投注盈亏/投注金额
    @ApiModelProperty(value = "会员盈利率")
    private BigDecimal netRate = BigDecimal.ZERO;

    /**
     * 会员盈利率=投注盈亏/投注金额
     *
     * @return
     */
    @ApiModelProperty("会员盈利率")
    public BigDecimal getNetRate() {
        if(betAmount==null||betAmount.compareTo(BigDecimal.ZERO)==0){
            return BigDecimal.ZERO;
        }
        return netAmount.divide(betAmount, 4, RoundingMode.DOWN);
    }

//    /**
//     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额 CNY
//     *
//     * @return
//     */
//    public BigDecimal getNetProfit() {
//        return netAmount.add(rebateAmount).add(discountAmount).add(artificialPatchAmount);
//    }

    /**
     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额 VND
     *
     * @return
     */
    public BigDecimal getNetProfitVND() {
        return netAmountVND.add(rebateAmountVND).add(discountAmountVND).add(artificialPatchAmountVND);
    }

    /**
     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额 THB
     *
     * @return
     */
    public BigDecimal getNetProfitTHB() {
        return netAmountTHB.add(rebateAmountTHB).add(discountAmountTHB).add(artificialPatchAmountTHB);
    }


}
