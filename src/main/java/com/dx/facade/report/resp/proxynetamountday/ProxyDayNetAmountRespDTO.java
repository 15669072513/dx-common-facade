package com.dx.facade.report.resp.proxynetamountday;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


/**
 * ProxyDayNetAmountRespDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2022年4月12日 下午8:21:18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyDayNetAmountRespDTO {

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
    @Deprecated
    /** rebateAmount */
    @ApiModelProperty(value = "会员返水", example = "1500.00")
    private BigDecimal rebateAmount;
    @ApiModelProperty(value = "会员返水", example = "1500.00")
    private BigDecimal memberRebateAmount;
    /**
     * rebateAmount
     */
    @ApiModelProperty(value = "代理返水", example = "1500.00")
    private BigDecimal proxyRebateAmount;

    /**
     * discountAmount
     */
    @ApiModelProperty(value = "会员优惠", example = "1500.00")
    private BigDecimal discountAmount;
    @Deprecated
    /**
     * artificialPatchAmount
     */
    @ApiModelProperty(value = "会员账户调整", example = "1500.00")
    private BigDecimal artificialPatchAmount;


    @ApiModelProperty(value = "会员账户调整", example = "1500.00")
    private BigDecimal memberArtificialPatchAmount;

    @ApiModelProperty(value = "流水纠正", example = "150.00")
    private BigDecimal flowCorrection;

    @ApiModelProperty(value = "会员净盈亏", example = "150.00")
    private BigDecimal memberNetWinAmount;

    /**
     * proxyNet
     */
    @ApiModelProperty(value = "场馆费", example = "1500.00")
    private BigDecimal venueFee;

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

    @ApiModelProperty("是否存在下级")
    private Boolean isAllSub;

    @ApiModelProperty("会员总盈亏")
    private BigDecimal totalNetAmount;


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

    @ApiModelProperty("直属其他调整=人工加减额中的其他调整额")
    //@TableField("direct_artificial_patch_amount")
    private BigDecimal directArtificialPatchAmount;

    @ApiModelProperty("直属会员净输赢")
    private BigDecimal directProfitAmount;
}
