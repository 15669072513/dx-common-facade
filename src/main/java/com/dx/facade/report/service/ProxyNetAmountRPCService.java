package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.proxynetamountday.ProxyDayNetAmountReqDTO;
import com.dx.facade.report.param.proxynetamountday.ProxyNetAmountDayBackReqDTO;
import com.dx.facade.report.param.proxynetamountday.ProxyNetAmountDayReqDTO;
import com.dx.facade.report.param.proxynetamountday.ProxyVenueDayNetAmountReqDTO;
import com.dx.facade.report.param.proxynetamountmonth.ProxyMonthNetAmountReqDTO;
import com.dx.facade.report.param.proxynetamountmonth.ProxyNetAmountMonthReqDTO;
import com.dx.facade.report.resp.proxynetamountday.*;
import com.dx.facade.report.resp.proxynetamountmonth.*;

import java.util.List;

/**
 * ProxyNetAmountRPCService
 * <p>
 * 代理盈亏
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午4:39:44
 * <p>
 * 日报表
 * queryProxyNetAmountDayBackList(proxyDayNetAmountReqDTO);
 * queryProxyNetAmountDayBackTotal(reqDTO);
 * 月
 * queryProxyNetAmountMonthList
 * queryProxyNetAmountMonthTotal
 */
public interface ProxyNetAmountRPCService {

    /**
     * bwjk
     * 查询代理日盈亏列表
     *
     * @param reqDTO
     * @return CommonResp
     * @throws BizException
     * @author focus
     * @version 1.0.0
     * @since 2022年4月12日 下午8:19:44
     */
    CommonResp<PageResp<ProxyDayNetAmountRespDTO, ProxyDayDirectNetAmountRespDTO>> queryProxyDayNetAmountList_v1(PageReq<ProxyDayNetAmountReqDTO> reqDTO) throws Exception;

    /**
     * bwjk
     * 查询代理月盈亏列表
     *
     * @param reqDTO
     * @return CommonResp
     * @throws BizException
     * @author focus
     * @version 1.0.0
     * @since 2022年4月13日 下午4:11:42
     */
    CommonResp<PageResp<ProxyMonthNetAmountRespDTO, ProxyMonthDirectNetAmountRespDTO>> queryProxyMonthNetAmountList_v1(PageReq<ProxyMonthNetAmountReqDTO> reqDTO) throws Exception;

    /**
     * 代理后台查询代理月盈亏列表 0.2.1
     *
     * @param reqDTO
     * @return
     * @throws Exception
     */
    CommonResp<PageResp<ProxyMonthNetAmountRespDTO, ProxyMonthNetAmountRespDTO>> queryProxyMonthNetAmountList_v2(PageReq<ProxyMonthNetAmountReqDTO> reqDTO) throws Exception;

    /**
     * 代理后台日报表列表 0.2.1
     *
     * @param reqDTO
     * @return
     * @throws Exception
     */
    public CommonResp<PageResp<ProxyDayNetAmountRespDTO, ProxyDayNetAmountRespDTO>> queryProxyDayNetAmountList_v2(PageReq<ProxyDayNetAmountReqDTO> reqDTO) throws Exception;

    /**
     * bwjk
     * 代理月盈亏详情 - 当月日盈亏明细列表
     *
     * @param reqDTO
     * @return CommonResp
     * @throws BizException
     * @author focus
     * @since 2021年9月17日 下午4:40:02
     */
    CommonResp<PageResp<ProxyDayNetAmountRespDTO, ProxyDayNetAmountRespDTO>> queryProxyNetAmountMonthDetail_v1(
            PageReq<ProxyDayNetAmountReqDTO> reqDTO) throws Exception;

    /**  代理盈亏日维度 中控后台**/

    /**
     * 代理日分页报表
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<ProxyNetAmountDayBackRespDTO, ProxyNetAmountSummaryDayBackRespDTO>> queryProxyNetAmountDayBackList(ProxyNetAmountDayBackReqDTO reqDTO);

    /**
     * 代理日盈亏全部合计
     *
     * @param reqDTO
     * @return CommonResp
     * @throws BizException
     */
    CommonResp<ProxyNetAmountSummaryDayBackRespDTO> queryProxyNetAmountDayBackTotal(ProxyNetAmountDayBackReqDTO reqDTO) throws BizException;


    /**  代理盈亏月维度 中控后台**/


    /**
     * 代理月盈亏全部合计
     *
     * @param reqDTO
     * @return CommonResp
     * @throws BizException
     * @author focus
     * @since 2021年9月17日 下午4:40:02
     */
    CommonResp<ProxyNetAmountMonthSummaryRespDTO> queryProxyNetAmountMonthTotal(ProxyNetAmountMonthReqDTO reqDTO) throws BizException;

    /**
     * 代理月盈亏全部列表
     *
     * @param reqDTO
     * @return CommonResp
     * @throws BizException
     * @author focus
     * @since 2021年9月17日 下午4:40:02
     */
    CommonResp<PageResp<ProxyNetAmountMonthRespDTO, ProxyNetAmountMonthSummaryRespDTO>> queryProxyNetAmountMonthList(
            ProxyNetAmountMonthReqDTO reqDTO) throws BizException;

    /**
     * 代理月盈亏详情 - 当月日盈亏列表 - 中控后台
     *
     * @param reqDTO
     * @return CommonResp
     * @throws BizException
     * @author focus
     * @since 2021年9月17日 下午4:40:02
     */
    CommonResp<PageResp<ProxyNetAmountDayRespDTO, ?>> queryProxyNetAmountMonthDetail(ProxyNetAmountDayReqDTO reqDTO) throws Exception;


     CommonResp<List<ProxyVenueNetAmountDayRespDTO>> queryProxyVenueNetAmountDetail(
            ProxyVenueDayNetAmountReqDTO reqDTO);
     CommonResp<ProxyVenueNetAmountDayRespDTO> queryProxyVenueNetAmountTotal(
            ProxyVenueDayNetAmountReqDTO reqDTO);
}
