package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @date 2022-04-11
 */
@Data
public class ActivityInviteTaskSummaryDTO {

    @ApiModelProperty(value = "小计首存金额")
    private BigDecimal firstDepositAmount;

    @ApiModelProperty(value = "总计首存金额")
    private BigDecimal totalFirstDepositAmount;

//    @ApiModelProperty(value = "小计累计存款金额")
//    private BigDecimal depositAmount;
//
//    @ApiModelProperty(value = "总计累计存款金额")
//    private BigDecimal totalDepositAmount;

    @ApiModelProperty("邀请人奖励礼金")
    private BigDecimal inviteRewardAmount;

    @ApiModelProperty("总邀请人奖励礼金")
    private BigDecimal totalInviteRewardAmount;

    @ApiModelProperty(value = "被邀请人奖励")
    private BigDecimal inviteesRewardAmount;

    @ApiModelProperty(value = "总计被邀请人奖励")
    private BigDecimal totalInviteesRewardAmount;



}
