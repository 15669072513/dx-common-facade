package com.dx.facade.report.resp.report;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-resp-report-PlayerDayReportSummaryDTO", description = "会员报表小计/总计对象")
public class PlayerDayReportSummaryDTO {

    @ApiModelProperty("首存金额CNY")
    private BigDecimal firstDepositAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("首存金额VND")
    private BigDecimal firstDepositAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("首存金额THB")
    private BigDecimal firstDepositAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("总存款CNY")
    private BigDecimal depositAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("总存款VND")
    private BigDecimal depositAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("总存款THB")
    private BigDecimal depositAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("总取款CNY")
    private BigDecimal withdrawAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("总取款VND")
    private BigDecimal withdrawAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("总取款THB")
    private BigDecimal withdrawAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("存取差CNY")
    private BigDecimal depositWithdrawDifferAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("存取差VND")
    private BigDecimal depositWithdrawDifferAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("存取差THB")
    private BigDecimal depositWithdrawDifferAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("注单量")
    private Long betCount = 0L;

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
    private BigDecimal returnWaterAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("返水金额VND")
    private BigDecimal returnWaterAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("返水金额THB")
    private BigDecimal returnWaterAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("优惠总额CNY")
    private BigDecimal discountAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("优惠总额VND")
    private BigDecimal discountAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("优惠总额THB")
    private BigDecimal discountAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("其他调整CNY")
    private BigDecimal otherAdjustAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("其他调整VND")
    private BigDecimal otherAdjustAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("其他调整THB")
    private BigDecimal otherAdjustAmountTHB = BigDecimal.ZERO;

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
        return netAmountCNY.add(returnWaterAmountCNY).add(discountAmountCNY).add(otherAdjustAmountCNY);
    }

    /**
     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额 VND
     *
     * @return
     */
    public BigDecimal getNetProfitVND() {
        return netAmountVND.add(returnWaterAmountVND).add(discountAmountVND).add(otherAdjustAmountVND);
    }

    /**
     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额 THB
     *
     * @return
     */
    public BigDecimal getNetProfitTHB() {
        return netAmountTHB.add(returnWaterAmountTHB).add(discountAmountTHB).add(otherAdjustAmountTHB);
    }
}
