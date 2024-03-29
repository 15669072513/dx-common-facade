package com.dx.facade.report.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.rebate.DwdBetMemberRecordDReq;
import com.dx.facade.report.param.rebate.DwmMemBerRebateDReq;
import com.dx.facade.report.resp.DwdBetMemberRecordDDTO;
import com.dx.facade.report.resp.DwmMemBerRebateDDTO;

public interface DwmMemBerRebateDRPCService {

    /**
     * 会员反水列表分页
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<DwmMemBerRebateDDTO, ?>> queryMemberRebateList(DwmMemBerRebateDReq reqDTO) throws BizException;

    CommonResp<PageResp<DwdBetMemberRecordDDTO, ?>> queryMemberRebateDetailList(DwdBetMemberRecordDReq reqDTO) throws BizException;

    CommonResp<DwdBetMemberRecordDDTO> queryMemberRebateDetailSummary(DwdBetMemberRecordDReq reqDTO) throws BizException;


}
