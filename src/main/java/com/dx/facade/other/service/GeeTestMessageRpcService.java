package com.dx.facade.other.service;

import com.dx.entity.CommonResp;
import com.dx.facade.other.dto.MessageReq;

import java.io.IOException;
import java.security.SignatureException;

public interface GeeTestMessageRpcService {
    /**
     * 发送消息
     *
     * @param request request
     * @return Response
     */
    CommonResp sentSMS(MessageReq request) throws IOException, SignatureException;
}
