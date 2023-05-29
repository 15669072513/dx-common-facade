package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MemberRebateBusinessIdReqDTO {

    /**
     * 事件id
     */
    @ApiModelProperty(value = "事件id")
    private String businessId;

    @ApiModelProperty(value = "领取状态（0待领取/1-已领取/2-已过期）")
    private Integer provideStatus;

}
