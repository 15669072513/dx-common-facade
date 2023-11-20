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
    @ApiModelProperty(value = "代理账号层级", example = "/daxia2222/")
    private String proxyPathUsername;
    @ApiModelProperty(value = "是否有下级代理", example = "true/false")
    private Boolean isAllSub;

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
    @ApiModelProperty(value = "会员返水 0.2.1", example = "1500.00")
    private BigDecimal memberRebateAmount;



    @ApiModelProperty("代理发放会员返水")
    private BigDecimal memberRebateAmountByProxy=BigDecimal.ZERO;


    @ApiModelProperty("平台发放会员返水")
    private BigDecimal memberRebateAmountByPlat=BigDecimal.ZERO;
    /**
     * artificialPatchAmount
     */
    @ApiModelProperty(value = "会员其他调整", example = "1500.00")
    private BigDecimal memberArtificialPatchAmount;

    /**
     * proxyNet
     */
    @ApiModelProperty(value = "场馆费", example = "1500.00")
    private BigDecimal venueFee;


    /**
     * proxyRebatePoint
     */
    @ApiModelProperty(value = "代理返点", example = "1500.00")
    private BigDecimal proxyRebatePoint;

    /**
     * artificialPatchAmount
     */
    @ApiModelProperty(value = "代理返点其他调整", example = "1500.00")
    private BigDecimal proxyArtificialPatchAmount;
    /**
     * proxyNet
     */
    @ApiModelProperty(value = "代净输赢", example = "1500.00")
    private BigDecimal proxyNetwinAmount;

    /**
     * lastMonthBalance
     */
    @ApiModelProperty(value = "上月结余", example = "1500.00")
    private BigDecimal lastMonthBalance;

    /**
     * rushNet
     */
    @ApiModelProperty(value = "冲正后净输赢", example = "1500.00")
    private BigDecimal proxyRushNet;




    @ApiModelProperty(value = "直属会员总投注", example = "1500.00")
    private BigDecimal directBetAmount;

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

    @ApiModelProperty("代理发放直属会员返水")
    private BigDecimal directMemberRebateAmountByProxy;


    @ApiModelProperty("平台发放直属会员返水")
    private BigDecimal directMemberRebateAmountByPlat;
    @ApiModelProperty("直属会员净盈亏 = 直属会员投注盈亏+  直属会员返水（新的）+直属会员其他调整")
    private BigDecimal directNetwinAmount;



    /*directArtificialPatchAmount*/
    @ApiModelProperty(value = "直属会员其他调整", example = "1500.00")
    private BigDecimal directArtificialPatchAmount;
}
