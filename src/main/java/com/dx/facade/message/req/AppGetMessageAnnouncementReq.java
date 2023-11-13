package com.dx.facade.message.req;

import com.dx.facade.common.PageRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AppGetMessageAnnouncementReq extends PageRequest {


    private Long userId;

    private Long merchantId;

    private Integer deviceType;

    private Integer pc = 0 ;
}
