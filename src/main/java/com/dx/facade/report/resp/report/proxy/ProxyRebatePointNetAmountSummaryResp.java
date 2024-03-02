package com.dx.facade.report.resp.report.proxy;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyRebatePointNetAmountResp 代理返点日明细记录
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:34:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyRebatePointNetAmountSummaryResp {

    /**
     * betAmount
     */
    @ApiModelProperty(value = "德州俱乐部抽水贡献", example = "1500.00")
    private BigDecimal dxClubRebateAmount = BigDecimal.ZERO;

    /**
     * validBetAmount
     */
    @ApiModelProperty(value = "德州保险游戏盈亏", example = "1500.00")
    private BigDecimal dxSecurityNetAmount = BigDecimal.ZERO;

    /**
     * thirdValidBetAmount
     */
    @ApiModelProperty(value = "其他项目有效投注", example = "1500.00")
    private BigDecimal thirdValidBetAmount = BigDecimal.ZERO;

    /**
     * netAmount
     */
    @ApiModelProperty(value = "团队返点金额", example = "1500.00")
    private BigDecimal teamRebateAmount = BigDecimal.ZERO;

    /**
     * rebateAmount
     */
    @ApiModelProperty(value = "下级返点金额", example = "1500.00")
    private BigDecimal childRebateAmount = BigDecimal.ZERO;

    /**
     * discountAmount
     */
    @ApiModelProperty(value = "个人返点金额", example = "1500.00")
    private BigDecimal personRebateAmount = BigDecimal.ZERO;

    /**
     * artificialPatchAmount
     */
    @ApiModelProperty(value = "代理返点其他调整", example = "1500.00")
    private BigDecimal proxyArtificialPatchAmount = BigDecimal.ZERO;

    /**
     * betAmount
     */
    @ApiModelProperty(value = "德州俱乐部抽水贡献-直属会员", example = "1500.00")
    private BigDecimal dxDirectClubRebateAmount = BigDecimal.ZERO;

    /**
     * validBetAmount
     */
    @ApiModelProperty(value = "德州保险游戏盈亏-直属会员", example = "1500.00")
    private BigDecimal dxDirectSecurityNetAmount = BigDecimal.ZERO;

    /**
     * thirdValidBetAmount
     */
    @ApiModelProperty(value = "其他项目有效投注-直属会员", example = "1500.00")
    private BigDecimal thirdDirectValidBetAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "服务费-手牌", example = "1500.00")
    private BigDecimal serviceChargeHand = BigDecimal.ZERO;

    @ApiModelProperty(value = "服务费-局抽", example = "1500.00")
    private BigDecimal serviceChargeRound = BigDecimal.ZERO;

    @ApiModelProperty(value = "直属服务费-手牌", example = "1500.00")
    private BigDecimal directlyServiceChargeHand = BigDecimal.ZERO;

    @ApiModelProperty(value = "直属服务费-局抽", example = "1500.00")
    private BigDecimal directlyServiceChargeRound = BigDecimal.ZERO;

    @ApiModelProperty(value = "直属会员服务费", example = "1500.00")
    private BigDecimal directlyServiceAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "直属会员服务费贡献", example = "1500.00")
    private BigDecimal directlyServiceAmountContribution = BigDecimal.ZERO;

    @ApiModelProperty(value = "德州俱乐部服务费", example = "1500.00")
    private BigDecimal dxClubServiceAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "德州俱乐部服务费贡献", example = "1500.00")
    private BigDecimal serviceAmountContribution = BigDecimal.ZERO;

    @ApiModelProperty(value = "直属服务费-局抽贡献", example = "1500.00")
    private BigDecimal directlyServiceChargeRoundContribution = BigDecimal.ZERO;

    @ApiModelProperty(value = "直属服务费-手牌贡献", example = "1500.00")
    private BigDecimal directlyServiceChargeHandContribution = BigDecimal.ZERO;

    @ApiModelProperty(value = "服务费-局抽贡献", example = "1500.00")
    private BigDecimal serviceChargeRoundContribution = BigDecimal.ZERO;

    @ApiModelProperty(value = "服务费-手牌贡献", example = "1500.00")
    private BigDecimal serviceChargeHandContribution = BigDecimal.ZERO;

}
