package com.dx.facade.report.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.rebate.MemberRebateDReqDTO;
import com.dx.facade.report.param.rebate.ProxyRebateDReqDTO;
import com.dx.facade.report.resp.proxycommission.SumActivityMemberRespDTO;
import com.dx.facade.report.resp.rebate.MemberRebateDRespDTO;
import com.dx.facade.report.resp.rebate.ProxyRebateDRespDTO;
import com.dx.facade.report.resp.rebate.ProxyRebateDSummaryRespDTO;

/**
 * @title 返点报表RPC业务接口
 * @description 流水返点天明细 + 统计
 * @author kygo
 * @version 1.0.0
 * @since 2021年9月25日
 */
public interface MemberRebateDService {



    /**
     * /审核详情天明细/流水返点天明细
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<MemberRebateDRespDTO,?>> getMemberRateDDetailList(PageReq<MemberRebateDReqDTO> reqDTO);

    /**
     * 返点记录天明细统计 / 审核详情天明细统计
     *
     * @param reqDTO
     * @return
     */
    CommonResp<ProxyRebateDSummaryRespDTO> getProxyRateDDetailListTotal(ProxyRebateDReqDTO reqDTO);


    /**
     * 返点审核详情活跃用户分页查询
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<SumActivityMemberRespDTO, ?>> pageSumActivityMember(PageReq<ProxyRebateDReqDTO> reqDTO) throws BizException;


    /**
     * 返点审核详情有效活跃用户分页查询
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<SumActivityMemberRespDTO, ?>> pageSumValidActivityMember(PageReq<ProxyRebateDReqDTO> reqDTO) throws BizException;
}
