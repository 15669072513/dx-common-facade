package com.dx.facade.report.resp.proxynetamountday;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyNetAmountMonthRespDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:34:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyNetAmountDayRespDTO {

    /** staticsDate */
    @ApiModelProperty(value = "日期", example = "20210901")
    private Integer staticsDate;

    @ApiModelProperty(value = "币种", example = "CNY")
    private String currency;

    /** proxyName */
    @ApiModelProperty(value = "代理账号", example = "zw9z_string0001")
    private String proxyName;

    /** betAmount */
    @ApiModelProperty(value = "总投注", example = "1500.00")
    private BigDecimal betAmount;

    /** validBetAmount */
    @ApiModelProperty(value = "总有效投注", example = "1500.00")
    private BigDecimal validBetAmount;

    /** flowCorrection */
    @ApiModelProperty(value = "流水纠正", example = "1500.00")
    private BigDecimal flowCorrection;

    /** memberCount */
    @ApiModelProperty(value = "投注人数", example = "100")
    private Long memberCount;

    /** betCount */
    @ApiModelProperty(value = "注单量", example = "200")
    private Long betCount;

    /** netAmount */
    @ApiModelProperty(value = "会员总输赢", example = "1500.00")
    private BigDecimal netAmount;



    /** memberNetWinAmount */
    @ApiModelProperty(value = "会员净输赢", example = "1500.00")
    private BigDecimal memberNetWinAmount;
    /** rebateAmount */
    @ApiModelProperty(value = "会员返水", example = "1500.00")
    private BigDecimal rebateAmount;

    /** discountAmount */
    @ApiModelProperty(value = "会员优惠", example = "1500.00")
    private BigDecimal discountAmount;

    /** artificialPatchAmount */
    @ApiModelProperty(value = "会员账户调整", example = "1500.00")
    private BigDecimal artificialPatchAmount;

    /** repairBetAmount */
    @ApiModelProperty(value = "补单输赢", example = "1500.00")
    private BigDecimal repairBetAmount;

    /** proxyRebatePoint */
    @ApiModelProperty(value = "代理返点", example = "1500.00")
    private BigDecimal proxyRebatePoint;

    @ApiModelProperty("会员总盈亏")
    private BigDecimal totalNetAmount;
}
