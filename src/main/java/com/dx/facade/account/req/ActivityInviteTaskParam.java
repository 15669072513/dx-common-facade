package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 邀请活动 add对象
 * @author mading
 * @date 2022-03-22
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityInviteTaskParam {

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("应用终端 1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty("邀请人ID")
    private Long inviteUserId;

    @ApiModelProperty("邀请人账号")
    private String inviteUserName;

    @ApiModelProperty("被邀请人ID")
    private Long inviteesUserId;

    @ApiModelProperty("被邀请人账号")
    private String inviteesUserName;

    @ApiModelProperty("注册时间")
    private LocalDateTime registerAt;

    @ApiModelProperty("注册IP")
    private String registerIp;

    @ApiModelProperty("注册设备号")
    private String registerDeviceNo;

}
