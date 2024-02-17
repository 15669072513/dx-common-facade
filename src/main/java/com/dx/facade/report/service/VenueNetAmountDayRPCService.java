package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.report.ProxyRebateDataReq;
import com.dx.facade.report.param.report.ReportDateCompareDTO;
import com.dx.facade.report.param.report.ReportVenueBetDetailDTO;
import com.dx.facade.report.param.report.ReportVenueNetAmountDayDTO;
import com.dx.facade.report.param.report.venuenetamountday.VenueNameReqDTO;
import com.dx.facade.report.param.report.venuenetamountday.VenueNetAmountDayDetailReqDTO;
import com.dx.facade.report.param.report.venuenetamountday.VenueNetAmountDayReqDTO;
import com.dx.facade.report.req.report.ReportDateCompareParam;
import com.dx.facade.report.req.report.ReportVenueBetDetailParam;
import com.dx.facade.report.req.report.ReportVenueNetAmountDayParam;
import com.dx.facade.report.resp.report.ProxyRebateDataDetailResDTO;
import com.dx.facade.report.resp.report.ProxyRebateDataResDTO;
import com.dx.facade.report.resp.venuenetamountday.*;

import java.util.List;

/**
 * 场馆盈亏
 */
public interface VenueNetAmountDayRPCService {

    /**
     * 场馆名称下拉列表
     *
     * @return
     */
    CommonResp<List<VenueNameRespDTO>> queryVenueNameList(VenueNameReqDTO reqDTO) throws BizException;

    /**
     * 场馆名称下拉列表
     *
     * @return
     */
    CommonResp<List<VenueTypeRespDTO>> queryVenueTypeList() throws BizException;

    /**
     * 场馆盈亏列表和本页合计接口
     *
     * @param requestDto
     * @return
     */
    CommonResp<PageResp<VenueNetAmountDayRespDTO, VenueNetAmountDaySummaryRespDTO>> queryVenueNetAmountDayList(VenueNetAmountDayReqDTO requestDto) throws BizException;

    /**
     * 场馆盈亏全部合计接口
     *
     * @param requestDto
     * @return
     */
    CommonResp<VenueNetAmountDaySummaryRespDTO> queryVenueNetAmountDayTotal(VenueNetAmountDayReqDTO requestDto) throws BizException;

    /**
     * 场馆盈亏详情接口
     *
     * @param requestDto
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<VenueNetAmountDayDetailRespDTO, ?>> queryVenueNetAmountDayDetail(VenueNetAmountDayDetailReqDTO requestDto) throws BizException;


    /**
     * 场馆盈亏列表和本页合计接口
     *
     * @param requestDto
     * @return
     */
    CommonResp<PageResp<NewVenueNetAmountRespDTO, List<VenueNetAmountDayRespDTO>>> newQueryVenueNetAmountDayList(VenueNetAmountDayReqDTO requestDto) throws BizException;

    /**
     * 场馆盈亏全部合计接口
     *
     * @param requestDto
     * @return
     */
    CommonResp<List<VenueNetAmountDayRespDTO>> newQueryVenueNetAmountDayTotal(VenueNetAmountDayReqDTO requestDto) throws BizException;

    /**
     * 首页场馆盈亏,有效投注额
     * @param reqDTO
     * @return
     */
    CommonResp<List<ReportVenueNetAmountDayDTO>> queryVenueNetAmountList(ReportVenueNetAmountDayParam reqDTO);

    CommonResp<PageResp<ReportDateCompareDTO, ReportDateCompareDTO>> dataCompareDayList(ReportDateCompareParam reqDTO);

    CommonResp<ReportDateCompareDTO> dataCompareDaySummary(ReportDateCompareParam reqDTO);

    /**
     * 代理返点数据列表查询
     */
    CommonResp<PageResp<ProxyRebateDataResDTO, ProxyRebateDataResDTO>> queryProxyRebateDataList(ProxyRebateDataReq reqDTO);

    CommonResp<ProxyRebateDataResDTO> queryProxyRebateDataSummary(ProxyRebateDataReq reqDTO);

    CommonResp<ProxyRebateDataDetailResDTO> queryProxyRebateDataDetail(ProxyRebateDataReq reqDTO);

    CommonResp<PageResp<ReportVenueBetDetailDTO, ReportVenueBetDetailDTO>> betDetailList(ReportVenueBetDetailParam reqDTO);

    CommonResp<ReportVenueBetDetailDTO> betDetailSummary(ReportVenueBetDetailParam reqDTO);
}
