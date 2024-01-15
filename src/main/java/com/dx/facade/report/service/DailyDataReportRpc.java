package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.facade.report.param.report.DxReportDFinancialDTO;
import com.dx.facade.report.param.report.DxReportDReqDTO;
import com.dx.facade.report.resp.report.DxDFinancialDataDTO;
import com.dx.facade.report.resp.report.DxReportDResp;

import java.util.List;

/**
 *  德信日报
 */
public interface DailyDataReportRpc {
    CommonResp<List<DxReportDResp>> dxReportD(DxReportDReqDTO dxReportDReqDTO);
    CommonResp<DxReportDResp> dxReportDSummary(DxReportDReqDTO dxReportDReqDTO);
    CommonResp<List<DxDFinancialDataDTO>> getFinancialData( DxReportDFinancialDTO dxReportDFinancialDTO);
}
