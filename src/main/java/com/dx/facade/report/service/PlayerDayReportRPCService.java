package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.report.PlayerDayReportDetailReqDTO;
import com.dx.facade.report.param.report.PlayerDayReportReqDTO;
import com.dx.facade.report.resp.report.PlayerDayReportDetailDTO;
import com.dx.facade.report.resp.report.PlayerDayReportResp;
import com.dx.facade.report.resp.report.PlayerDayReportSummaryDTO;


public interface PlayerDayReportRPCService {


    /**
     * 会员报表列表接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<PlayerDayReportResp, PlayerDayReportSummaryDTO>> listPage(PlayerDayReportReqDTO reqDTO) throws BizException;

    /**
     * 会员报表-合计接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PlayerDayReportSummaryDTO> summary(PlayerDayReportReqDTO reqDTO) throws BizException;

    /**
     * 会员报表详情接口
     *
     * @param requestDto
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<PlayerDayReportDetailDTO, PlayerDayReportDetailDTO>> detailListPage(PlayerDayReportDetailReqDTO requestDto) throws BizException;
}
