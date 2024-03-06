package com.dx.facade.report.resp.proxyoverview;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author jackpot
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "ProxyOverviewMainDataRespDTO", description = "代理账单主显示")
public class ProxyOverviewMainDataRespDTO {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "本期账单开始日期")
    private Integer cycleStatrtDate;

    @ApiModelProperty(value = "本期账单结束日期")
    private Integer cycleEndDate;

    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    @ApiModelProperty(value = "全部-会员总投注")
    private BigDecimal betAmount;

    @ApiModelProperty(value = "直属-会员总投注")
    private BigDecimal directlyMemberBetAmount;

    @ApiModelProperty(value = "全部-投注单量")
    private BigDecimal betCount;

    @ApiModelProperty(value = "直属-投注单量")
    private BigDecimal directlyMemberBetCount;

    @ApiModelProperty(value = "全部-会员总返水")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "直属-会员总返水")
    private BigDecimal directlyMemberRebateAmount;

    @ApiModelProperty(value = "全部-会员游戏盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty(value = "直属-会员游戏盈亏")
    private BigDecimal directlyMemberNetAmount;

    @ApiModelProperty(value = "全部-会员总存款")
    private BigDecimal depositAmount;

    @ApiModelProperty(value = "直属-会员总存款")
    private BigDecimal directlyMemberDepositAmount;

    @ApiModelProperty(value = "全部-会员总取款")
    private BigDecimal withdrawAmount;

    @ApiModelProperty(value = "直属-会员总取款")
    private BigDecimal directlyMemberWithdrawAmount;

    @ApiModelProperty(value = "全部-新注册会员")
    private BigDecimal newMemberNum;

    @ApiModelProperty(value = "直属-新注册会员")
    private BigDecimal directlyNewMemberNum;

    @ApiModelProperty(value = "全部-活跃会员")
    private BigDecimal activeMemberNum;

    @ApiModelProperty(value = "直属-活跃会员")
    private BigDecimal directlyActiveMemberNum;

    @ApiModelProperty(value = "数据加工时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "数据修改时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value= "代理人数")
    private int proxyNum;

    @ApiModelProperty(value = "会员人数")
    private int memberNum;

    @ApiModelProperty(value = "非活跃会员")
    private int noActiveMemberNum;

    @ApiModelProperty(value = "本期返点")
    private BigDecimal personRebateAmount;

    @ApiModelProperty(value = "应还账款")
    private BigDecimal returnLoan;

    @ApiModelProperty(value = "可提现额")
    private BigDecimal withdrawable;

    @ApiModelProperty(value = "下级本期返点")
    private BigDecimal underRebateAmount;

    @ApiModelProperty(value = "下级应还账款")
    private BigDecimal underReturnLoan;

    @ApiModelProperty(value = "下级可提现额")
    private BigDecimal underWithdrawable;

    @ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
    private Integer businessModel;

    @ApiModelProperty(value = "今日实时收益")
    private BigDecimal realTimeRevenue = BigDecimal.ZERO;

    @ApiModelProperty(value = "本账期收益")
    private BigDecimal incomeAmount;
}
