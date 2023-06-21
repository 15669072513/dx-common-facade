package com.dx.facade.report.resp.report;


import com.dx.util.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NetAmountDayRespDTO {

    @ApiModelProperty("日期，比如20210531")
    private String staticsDate;

    public String getStaticsDate() {
        if (StringUtil.isBlank(staticsDate) || staticsDate.length() < 8) {
            return staticsDate;
        }
        return staticsDate.substring(0, 4)
                + "-"
                + staticsDate.substring(4, 6)
                + "-"
                + staticsDate.substring(6, 8);
    }

    @ApiModelProperty("优惠金额=会员优惠+会员活动人工加减额+会员VIP福利CNY")
    private BigDecimal discountAmountCNY;

    @ApiModelProperty("优惠金额=会员优惠+会员活动人工加减额+会员VIP福利VND")
    private BigDecimal discountAmountVND;

    @ApiModelProperty("优惠金额=会员优惠+会员活动人工加减额+会员VIP福利THB")
    private BigDecimal discountAmountTHB;

    @ApiModelProperty("返水金额=会员返水+返水人工加减额CNY")
    private BigDecimal rebateAmountCNY;

    @ApiModelProperty("返水金额=会员返水+返水人工加减额VND")
    private BigDecimal rebateAmountVND;

    @ApiModelProperty("返水金额=会员返水+返水人工加减额THB")
    private BigDecimal rebateAmountTHB;

    @ApiModelProperty("其他调整=人工加减额中的其他调整额CNY")
    private BigDecimal artificialPatchAmountCNY;

    @ApiModelProperty("其他调整=人工加减额中的其他调整额VND")
    private BigDecimal artificialPatchAmountVND;

    @ApiModelProperty("其他调整=人工加减额中的其他调整额THB")
    private BigDecimal artificialPatchAmountTHB;

    @ApiModelProperty("投注人数")
    private Long memberCount;

    @ApiModelProperty("注单数")
    private Long betCount;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty("投注金额")
    private BigDecimal validBetAmount;

    @ApiModelProperty("投注金额")
    private BigDecimal netAmount;


    @ApiModelProperty("投注额CNY")
    private BigDecimal betAmountCNY;

    @ApiModelProperty("投注额VND")
    private BigDecimal betAmountVND;

    @ApiModelProperty("投注额THB")
    private BigDecimal betAmountTHB;

    @ApiModelProperty("有效投注额CNY")
    private BigDecimal validBetAmountCNY;

    @ApiModelProperty("有效投注额VND")
    private BigDecimal validBetAmountVND;

    @ApiModelProperty("有效投注额THB")
    private BigDecimal validBetAmountTHB;

    @ApiModelProperty("输赢金额CNY")
    private BigDecimal netAmountCNY;

    @ApiModelProperty("输赢金额VND")
    private BigDecimal netAmountVND;

    @ApiModelProperty("输赢金额THB")
    private BigDecimal netAmountTHB;

    @ApiModelProperty("净盈亏CNY")
    private BigDecimal netProfitCNY;

    @ApiModelProperty("净盈亏VND")
    private BigDecimal netProfitVND;

    @ApiModelProperty("净盈亏THB")
    private BigDecimal netProfitTHB;

    /**
     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额 CNY
     *
     * @return
     */
    public BigDecimal getNetProfitCNY() {
        if (Objects.isNull(netAmountCNY)
                || Objects.isNull(discountAmountCNY)
                || Objects.isNull(rebateAmountCNY)
                || Objects.isNull(artificialPatchAmountCNY)) {
            return null;
        }
        return netAmountCNY.add(rebateAmountCNY).add(discountAmountCNY).add(artificialPatchAmountCNY);
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
