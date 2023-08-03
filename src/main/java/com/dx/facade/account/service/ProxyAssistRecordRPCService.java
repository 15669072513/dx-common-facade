package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.req.*;
import com.dx.facade.account.resp.CountDto;
import com.dx.facade.account.resp.ProxyAssistRecordRespDTO;
import com.dx.facade.account.resp.ProxyTransferRecordRpcPageRespDTO;

public interface ProxyAssistRecordRPCService {

    /**
     * 代理转账
     * @return
     * @throws BizException
     */
    Boolean saveProxyTransferProxyOrder(ProxyTransferReqDTO reqDTO) throws BizException;


    /**
     * 官方给代理上分
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp saveOfficerProxyUpScoreOrder(ProxyTransferReqDTO reqDTO) throws BizException;

    /**
     * 代理给会员上分
     * @param dto
     * @return
     * @throws BizException
     */
    CommonResp saveProxyAssitMemberUpScore(MemberUpDownScoreDto dto) throws BizException;

    /**
     * 代理给代理上分
     * @param reqDTO
     * @return
     * @throws BizException
     */
    Boolean saveProxyAssitProxyUpScore(ProxyTransferReqDTO reqDTO) throws BizException;

    /**
     *  代理给会员下分
     * @param dto
     * @return
     * @throws BizException
     */
    CommonResp saveProxyAssitMemberDownScoreOrder(MemberUpDownScoreDto dto) throws BizException;

    /**
     * 代理给代理下分
     * @param proxyAssistDownScoreDto
     * @return
     * @throws BizException
     */
    CommonResp saveProxyAssitProxyDownScoreOrder(ProxyTransferReqDTO proxyAssistDownScoreDto) throws BizException;

    /**
     * 官方给代理下分
     * @param proxyAssistDownScoreDto
     * @return
     * @throws BizException
     */
    CommonResp saveOfficialProxyDownScoreOrder(ProxyTransferReqDTO proxyAssistDownScoreDto) throws BizException;

    /**
     * 代理Web 版本查询的转账记录查询,需要查询全部
     * @param pageReq
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ProxyTransferRecordRpcPageRespDTO, CountDto>>  selectWebProxyTransferRecordRpcPage(PageReq<ProxyTransferRecordRpcPageReqDTO> pageReq) throws BizException;


    /**
     * 会员代存记录查询
     * @param param
     * @return
     * @throws BizException
     */
    PageResp<ProxyAssistRecordRespDTO,?> getProxyAssistRecordList(ProxyAssistDepositRecordParam param) throws BizException;


    CommonResp<PageResp<ProxyTransferRecordRpcPageRespDTO, CountDto>> selectProxyTransferRecordRpcPage(PageReq<ProxyTransferRecordRpcPageReqDTO> pageReq) throws BizException;
}
