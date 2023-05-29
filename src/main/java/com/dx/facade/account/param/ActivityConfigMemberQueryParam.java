package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author agan
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityConfigMemberQueryParam {

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "活动类型 1-纯展示页活动 2-首存活动 3-好友邀请活动")
    private Integer activityType;

    @ApiModelProperty(value = "活动ID")
    private Long activityId;

    @ApiModelProperty(value = "用户ID/代理ID")
    private Long userId;
}
