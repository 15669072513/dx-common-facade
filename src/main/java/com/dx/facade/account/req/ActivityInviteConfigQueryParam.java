package com.dx.facade.account.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel(value="ActivityInviteConfigQueryParam对象", description="好友邀请活动查询入参")
public class ActivityInviteConfigQueryParam {

    @ApiModelProperty("商户id")
    @NotNull(message = "商户id不能为空")
    private Long merchantId;

}
