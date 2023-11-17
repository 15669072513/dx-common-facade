package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.facade.member.rep.QrCodeGenReqDTO;
import com.dx.facade.member.rep.QrCodeParseReqDTO;
import com.dx.facade.member.resp.QrCodeGenRespDTO;
import com.dx.facade.member.resp.QrCodeParseRespDTO;

/**
 * 二维码服务
 */
public interface QrCodeRPCService {

    /**
     * 生成用户二维码
     * @param req userId
     * @return url
     */
    CommonResp<QrCodeGenRespDTO> genQrCode(QrCodeGenReqDTO req);

    /**
     * 解析短码
     * @param req sc:8位短码
     * @return token
     */
    CommonResp<QrCodeParseRespDTO> parseQr(QrCodeParseReqDTO req);
}
