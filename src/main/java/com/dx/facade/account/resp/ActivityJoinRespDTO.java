package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


@Data
public class ActivityJoinRespDTO {
	
	@ApiModelProperty(value = "用户ID",hidden = true)
	private Long userId;
	
	@ApiModelProperty(value = "商户ID",hidden = true)
	private Long merchantId;
    
    @ApiModelProperty(value = "申请设备号")
    @NotNull(message = "申请设备号不能为空")
    private String deviceNo;

    @ApiModelProperty(value = "访问终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）")
    @NotNull(message = "申请设备号不能为空")
    private Integer deviceType;
    
    @ApiModelProperty(value = "活动id")
    @NotNull(message = "活动id不能为空")
    private Long activityId;
}
