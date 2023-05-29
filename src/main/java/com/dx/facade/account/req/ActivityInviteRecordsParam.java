package com.dx.facade.account.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="ActivityInviteRecordsParam对象", description="好友邀请-活动记录入参")
public class ActivityInviteRecordsParam {

    @ApiModelProperty("邀请记录状态 1.未达标 2.已失效 3.审核中 4.已拒绝(已取消) 5.待领取 6.已领取 7.已过期 ; 返利记录状态 1.未达标 2.进行中 3.已过期")
    private Integer status;
}
