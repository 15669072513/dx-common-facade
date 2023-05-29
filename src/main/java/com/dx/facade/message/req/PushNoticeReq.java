package com.dx.facade.message.req;

import lombok.Data;

import java.util.List;

@Data
public class PushNoticeReq {


    private long userId;
    private long merchantId;
    private long messageId;

}
