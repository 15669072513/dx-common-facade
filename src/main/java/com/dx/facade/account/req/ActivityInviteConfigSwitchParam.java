package com.dx.facade.account.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel(value="ActivityInviteConfigSwitchParam对象", description="好友邀请活动开关入参")
public class ActivityInviteConfigSwitchParam {

    @ApiModelProperty("好友邀请活动id")
    @NotNull(message = "好友邀请活动id不能为空")
    private Long activityId;

    @ApiModelProperty("商户id")
    @NotNull(message = "商户id不能为空")
    private Long merchantId;

    @ApiModelProperty("主活动状态: 0-关闭 1-开启")
    @NotNull(message = "主活动状态不能为空")
    private Integer status;

}
