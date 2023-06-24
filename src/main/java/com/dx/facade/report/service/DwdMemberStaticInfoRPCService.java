package com.dx.facade.report.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.report.PlayerDayReportReqDTO;
import com.dx.facade.report.resp.report.DwdMemberStaticInfoResp;
import com.dx.facade.report.resp.report.DwdMemberStaticInfoSummaryResp;

public interface DwdMemberStaticInfoRPCService {

    /**
     * 会员报表列表接口-全量
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<DwdMemberStaticInfoResp, DwdMemberStaticInfoSummaryResp>> listPage(PlayerDayReportReqDTO reqDTO) throws BizException;

    /**
     * 会员报表-合计接口-全量
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<DwdMemberStaticInfoSummaryResp> summary(PlayerDayReportReqDTO reqDTO) throws BizException;

}
