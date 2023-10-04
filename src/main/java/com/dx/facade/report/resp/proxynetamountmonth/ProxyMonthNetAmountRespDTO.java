package com.dx.facade.report.resp.proxynetamountmonth;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


/**
 * ProxyMonthNetAmountRespDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2022年4月12日 下午8:21:18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyMonthNetAmountRespDTO {

    /**
     * proxyId
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "代理id", example = "10001")
    private Long proxyId;

    /**
     * proxyName
     */
    @ApiModelProperty(value = "代理账号", example = "daxia2222")
    private String proxyName;

    /**
     * betAmount
     */
    @ApiModelProperty(value = "总投注", example = "1500.00")
    private BigDecimal betAmount;

    /**
     * validBetAmount
     */
    @ApiModelProperty(value = "有效投注", example = "1500.00")
    private BigDecimal validBetAmount;

    /**
     * netAmount
     */
    @ApiModelProperty(value = "游戏盈亏", example = "1500.00")
    private BigDecimal netAmount;

    /**
     * rebateAmount
     */
    @ApiModelProperty(value = "会员返水", example = "1500.00")
    private BigDecimal rebateAmount;

    /**
     * rebateAmount
     */
    @ApiModelProperty(value = "会员返水 0.2.1", example = "1500.00")
    private BigDecimal memberRebateAmount;
    /**
     * discountAmount
     */
    @ApiModelProperty(value = "会员优惠", example = "1500.00")
    private BigDecimal discountAmount;

    /**
     * artificialPatchAmount
     */
    @ApiModelProperty(value = "会员账户调整", example = "1500.00")
    private BigDecimal artificialPatchAmount;

    /**
     * proxyNet
     */
    @ApiModelProperty(value = "场馆费", example = "1500.00")
    private BigDecimal venueFee;

    @ApiModelProperty(value = "流水纠正", example = "1500.00")
    private BigDecimal flowCorrection;

    /**
     * proxyRebatePoint
     */
    @ApiModelProperty(value = "代理返点", example = "1500.00")
    private BigDecimal proxyRebateAmount;

    /**
     * artificialPatchAmount
     */
    @ApiModelProperty(value = "代理返点其他调整", example = "1500.00")
    private BigDecimal proxyArtificialPatchAmount;
    /**
     * proxyNet
     */
    @ApiModelProperty(value = "代净输赢", example = "1500.00")
    private BigDecimal proxyNet;

    /**
     * lastMonthBalance
     */
    @ApiModelProperty(value = "上月结余", example = "1500.00")
    private BigDecimal lastMonthBalance;

    /**
     * rushNet
     */
    @ApiModelProperty(value = "冲正后净输赢", example = "1500.00")
    private BigDecimal rushNet;

    @Deprecated
    @ApiModelProperty("是否存在下级")
    private Boolean isAllSub;
    @Deprecated
    @ApiModelProperty("会员总盈亏")
    private BigDecimal totalNetAmount;


    /**
     * directValidBetAmount
     */
    @ApiModelProperty(value = "直属会员有效投注", example = "1500.00")
    private BigDecimal directValidBetAmount;

    /**
     * directNetAmount
     */
    @ApiModelProperty(value = "直属会员总输赢", example = "1500.00")
    private BigDecimal directNetAmount;


    /**
     * directRebateAmount
     */
    @ApiModelProperty(value = "直属会员返水", example = "1500.00")
    private BigDecimal directRebateAmount;
    /**
     * directPayAmount
     */
    @ApiModelProperty(value = "直属会员净输赢", example = "1500.00")
    private BigDecimal directProfitAmount;



    /*directArtificialPatchAmount*/
    @ApiModelProperty(value = "直属会员其他调整", example = "1500.00")
    private BigDecimal directArtificialPatchAmount;
}
