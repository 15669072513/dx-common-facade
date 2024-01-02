package com.dx.facade.message.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MessageNoticeExtraDTO {
    @ApiModelProperty(value = "附加类型， 1 未读账单")
    private Integer type = 0;

    @ApiModelProperty(value = "附加消息内容")
    private String msg;

}
