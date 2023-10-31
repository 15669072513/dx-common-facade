package com.dx.facade.account.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel(value="ActivityInviteConfigParam对象", description="好友邀请-活动配置入参")
public class ActivityInviteNotificationParam {

    @ApiModelProperty("消息类型 1.邀请任务红利中心 2.邀请任务现金钱包 3.投注任务红利中心 4.投注任务现金钱包")
    @NotNull(message = "消息类型不能为空")
    private Integer type;
}
