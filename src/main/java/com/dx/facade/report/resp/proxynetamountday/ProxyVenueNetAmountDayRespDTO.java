package com.dx.facade.report.resp.proxynetamountday;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyVenueNetAmountDayRespDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:34:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyVenueNetAmountDayRespDTO {

    /** staticsDate */
    @ApiModelProperty(value = "日期", example = "20210901")
    private Integer staticsDate;

    @ApiModelProperty(value = "总注单笔数", example = "1500.00")
    private Long betCount;
    /** betAmount */
    @ApiModelProperty(value = "总投注金额", example = "1500.00")
    private BigDecimal betAmount;

    /** validBetAmount */
    @ApiModelProperty(value = "总有效投注", example = "1500.00")
    private BigDecimal validBetAmount;


    /** netAmount */
    @ApiModelProperty(value = "会员总输赢", example = "1500.00")
    private BigDecimal netAmount;


    @ApiModelProperty("会员净输赢金额/实际盈亏")
    private BigDecimal memberNetwinAmount;

    @ApiModelProperty("代理发放会员返水")
    private BigDecimal memberRebateAmountByProxy;


    @ApiModelProperty("平台发放会员返水")
    private BigDecimal memberRebateAmountByPlat;


    /** artificialPatchAmount */
    @ApiModelProperty(value = "会员账户调整", example = "1500.00")
    private BigDecimal memberArtificialPatchAmount;

    @ApiModelProperty("直属注单数")
    //@TableField("bet_count")
    private Long directBetCount;

    @ApiModelProperty("直属会员投注额")
    //@TableField("bet_amount")
    private BigDecimal directBetAmount;

    @ApiModelProperty("直属会员有效投注额")
    //@TableField("valid_bet_amount")
    private BigDecimal directValidBetAmount;

    @ApiModelProperty("直属会员总输赢金额")
    //@TableField("net_amount")
    private BigDecimal directNetAmount;

    @ApiModelProperty("直属会员净输赢金额")
    private BigDecimal directMemberNetwinAmount;

    @ApiModelProperty("直属会员代理发放会员返水")
    private BigDecimal directMemberRebateAmountByProxy;


    @ApiModelProperty("直属会员平台发放会员返水")
    private BigDecimal directMemberRebateAmountByPlat;


    @ApiModelProperty("直属会员返水其他调整金额")
    private BigDecimal directMemberArtificialPatchAmount;

    @ApiModelProperty("服务费-手牌")
    private BigDecimal serviceChargeHand;

    @ApiModelProperty("服务费-局抽")
    private BigDecimal serviceChargeRound;

    @ApiModelProperty(value = "服务费贡献")
    private BigDecimal serviceAmount;

    @ApiModelProperty(value = "代理名称")
    private String proxyName;

    @ApiModelProperty(value = "场馆")
    private String venueName;

    @ApiModelProperty(value = "团队返点金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "个人返点金额")
    private BigDecimal personRebateAmount;

    @ApiModelProperty(value = "下级返点金额")
    private BigDecimal childRebateAmount;

    @ApiModelProperty(value = "代理返点其他调整", example = "1500.00")
    private BigDecimal proxyArtificialPatchAmount;
}
