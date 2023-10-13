package com.dx.facade.other.service;

import com.dx.entity.CommonResp;
import com.dx.facade.other.dto.MessageReq;
import com.dx.facade.other.dto.WeiwebsReq;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.SignatureException;

public interface WeiwebsMessageRpcService {
    /**
     * 发送消息
     *
     * @param request request
     * @return Response
     */
    CommonResp sentSMS(WeiwebsReq request) throws IOException, URISyntaxException;
}
