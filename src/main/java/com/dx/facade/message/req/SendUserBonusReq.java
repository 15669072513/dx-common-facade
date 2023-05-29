package com.dx.facade.message.req;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SendUserBonusReq {

    private long userId;
    private long merchantId;
    private BigDecimal bonusAmount;
    private BigDecimal billAmount;
    private String businessId;

    @ApiModelProperty("红利类型[ 1、升级礼金，2、生日礼金，3、上半月红包，4、下半月红包，5、会员返水，6、充值送活动]")
    private int bonusType;
    private String remark;

    @ApiModelProperty(value = "邀请用户ID")
    private Long inviteUserId;

    @ApiModelProperty(value = "邀请用户 用户名")
    private String inviteUserName;

}
