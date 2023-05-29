package com.dx.facade.message.req;

import lombok.Data;

import java.util.List;

@Data
public class AppDeleteNoticeReq {


    private Long userId;

    private Long merchantId;

    private List<Long> messageIds;//detail 表的id

}
