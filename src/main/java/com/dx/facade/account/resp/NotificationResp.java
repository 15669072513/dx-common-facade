package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: AC
 * @Description: TODO
 * @Date: 2023/04/12 12:40
 */
@Data
public class NotificationResp {

    @ApiModelProperty(value = "未读消息数量")
    private Integer number;

    @ApiModelProperty(value = "红利发送位置: 1-中心钱包 2-红利中心")
    private Integer rewardSendPosition;

}
