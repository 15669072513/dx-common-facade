package com.dx.facade.message.req;

import lombok.Data;

@Data
public class SendNoticeToUserReq {

    private long userId;
    private long merchantId;
    private long messageId;

}
