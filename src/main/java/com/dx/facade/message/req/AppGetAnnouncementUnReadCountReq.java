package com.dx.facade.message.req;

import com.dx.facade.common.PageRequest;

import lombok.Data;

@Data
public class AppGetAnnouncementUnReadCountReq extends PageRequest {


    private Long userId;

    private Long merchantId;

    private Integer deviceType;

}
