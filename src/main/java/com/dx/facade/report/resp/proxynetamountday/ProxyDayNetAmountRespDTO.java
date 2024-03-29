package com.dx.facade.report.resp.proxynetamountday;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
    @ApiModelProperty("日期，比如20210531")
    private Integer staticsDate;
    /**
     * proxyName
     */
    @ApiModelProperty(value = "代理账号", example = "daxia2222")
    private String proxyName;

    @ApiModelProperty("代理层级路径（代理账号）")
    //@TableField("proxy_path_username")
    private String proxyPathUsername;
    /**
     * betAmount
     */
    @ApiModelProperty(value = "总投注", example = "1500.00")
    private BigDecimal betAmount=BigDecimal.ZERO;

    /**
     * validBetAmount
     */
    @ApiModelProperty(value = "有效投注", example = "1500.00")
    private BigDecimal validBetAmount=BigDecimal.ZERO;
    @ApiModelProperty(value = "注单笔数", example = "1500.00")
    private Long betCount=0L;
    /**
     * netAmount
     */
    @ApiModelProperty(value = "游戏盈亏", example = "1500.00")
    private BigDecimal netAmount=BigDecimal.ZERO;

    @ApiModelProperty("会员净输赢金额")
    private BigDecimal memberNetwinAmount=BigDecimal.ZERO;
    @ApiModelProperty("会员返水金额")
    private BigDecimal memberRebateAmount=BigDecimal.ZERO;

    @ApiModelProperty("代理发放会员返水")
    private BigDecimal memberRebateAmountByProxy=BigDecimal.ZERO;


    @ApiModelProperty("平台发放会员返水")
    private BigDecimal memberRebateAmountByPlat=BigDecimal.ZERO;
    @ApiModelProperty("会员其他调整金额")
    private BigDecimal memberArtificialPatchAmount=BigDecimal.ZERO;

    /**
     * rebateAmount
     */
    @ApiModelProperty(value = "代理返点", example = "1500.00")
    private BigDecimal proxyRebatePoint=BigDecimal.ZERO;


    /**
     * proxyNet
     */
    @ApiModelProperty(value = "场馆费", example = "1500.00")
    private BigDecimal venueFee=BigDecimal.ZERO;


    /**
     * lastMonthBalance
     */
    @ApiModelProperty(value = "上月结余", example = "1500.00")
    private BigDecimal lastMonthBalance=BigDecimal.ZERO;


    @ApiModelProperty("是否存在下级")
    private Boolean isAllSub;


    @ApiModelProperty("直属投注人数")
    //@TableField("direct_member_count")
    private Long directMemberCount;

    @ApiModelProperty("直属注单数")
    //@TableField("direct_bet_count")
    private Long directBetCount=0L;

    @ApiModelProperty("直属投注额")
    //@TableField("direct_bet_amount")
    private BigDecimal directBetAmount=BigDecimal.ZERO;

    @ApiModelProperty("直属有效投注额")
    //@TableField("direct_valid_bet_amount")
    private BigDecimal directValidBetAmount=BigDecimal.ZERO;

    @ApiModelProperty("直属输赢金额")
    //@TableField("direct_net_amount")
    private BigDecimal directNetAmount=BigDecimal.ZERO;


    @ApiModelProperty("直属返水金额=会员返水")
    //@TableField("direct_rebate_amount")
    private BigDecimal directRebateAmount=BigDecimal.ZERO;

    @ApiModelProperty("代理发放直属会员返水")
    private BigDecimal directMemberRebateAmountByProxy=BigDecimal.ZERO;


    @ApiModelProperty("平台发放直属会员返水")
    private BigDecimal directMemberRebateAmountByPlat=BigDecimal.ZERO;
    @ApiModelProperty("直属其他调整=人工加减额中的其他调整额")
    //@TableField("direct_artificial_patch_amount")
    private BigDecimal directArtificialPatchAmount=BigDecimal.ZERO;

    @ApiModelProperty("直属会员净输赢")
    private BigDecimal directNetwinAmount=BigDecimal.ZERO;
}
