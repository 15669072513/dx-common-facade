package com.dx.facade.other.service;

import com.dx.entity.CommonResp;
import com.dx.facade.other.dto.SMSReq;

import java.io.IOException;
import java.net.URISyntaxException;

public interface SMSMessageRpcService {
    /**
     * 发送消息
     * @param smsReq
     * @return Response
     */
    CommonResp sentSMS(SMSReq smsReq);
}
