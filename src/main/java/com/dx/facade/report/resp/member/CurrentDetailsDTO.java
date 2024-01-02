package com.dx.facade.report.resp.member;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author REBUY
 * @date 2023年12月24日 17:28
 * @description： 本账期返回参数
 */
@Setter
@Getter
@ApiModel("本账期返回参数")
public class CurrentDetailsDTO {
    @ApiModelProperty("账单开始日期")
    private Integer reportStDate;
    @ApiModelProperty(value = "账单结束日期")
    private Integer reportEnDate;
    @ApiModelProperty(value = "全部会员总投注")
    private BigDecimal betAmount;
    @ApiModelProperty(value = "直属会员总投注")
    private BigDecimal directlyMemberBetAmount;
    @ApiModelProperty(value = "全部会员注单量")
    private BigDecimal betCount;
    @ApiModelProperty(value = "直属会员注单量")
    private BigDecimal directlyMemberBetCount;
    @ApiModelProperty(value = "全部会员总返水")
    private BigDecimal memberRebateAmount;
    @ApiModelProperty(value = "直属会员总返水")
    private BigDecimal directlyMemberRebateAmount;
    @ApiModelProperty(value = "全部会员总输赢")
    private BigDecimal netAmount;
    @ApiModelProperty(value = "直属会员总输赢")
    private BigDecimal directlyMemberNetAmount;
    @ApiModelProperty(value = "全部会员总存款")
    private BigDecimal memberDepositAmount;
    @ApiModelProperty(value = "直属会员总存款")
    private BigDecimal directlyMemberDepositAmount;
    @ApiModelProperty(value = "会员总取款")
    private BigDecimal memberWithdrawAmount;
    @ApiModelProperty(value = "直属会员总取款")
    private BigDecimal directlyMemberWithdrawAmount;
    @ApiModelProperty(value = "新注册用户")
    private Long newMemberNum;
    @ApiModelProperty(value = "直属新注册用户")
    private Long directlyNewMemberNum;
    @ApiModelProperty(value = "活跃用户")
    private Long activeMemberNum;
    @ApiModelProperty(value = "直属活跃用户")
    private Long directlyActiveMemberNum;
    @ApiModelProperty("应还账款")
    private BigDecimal returnLoan;
    @ApiModelProperty(value = "本期返点")
    private BigDecimal personRebateAmount;
}
