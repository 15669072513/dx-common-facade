package com.dx.facade.message.req;

import lombok.Data;

import java.util.List;

@Data
public class AppReadAnnouncementReq {


    private Long userId;

    private Long merchantId;

    private List<Long> messageIds;

}
