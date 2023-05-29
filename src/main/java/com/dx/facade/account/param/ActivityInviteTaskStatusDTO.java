package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 修改好友邀请-批量修改对象
 * @author mading
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityInviteTaskStatusDTO {

    @ApiModelProperty(value = "类型(1=邀请人, 2=被邀请人), 枚举:ActivityEnums.ActivityInviteStatusType")
    private Integer type;

    @ApiModelProperty(value = "返利订单号")
    private String eventId;

    @ApiModelProperty(value = "状态 1.未达标 2.已失效 3.审核中 4.已拒绝 5.待领取 6.已领取 7.已过期, 枚举:ActivityEnums.ActivityInviteesRewardStatus")
    private Integer status;

    @ApiModelProperty(value = "派奖时间")
    private LocalDateTime time;

}
