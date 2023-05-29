package com.dx.facade.member.proxy.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.proxycommission.SumProxyCommissionAuditReqDTO;
import com.dx.facade.report.resp.proxycommission.SumActivityMemberRespDTO;
import com.dx.facade.report.resp.proxycommission.SumAmountVenueRespDTO;
import com.dx.facade.report.resp.proxycommission.SumRebateVenueRespDTO;


/**
 * @title 佣金审核详情下钻接口
 * @description OB旗舰中控后台->资金->佣金审核(总代)->详情页下钻接口.
 * @author kygo
 * @version 1.0.0
 * @since 2021年9月18日 上午00:02:38
 */
public interface ProxyCommissionAuditService {

    /**
     * 佣金审核详情-分页查询-活跃人数
     *
     * @param param
     * @return
     * @throws
     */
    CommonResp<PageResp<SumActivityMemberRespDTO, ?>> pageSumActivityMember(SumProxyCommissionAuditReqDTO param) throws BizException;

    /**
     * 佣金审核详情-分页查询-有效活跃
     *
     * @param param
     * @return
     * @throws
     */
    CommonResp<PageResp<SumActivityMemberRespDTO, ?>> pageSumValidActivityMember(SumProxyCommissionAuditReqDTO param) throws BizException;

    /**
     * 佣金审核详情-分页查询-新增活跃
     *
     * @param param
     * @return
     * @throws
     */
    CommonResp<PageResp<SumActivityMemberRespDTO, ?>> pageSumActivityNewMember(SumProxyCommissionAuditReqDTO param) throws BizException;


    /**
     * 佣金审核详情-分页查询-新增有效活跃
     *
     * @param param
     * @return
     * @throws
     */
    CommonResp<PageResp<SumActivityMemberRespDTO, ?>> pageSumValidActivityNewMember(SumProxyCommissionAuditReqDTO param) throws BizException;

    /**
     * 佣金审核详情-分页查询代理-场馆费
     *
     * @param param
     * @return
     * @throws
     */
    CommonResp<PageResp<SumAmountVenueRespDTO, ?>> pageSumVenueAmount(SumProxyCommissionAuditReqDTO param) throws BizException;

    /**
     * 佣金审核详情-分页查询代理-总返水
     *
     * @param param
     * @return
     */
    CommonResp<PageResp<SumRebateVenueRespDTO, ?>> pageSumRebateVenue(SumProxyCommissionAuditReqDTO param) throws BizException;
}

