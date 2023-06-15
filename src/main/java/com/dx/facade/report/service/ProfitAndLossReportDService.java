package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.base.LocalDatePageRequest;
import com.dx.facade.report.param.report.business.BusinessBasicReportReqDTO;
import com.dx.facade.report.param.report.business.MemberReportReqDTO;
import com.dx.facade.report.param.report.business.ProxyReportReqDTO;
import com.dx.facade.report.param.report.profitandloss.*;
import io.swagger.annotations.ApiModelProperty;

public interface ProfitAndLossReportDService {

    /**
     * 会员报表
     *
     * @param reqDTO
     * @return
     */
    @ApiModelProperty(value="盈亏报表-会员盈亏")
    CommonResp<PageResp<MemberProfitDay, ?>> pageMemberReport(PageReq<MemberReportReqDTO> reqDTO) throws BizException;


    /**
     * 会员游戏盈亏
     *
     * @param reqDTO
     * @return
     */
    @ApiModelProperty(value="盈亏报表-会员游戏盈亏")
    CommonResp<PageResp<MemberGameProfitDay, ?>> pageMemberGameReport(PageReq<MemberReportReqDTO> reqDTO) throws BizException;

    /**
     * 代理盈亏
     *
     * @param reqDTO
     * @return
     */
    @ApiModelProperty(value="盈亏报表-代理盈亏")
    CommonResp<PageResp<DwmProxyNetAmountMonthPO, ?>> pageProxyReport(PageReq<ProxyReportReqDTO> reqDTO) throws BizException;

    /**
     * 场馆盈亏
     *
     * @param reqDTO
     * @return
     */
    @ApiModelProperty(value="盈亏报表-场馆盈亏")
    CommonResp<PageResp<GameProfitDay, ?>> pageVenueReport(PageReq<LocalDatePageRequest> reqDTO) throws BizException;

    /**
     * 游戏盈亏
     *
     * @param reqDTO
     * @return
     */
    @ApiModelProperty(value="盈亏报表-游戏盈亏")
    CommonResp<PageResp<VenueProfitDay, ?>> pageGameReport(PageReq<LocalDatePageRequest> reqDTO) throws BizException;

    /**
     * 每日盈亏
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */

    @ApiModelProperty(value="盈亏报表-每日盈亏")
    CommonResp<PageResp<ProfitDay, ?>> dayReport(PageReq<BusinessBasicReportReqDTO> reqDTO) throws BizException;
}
