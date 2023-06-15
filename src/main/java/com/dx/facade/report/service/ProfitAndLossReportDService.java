package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.base.LocalDatePageRequest;
import com.dx.facade.report.param.report.business.BusinessBasicReportReqDTO;
import com.dx.facade.report.param.report.business.UserReportReqDTO;
import com.dx.facade.report.param.report.profitandloss.*;

public interface ProfitAndLossReportDService {

    /**
     * 会员报表
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<UserProfitDay, ?>> pageMemberReport(PageReq<UserReportReqDTO> reqDTO) throws BizException;


    /**
     * 会员游戏盈亏
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<UserGameProfitDay, ?>> pageMemberGameReport(PageReq<UserReportReqDTO> reqDTO) throws BizException;

//    /**
//     * 代理盈亏
//     *
//     * @param reqDTO
//     * @return
//     */
//    CommonResp<PageResp<?, ?>> pageProxyReport(PageReq<LocalDatePageRequest> reqDTO) throws BizException;

    /**
     * 场馆盈亏
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<GameProfitDay, ?>> pageVenueReport(PageReq<LocalDatePageRequest> reqDTO) throws BizException;

    /**
     * 游戏盈亏
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<VenueProfitDay, ?>> pageGameReport(PageReq<LocalDatePageRequest> reqDTO) throws BizException;

    /**
     * 每日盈亏
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ProfitDay, ?>> dayReport(PageReq<BusinessBasicReportReqDTO> reqDTO) throws BizException;
}
