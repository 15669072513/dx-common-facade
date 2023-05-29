package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.membervipchangerecord.MemberVipChangeRecordReqDTO;
import com.dx.facade.report.resp.membervipchangerecord.MemberVipChangeRecordRespDTO;

public interface MemberVipChangeRecordService {
    
    
    /**
     * VIP变更记录分页查询
     * @param dtoPageReq
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<MemberVipChangeRecordRespDTO, ?>> queryMemberVipChangeRecordPage(PageReq<MemberVipChangeRecordReqDTO> dtoPageReq) throws BizException;

}
