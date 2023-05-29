package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.MemberVenueTypeNetReqDTO;
import com.dx.facade.member.resp.MemberVenueTypeNetRespDTO;
import com.dx.facade.member.resp.MemberVenueTypeNetSumRespDTO;

public interface MemberVenueTypeNetDRPCService {
    /**
     * 会员场馆类型盈亏统计天分页数据
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<MemberVenueTypeNetRespDTO,?>> queryMemberVenueTypeNetList(PageReq<MemberVenueTypeNetReqDTO> reqDTO) throws BizException;


    CommonResp<MemberVenueTypeNetSumRespDTO> queryMemberVenueTypeNetTotal(MemberVenueTypeNetReqDTO reqDTO) throws BizException;
}
