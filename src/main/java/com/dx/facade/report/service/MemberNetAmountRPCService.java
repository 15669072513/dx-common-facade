package com.dx.facade.report.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.MemberNetAmountDetailReqDTO;
import com.dx.facade.member.param.MemberNetAmountReqDTO;
import com.dx.facade.member.param.MemberVenueNetAmountReqDTO;
import com.dx.facade.report.param.member.ProxyMemberNetListReqDTO;
import com.dx.facade.report.param.member.ProxyMemberNetVenueListReqDTO;
import com.dx.facade.report.resp.member.*;

import java.util.List;

public interface MemberNetAmountRPCService {

    /**
     * 会员盈亏列表和本页合计接口
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<MemberNetAmountRespDTO, MemberNetAmountSummaryRespDTO>> queryMemberNetAmountList(MemberNetAmountReqDTO reqDTO) throws BizException;

    /**
     * 会员盈亏列表和本页合计接口
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<List<MemberNetAmountRespDTO>> exportList(MemberNetAmountReqDTO reqDTO) throws BizException;

    /**
     * 会员盈亏全部合计接口
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<MemberNetAmountSummaryRespDTO> queryMemberNetAmountTotal(MemberNetAmountReqDTO reqDTO) throws BizException;

    /**
     * 会员盈亏详情接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<MemberNetAmountDetailRespDTO, MemberNetAmountDetailSummaryRespDTO>> queryMemberNetAmountDetail(MemberNetAmountDetailReqDTO reqDTO) throws BizException;

    /**
     * 代理web 会员盈亏
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<ProxyMemberNetRespDTO, ProxyMemberNetSummaryRespDTO>> queryProxyMemberNetList(PageReq<ProxyMemberNetListReqDTO> reqDTO);

    /**
     * 代理web 会员盈亏-场馆明细
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<ProxyMemberNetVenueRespDTO, ProxyMemberNetVenueSummaryRespDTO>> queryProxyMemberNetVenueList(PageReq<ProxyMemberNetVenueListReqDTO> reqDTO);

    /**
     * 会员场馆盈亏明细
     *
     * @param memberNetAmountReqDTO
     * @return
     */
    CommonResp<PageResp<MemberVenueReqDTO, MemberVenueSummaryRespDTO>> queryVenueDetails(MemberNetAmountReqDTO memberNetAmountReqDTO);

    /**
     * 会员场馆盈亏总计
     * @param memberNetAmountReqDTO
     * @return
     */
    CommonResp<MemberVenueSummaryRespDTO> queryVenueSumamry(MemberNetAmountReqDTO memberNetAmountReqDTO);

    /**
     * 会员场馆盈亏明细
     *
     * @param memberVenueNetAmountReqDTO
     * @return
     */
    CommonResp<MemberVenueDetailRespDTO> queryMemberVenueDetail(MemberVenueNetAmountReqDTO memberVenueNetAmountReqDTO);

    /**
     * 会员场馆盈亏总计
     * @param memberVenueNetAmountReqDTO
     * @return
     */
    CommonResp<MemberVenueSummaryRespDTO> queryMemberVenueSummary(MemberVenueNetAmountReqDTO memberVenueNetAmountReqDTO);
}
