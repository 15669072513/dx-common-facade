package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.report.accessamountday.AccessAmountDayReqDTO;
import com.dx.facade.report.resp.accessamountday.AccessAmountDayRespDTO;
import com.dx.facade.report.resp.accessamountday.AccessAmountDaySummaryRespDTO;

public interface AccessAmountDayRPCService {



    /**
     * 存取报表列表和本页合计接口
     *
     * @param requestDto
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<AccessAmountDayRespDTO, AccessAmountDaySummaryRespDTO>> queryAccessAmountDayList(PageReq<AccessAmountDayReqDTO> requestDto) throws BizException;

    /**
     * 存取报表全部合计接口
     *
     * @param requestDto
     * @return
     * @throws BizException
     */
    CommonResp<AccessAmountDaySummaryRespDTO> queryAccessAmountDayTotal(AccessAmountDayReqDTO requestDto) throws BizException;



}
