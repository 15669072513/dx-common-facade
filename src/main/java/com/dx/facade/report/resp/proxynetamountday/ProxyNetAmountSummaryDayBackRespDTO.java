package com.dx.facade.report.resp.proxynetamountday;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;

import java.math.BigDecimal;

/**
 * ProxyNetAmountMonthSummaryBackRespDTO
 * 中控后台-代理盈亏日-合计/小计
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:35:48
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyNetAmountSummaryDayBackRespDTO {

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


    @ApiModelProperty("会员净输赢金额")
    private BigDecimal memberNetwinAmount;
    @ApiModelProperty("会员返水金额")
    private BigDecimal memberRebateAmount;


    @ApiModelProperty("代理发放会员返水")
    private BigDecimal memberRebateAmountByProxy;


    @ApiModelProperty("平台发放会员返水")
    private BigDecimal memberRebateAmountByPlat;

    @ApiModelProperty("会员其他调整金额")
    private BigDecimal memberArtificialPatchAmount;


    @ApiModelProperty("直属投注人数")
    //@TableField("direct_member_count")
    private Long directMemberCount;

    @ApiModelProperty("直属注单数")
    //@TableField("direct_bet_count")
    private Long directBetCount;

    @ApiModelProperty("直属投注额")
    //@TableField("direct_bet_amount")
    private BigDecimal directBetAmount;

    @ApiModelProperty("直属有效投注额")
    //@TableField("direct_valid_bet_amount")
    private BigDecimal directValidBetAmount;

    @ApiModelProperty("直属输赢金额")
    //@TableField("direct_net_amount")
    private BigDecimal directNetAmount;


    @ApiModelProperty("直属返水金额=会员返水")
    //@TableField("direct_rebate_amount")
    private BigDecimal directRebateAmount;

    @ApiModelProperty("直属会员代理发放会员返水")
    private BigDecimal directMemberRebateAmountByProxy;


    @ApiModelProperty("直属会员平台发放会员返水")
    private BigDecimal directMemberRebateAmountByPlat;


    @ApiModelProperty("直属其他调整=人工加减额中的其他调整额")
    //@TableField("direct_artificial_patch_amount")
    private BigDecimal directArtificialPatchAmount;

    @ApiModelProperty("直属会员净输赢")
    private BigDecimal directNetwinAmount;

    @ApiModelProperty("服务费-局抽")
    private BigDecimal serviceChargeRound;
}
