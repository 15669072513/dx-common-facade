package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.proxy.dto.ProxyPathUseDTO;
import com.dx.facade.report.param.agent.AgentRebateReqDTO;
import com.dx.facade.report.param.agent.AgentRebateRespDTO;

/**
 * 代理系统-代理返点
 *
 * @author kygo
 * @version 1.0.0
 * @since 2022.04.22
 */
public interface AgentProxyRebateService {

    /**
     * @title 按照代理返点查询
     * @author kygo
     * @since 2022.04.22
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<AgentRebateRespDTO, ?>> queryProxyRebateList(PageReq<AgentRebateReqDTO> reqDTO) throws BizException;


    /**
     * @title 按照代理 直属代理返点查询
     * @author kygo
     * @since 2022.04.22
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<AgentRebateRespDTO, ProxyPathUseDTO>> queryDirectsRebateList(PageReq<AgentRebateReqDTO> reqDTO) throws BizException;
}
