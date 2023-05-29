package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 修改好友邀请-返利明细-修改返利状态
 * @author agan
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityInviteBetDetailsStatusDTO {

    @ApiModelProperty(value = "返利订单号")
    private String eventId;

    @ApiModelProperty(value = "返利状态(1=未结算, 2=审核中, 3=待领取, 4=已领取, 5=已拒绝, 6=已过期), 枚举:ActivityInviteDetailsType")
    private Integer rebateType;

    @ApiModelProperty(value = "1-邀请任务 ", required = true, example = "1")
    private Integer provideType;

    @ApiModelProperty(value = "领取或者拒绝时间")
    private LocalDateTime inviteRewardAt;
}
