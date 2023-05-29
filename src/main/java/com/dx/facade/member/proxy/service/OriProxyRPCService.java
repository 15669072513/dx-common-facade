package com.dx.facade.member.proxy.service;


import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.proxy.req.OriProxyBalanceReqDTO;
import com.dx.facade.member.proxy.resp.OriProxyBalanceRespDTO;

public interface OriProxyRPCService {

    /**
     * 查询包网代理余额
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<OriProxyBalanceRespDTO> queryOriProxyBalance(OriProxyBalanceReqDTO reqDTO) throws BizException;

}
