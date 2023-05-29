package com.dx.facade.message.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UnReceivedBonusAndTime {
    @ApiModelProperty(value = "是否有未领取的红利(0否,1是)")
    private int hasReceivedAmount;

    @ApiModelProperty(value = "最新一条未领取的红利的时间戳(如果没有未领取的红利,则此字段无效)")
    private Long timestamp = null;
}
