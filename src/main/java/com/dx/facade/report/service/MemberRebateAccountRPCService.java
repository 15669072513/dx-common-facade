package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.report.req.MemberRebateAccountReqDTO;
import com.dx.facade.report.resp.report.MemberRebateAccountRespDTO;

/**
 * 会员返水对账
 */
public interface MemberRebateAccountRPCService {


    /**
     * 会员返水对账列表
     * @param rebateAccountReqDTO
     * @return
     * @throws Exception
     */
    CommonResp<PageResp<MemberRebateAccountRespDTO, MemberRebateAccountRespDTO>> rebateAccountList(MemberRebateAccountReqDTO rebateAccountReqDTO) throws Exception;

    /**
     * 会员返水对账总计
     * @param rebateAccountReqDTO
     * @return
     * @throws Exception
     */
    CommonResp<MemberRebateAccountRespDTO> rebateAccountSummary(MemberRebateAccountReqDTO rebateAccountReqDTO) throws Exception;



}
