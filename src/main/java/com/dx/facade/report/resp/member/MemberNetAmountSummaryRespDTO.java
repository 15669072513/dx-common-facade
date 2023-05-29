package com.dx.facade.report.resp.member;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@ApiModel(description = "会员盈亏汇总/小计")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberNetAmountSummaryRespDTO {

    @ApiModelProperty("注单量")
    private Long betCount = 0L;

    @ApiModelProperty("投注金额")
    private BigDecimal firstDeposit;

    @ApiModelProperty("投注金额CNY")
    private BigDecimal betAmountCNY = BigDecimal.ZERO;

    @ApiModelProperty("投注金额VND")
    private BigDecimal betAmountVND = BigDecimal.ZERO;

    @ApiModelProperty("投注金额THB")
    private BigDecimal betAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("有效投注CNY")
    private BigDecimal validBetAmountCNY = BigDecimal.ZERO;

    @ApiModelProperty("有效投注VND")
    private BigDecimal validBetAmountVND = BigDecimal.ZERO;

    @ApiModelProperty("有效投注THB")
    private BigDecimal validBetAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("投注盈亏CNY")
    private BigDecimal netAmountCNY = BigDecimal.ZERO;

    @ApiModelProperty("投注盈亏VND")
    private BigDecimal netAmountVND = BigDecimal.ZERO;

    @ApiModelProperty("投注盈亏THB")
    private BigDecimal netAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("返水金额CNY")
    private BigDecimal rebateAmountCNY = BigDecimal.ZERO;

    @ApiModelProperty("返水金额VND")
    private BigDecimal rebateAmountVND = BigDecimal.ZERO;

    @ApiModelProperty("返水金额THB")
    private BigDecimal rebateAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("优惠金额CNY")
    private BigDecimal discountAmountCNY = BigDecimal.ZERO;

    @ApiModelProperty("优惠金额VND")
    private BigDecimal discountAmountVND = BigDecimal.ZERO;

    @ApiModelProperty("优惠金额THB")
    private BigDecimal discountAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("其他调整CNY")
    private BigDecimal artificialPatchAmountCNY = BigDecimal.ZERO;

    @ApiModelProperty("其他调整VND")
    private BigDecimal artificialPatchAmountVND = BigDecimal.ZERO;

    @ApiModelProperty("其他调整THB")
    private BigDecimal artificialPatchAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("净盈亏CNY")
    private BigDecimal netProfitCNY = BigDecimal.ZERO;

    @ApiModelProperty("净盈亏VND")
    private BigDecimal netProfitVND = BigDecimal.ZERO;

    @ApiModelProperty("净盈亏THB")
    private BigDecimal netProfitTHB = BigDecimal.ZERO;

    /**
     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额 CNY
     *
     * @return
     */
    public BigDecimal getNetProfitCNY() {
        return netAmountCNY.add(rebateAmountCNY).add(discountAmountCNY).add(artificialPatchAmountCNY);
    }

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
