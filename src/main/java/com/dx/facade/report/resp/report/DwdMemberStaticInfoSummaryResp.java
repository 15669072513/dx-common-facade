package com.dx.facade.report.resp.report;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 会员列表》会员统计》全量统计
 */
@ApiModel(description = "会员统计全量统计小计/汇总对象")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DwdMemberStaticInfoSummaryResp {

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

    @ApiModelProperty("上级转入CNY")
    private BigDecimal proxyAssistDepositAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("上级转入VND")
    private BigDecimal proxyAssistDepositAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("上级转入THB")
    private BigDecimal proxyAssistDepositAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("佣金转回CNY")
    private BigDecimal proxyTransferInnerAmountCNY = BigDecimal.ZERO;
    @ApiModelProperty("佣金转回VND")
    private BigDecimal proxyTransferInnerAmountVND = BigDecimal.ZERO;
    @ApiModelProperty("佣金转回THB")
    private BigDecimal proxyTransferInnerAmountTHB = BigDecimal.ZERO;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;
    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount;
    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount;
    @ApiModelProperty("返水金额")
    private BigDecimal returnWaterAmount;
    @ApiModelProperty("优惠总额")
    private BigDecimal discountAmount;
    @ApiModelProperty("其他调整")
    private BigDecimal otherAdjustAmount;
    @ApiModelProperty("净盈亏")
    private BigDecimal netProfit;

    @ApiModelProperty("转代次数")
    private Long switchProxyCount;
    @ApiModelProperty("代理上分金额")
    @TableField("proxy_up_amount")
    private BigDecimal proxyUpAmount;

    @ApiModelProperty("代理上分次数")
    @TableField("proxy_up_times")
    private Long proxyUpTimes;

    @ApiModelProperty("代理下分金额")
    @TableField("proxy_down_amount")
    private BigDecimal proxyDownAmount;

    @ApiModelProperty("代理下分次数")
    @TableField("proxy_down_times")
    private Long proxyDownTimes;

    /**
     * 净盈亏 = 投注盈亏+返水盈亏+优惠金额+其他金额
     *
     * @return
     */
    @ApiModelProperty("净盈亏")
    public BigDecimal getNetProfit() {
        return netAmount.add(returnWaterAmount).add(discountAmount).add(otherAdjustAmount);
    }

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
