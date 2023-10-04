package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.proxynetamountday.ProxyDayNetAmountReqDTO;
import com.dx.facade.report.param.proxynetamountday.ProxyNetAmountDayBackReqDTO;
import com.dx.facade.report.param.proxynetamountday.ProxyNetAmountDayReqDTO;
import com.dx.facade.report.param.proxynetamountmonth.ProxyMonthNetAmountReqDTO;
import com.dx.facade.report.param.proxynetamountmonth.ProxyNetAmountMonthReqDTO;
import com.dx.facade.report.resp.proxynetamountday.*;
import com.dx.facade.report.resp.proxynetamountmonth.*;

import java.util.List;

/**
 * ProxyNetAmountRPCService
 *
 * 代理盈亏
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午4:39:44
 *
 *   日报表
 *  queryProxyNetAmountDayBackList(proxyDayNetAmountReqDTO);
 *  queryProxyNetAmountDayBackTotal(reqDTO);
 *   月
 *  queryProxyNetAmountMonthList
 *  queryProxyNetAmountMonthTotal
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
     * @param reqDTO
     * @return
     * @throws Exception
     */
    CommonResp<PageResp<ProxyMonthNetAmountRespDTO,Void>> queryProxyMonthNetAmountList_v2(PageReq<ProxyMonthNetAmountReqDTO> reqDTO) throws Exception;
    /**
     * 代理后台查询代理当前或选中代理月盈亏详情 0.2.1
     * @param reqDTO
     * @return
     * @throws Exception
     */
    CommonResp<ProxyMonthNetAmountRespDTO> findProxyMonthNet_v2(ProxyMonthNetAmountReqDTO reqDTO) throws Exception;

    /**
     * bwjk
     * 代理月盈亏详情 - 当月日盈亏列表
     *
     * @author focus
     * @since 2021年9月17日 下午4:40:02
     * @param reqDTO
     * @return CommonResp
     * @throws BizException
     */
    CommonResp<PageResp<ProxyNetAmountDayRespDTO, ProxyNetAmountDayRespSummaryDTO>> queryProxyNetAmountMonthDetail_v1(
            PageReq<ProxyNetAmountDayReqDTO> reqDTO) throws Exception;

    /**  代理盈亏日维度 中控后台**/

    /**
     * 代理日分页报表
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
     * @author focus
     * @since 2021年9月17日 下午4:40:02
     * @param reqDTO
     * @return CommonResp
     * @throws BizException
     */
    CommonResp<ProxyNetAmountMonthSummaryRespDTO> queryProxyNetAmountMonthTotal(ProxyNetAmountMonthReqDTO reqDTO) throws BizException;

//
//    /**
//     * 代理月盈亏全部列表
//     *
//     * @author focus
//     * @since 2021年9月17日 下午4:40:02
//     * @param reqDTO
//     * @return CommonResp
//     * @throws BizException
//     */
//    CommonResp<List<ProxyNetAmountMonthRespDTO>> exportProxyNetAmountMonthList(ProxyNetAmountMonthReqDTO reqDTO) throws BizException;
//
    /**
     * 代理月盈亏全部列表
     *
     * @author focus
     * @since 2021年9月17日 下午4:40:02
     * @param reqDTO
     * @return CommonResp
     * @throws BizException
     */
    CommonResp<PageResp<ProxyNetAmountMonthRespDTO, ProxyNetAmountMonthSummaryRespDTO>> queryProxyNetAmountMonthList(
            ProxyNetAmountMonthReqDTO reqDTO) throws BizException;

    /**
     * 代理月盈亏详情 - 当月日盈亏列表 - 中控后台
     *
     * @author focus
     * @since 2021年9月17日 下午4:40:02
     * @param reqDTO
     * @return CommonResp
     * @throws BizException
     */
    CommonResp<PageResp<ProxyNetAmountDayRespDTO,?>> queryProxyNetAmountMonthDetail(ProxyNetAmountDayReqDTO reqDTO) throws Exception;
//
//    /**
//     * 代理月盈亏详情 - 日盈亏列表
//     *
//     * @author focus
//     * @since 2021年9月17日 下午4:40:02
//     * @param reqDTO
//     * @return CommonResp
//     * @throws BizException
//     */
//    CommonResp<List<ProxyNetAmountDetailRespDTO>> queryProxyNetAmountDayDetail(
//            ProxyNetAmountDayReqDTO reqDTO) throws Exception;

//    /**
//     * 代理盈亏（天表和月表）统计 天表缺少统计有：proxy_rebate_point（代理返点） 月表缺少统计有：
//     * venue_fee（场馆费）、proxy_rebate_point（代理返点）、
//     * proxy_net（代理净输赢）、last_month_balance（上月结余）、rush_net（冲正后净输赢）、
//     *
//     * @param localDate
//     * @throws BizException
//     */
//    void statistics(LocalDate localDate) throws BizException;

//    /**
//     * T+1离线数据更新业绩报表 会员报表 (更新前删除）
//     *
//     * @param staticDate
//     * @return
//     */
//    Integer deleteProxyNetAmountRecords(Integer staticDate) throws Exception;

//    /**
//     * T+1离线数据更新业绩报表 会员报表
//     *
//     * @param records
//     * @return
//     */
//    Integer batchInsertProxyNetAmountRecords(List<ProxyNetAmountDayInsertDTO> records,List<ProxyNetAmountMonthInsertDTO> monthRecords) throws Exception;

    //===========================================================>>代理接口追加_v1<<===============================================================================

//    /**
//     * 查询代理日盈亏总计
//     *
//     * @param reqDTO
//     * @return CommonResp
//     * @throws BizException
//     * @author focus
//     * @version 1.0.0
//     * @since 2022年4月12日 下午8:19:44
//     */
//    CommonResp<ProxyDayNetAmountSummaryRespDTO> queryProxyDayNetAmountSummary_v1(ProxyDayNetAmountReqDTO reqDTO) throws Exception;

//    /**
//     * 查询代理月盈亏总计
//     *
//     * @param reqDTO
//     * @return CommonResp
//     * @throws BizException
//     * @author focus
//     * @version 1.0.0
//     * @since 2022年4月13日 下午4:11:22
//     */
//    CommonResp<ProxyMonthNetAmountSummaryRespDTO> queryProxyMonthNetAmountSummary_v1(ProxyMonthNetAmountReqDTO reqDTO) throws Exception;

}
