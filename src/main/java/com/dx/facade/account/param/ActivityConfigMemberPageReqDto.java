package com.dx.facade.account.param;

import com.dx.facade.common.PageRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author timas
 */
@Data
public class ActivityConfigMemberPageReqDto extends PageRequest {

    @ApiModelProperty(value = "活动ID")
    private Long activityId;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "活动类型 1-纯展示页活动 2-首存活动 3-好友邀请活动")
    private Integer activityType;


}
