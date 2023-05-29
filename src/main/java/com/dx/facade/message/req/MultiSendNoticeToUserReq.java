package com.dx.facade.message.req;

import lombok.Data;

import java.util.List;

@Data
public class MultiSendNoticeToUserReq {

    private List<Long> userIds;
    private long merchantId;
    private long messageId;

}
