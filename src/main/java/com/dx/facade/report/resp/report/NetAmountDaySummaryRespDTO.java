package com.dx.facade.report.resp.report;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NetAmountDaySummaryRespDTO {

    @ApiModelProperty("投注人数")
    private Long memberCount=0l;

    @ApiModelProperty("注单数")
    private Long betCount=0l;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount=BigDecimal.ZERO;

    @ApiModelProperty("投注金额")
    private BigDecimal validBetAmount=BigDecimal.ZERO;

    @ApiModelProperty("投注金额")
    private BigDecimal netAmount=BigDecimal.ZERO;

    @ApiModelProperty("返水金额=会员返水+返水人工加减额CNY")
    private BigDecimal rebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("优惠金额=会员优惠+会员活动人工加减额+会员VIP福利")
    private BigDecimal discountAmount = BigDecimal.ZERO;


    @ApiModelProperty("其他调整=人工加减额中的其他调整额CNY")
    private BigDecimal artificialPatchAmount = BigDecimal.ZERO;

    @ApiModelProperty("投注额CNY")
    private BigDecimal betAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("投注额VND")
    private BigDecimal betAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("投注额THB")
    private BigDecimal betAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("有效投注额CNY")
    private BigDecimal validBetAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("有效投注额VND")
    private BigDecimal validBetAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("有效投注额THB")
    private BigDecimal validBetAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("输赢金额CNY")
    private BigDecimal netAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("输赢金额VND")
    private BigDecimal netAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("输赢金额THB")
    private BigDecimal netAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("返水金额=会员返水+返水人工加减额CNY")
    private BigDecimal rebateAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("返水金额=会员返水+返水人工加减额VND")
    private BigDecimal rebateAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("返水金额=会员返水+返水人工加减额THB")
    private BigDecimal rebateAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("优惠金额=会员优惠+会员活动人工加减额+会员VIP福利CNY")
    private BigDecimal discountAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("优惠金额=会员优惠+会员活动人工加减额+会员VIP福利VND")
    private BigDecimal discountAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("优惠金额=会员优惠+会员活动人工加减额+会员VIP福利THB")
    private BigDecimal discountAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("其他调整=人工加减额中的其他调整额CNY")
    private BigDecimal artificialPatchAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("其他调整=人工加减额中的其他调整额VND")
    private BigDecimal artificialPatchAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("其他调整=人工加减额中的其他调整额THB")
    private BigDecimal artificialPatchAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("净盈亏")
    private BigDecimal netProfit = BigDecimal.ZERO;
    @ApiModelProperty("净盈亏CNY")
    private BigDecimal netProfitCNY = BigDecimal.ZERO;
    @ApiModelProperty("净盈亏VND")
    private BigDecimal netProfitVND = BigDecimal.ZERO;
    @ApiModelProperty("净盈亏THB")
    private BigDecimal netProfitTHB = BigDecimal.ZERO;

    @ApiModelProperty("其他调整")
    private BigDecimal otherAdjustAmount = BigDecimal.ZERO;

    @ApiModelProperty("局服务费")
    private BigDecimal serviceChargeRound = BigDecimal.ZERO;
    /**
     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额 CNY
     * 20240221 净盈亏 直接在数据库读取
     * @return
     */
    public BigDecimal getNetProfit() {
       return netProfit;
    }

    public BigDecimal getNetProfiCNY() {
        if (Objects.isNull(netAmount)
                || Objects.isNull(discountAmount)
                || Objects.isNull(rebateAmount)
                || Objects.isNull(artificialPatchAmount)) {
            return null;
        }
        return netAmount.add(rebateAmount).add(discountAmount).add(artificialPatchAmount);
    }

    /**
     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额 CNY
     *
     * @return
     */
    public BigDecimal getNetProfitCNY() {
        if (Objects.isNull(netAmount)
                || Objects.isNull(discountAmount)
                || Objects.isNull(rebateAmount)
                || Objects.isNull(artificialPatchAmount)) {
            return null;
        }
        return netAmount.add(rebateAmount).add(discountAmount).add(artificialPatchAmount);
    }

    /**
     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额 VND
     *
     * @return
     */
    public BigDecimal getNetProfitVND() {
        if (Objects.isNull(netAmountVND)
                || Objects.isNull(discountAmountVND)
                || Objects.isNull(rebateAmountVND)
                || Objects.isNull(artificialPatchAmountVND)) {
            return null;
        }
        return netAmountVND.add(rebateAmountVND).add(discountAmountVND).add(artificialPatchAmountVND);
    }

    /**
     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额 THB
     *
     * @return
     */
    public BigDecimal getNetProfitTHB() {
        if (Objects.isNull(netAmountTHB)
                || Objects.isNull(discountAmountTHB)
                || Objects.isNull(rebateAmountTHB)
                || Objects.isNull(artificialPatchAmountTHB)) {
            return null;
        }
        return netAmountTHB.add(rebateAmountTHB).add(discountAmountTHB).add(artificialPatchAmountTHB);
    }

}
