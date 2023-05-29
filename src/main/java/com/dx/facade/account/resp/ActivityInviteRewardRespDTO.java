package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 组装邀请奖励数据
 * @author agan
 */
@Data
public class ActivityInviteRewardRespDTO {

    @ApiModelProperty("邀请人发放金额")
    private BigDecimal inviteUserProvideAmount;

    @ApiModelProperty("邀请人 流水金额 邀请礼金 * 流水（倍）")
    private BigDecimal inviteUserBillAmount;

    @ApiModelProperty("邀请人 流水倍数")
    private Integer inviteBillMultiple;

    @ApiModelProperty("被邀请人发放金额")
    private BigDecimal inviteesUserUserProvideAmount;

    @ApiModelProperty("被邀请人 流水金额 邀请礼金 * 流水（倍）")
    private BigDecimal inviteesUserBillAmount;

    @ApiModelProperty("被邀请人 流水倍数")
    private Integer inviteesBillMultiple;

}
