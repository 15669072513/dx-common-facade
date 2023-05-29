package com.dx.facade.message.req;

import com.dx.facade.common.PageRequest;

import lombok.Data;

@Data
public class RetractNoticeReq {

    private int noticeType;

    private long messageId;


}
