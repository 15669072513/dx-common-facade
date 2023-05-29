package com.dx.facade.message.req;

import com.dx.facade.common.PageRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AppGetMessageNoticeReq extends PageRequest {


    private Long userId;

    private Long merchantId;

    private int noticeType;

    private Integer deviceType;

    @ApiModelProperty("消息类别:0会员消息,1代理消息")
    private Integer noticeCategory;

}
