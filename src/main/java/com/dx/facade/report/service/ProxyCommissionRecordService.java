package com.dx.facade.report.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.member.param.ProxyPaymentDTO;
import com.dx.facade.member.proxy.req.*;
import com.dx.facade.member.proxy.resp.*;
import com.dx.facade.member.report.req.*;
import com.dx.facade.member.report.resp.ReportCommissionRespDTO;
import com.dx.facade.member.report.resp.ReportCommissionTotalRespDTO;
import com.dx.facade.member.report.resp.ReportProxyDebtsRespDTO;
import com.dx.facade.member.report.resp.ReportProxyReceivableRespDTO;
import com.dx.facade.report.param.proxycommission.CommissionAdjustReqDTO;
import com.dx.facade.report.param.report.CommissionDetailReqDTO;
import com.dx.facade.report.param.report.CommissionRecordReqDTO;
import com.dx.facade.report.param.report.CommissionReqDTO;
import com.dx.facade.report.param.report.ProxyCommissionDetailVO;
import com.dx.facade.report.resp.agent.ProxyCommissionListPayDTO;
import com.dx.facade.report.resp.proxy.CommissionMonthRespDTO;
import com.dx.facade.report.resp.proxy.CommissionMonthSummerRespDTO;
import com.dx.facade.report.resp.proxycommission.ProxyCommissionRecordRespNewDTO;

import java.util.List;
import java.util.Map;

/**
 * 佣金审核/佣金审核记录/总代佣金审核记录/非总代佣金记录等
 *
 * @author kygo
 * @version 1.0.0
 * @since 2021.9.22
 */
public interface ProxyCommissionRecordService {
    // ----佣金审核开始----
    /**
     * 佣金审核-未审核佣金记录数，用于显示菜单小红点上的数字。
     */
    Integer countToAuditRecordByMerchantId(Long merchantId) throws Exception;
    /**
     * 佣金审核-列表：一审和二审共用
     */
    CommonResp<PageResp<ProxyCommissionRecordAuditRespDTO, ?>> selectProxyCommissionRecordPage(PageReq<ProxyCommissionOnAuditRecordReqDTO> reqDTO);
    /**
     * 佣金审核-批量锁定
     */
    CommonResp<Boolean> batchLockProxyCommissionRecord(List<Long> id,Long currentUserMerchantId,Long currentUserId,  String currentUser, Integer lockStatus, Integer lockType) throws BizException;
    /**
     * 佣金审核-批量审核：一审和二审共用
     */
    CommonResp editProxyCommissionAuditStatus(FundsProxyCommissionAduitStatusReqDTO reqDTO) throws BizException;
    /**
     * 佣金审核-佣金加减调整
     */
    CommonResp proxyCommissionAdjust(CommissionAdjustReqDTO adjustReqDTO);
    /**
     * 佣金审核-详情信息
     */
    CommonResp<ProxyCommissionRecordDetailRespDTO> proxyCommissionRecordDetail(ProxyCommissionRecordDetailReqDTO detailDto) throws BizException;
    /**
     * 佣金审核-详情信息-分页查看下级代理佣金
     */
    CommonResp<PageResp<ProxyCommissionRecordAuditRespDTO, ?>> childProxyCommissionRecordDetail(PageReq<ProxyCommissionRecordChildReqDTO> reqDTO) throws BizException;
    // ----佣金审核结束----


    /**
     * 资金->代理资金记录->总代佣金佣金审核记录 + 统计
     * 非总代佣金记录 + 统计
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<ProxyCommissionRecordRespDTO, ProxyCommissionRecordSumRespDTO>> queryProxyCommissionTopList(PageReq<ProxyCommissionGeneralRecordReqDTO> reqDTO);

    /**
     * 资金->代理资金记录->总代佣金佣金审核记录统计 + 统计
     * 非总代佣金记录 + 统计
     *
     * @param reqDTO
     * @return
     */
    CommonResp<ProxyCommissionRecordSumRespDTO> summaryProxyCommissionTopList(ProxyCommissionGeneralRecordReqDTO reqDTO);

    /**
     * 资金->资金调整->非总代佣金管理查询-分页
     */
    CommonResp<PageResp<ProxyCommissionRecordOpRespDTO, GeneraProxyCommissionManagerSumRespDTO>> queryNonGeneralProxyCommission(PageReq<ProxyCommissionNonGeneralRecordReqDTO> reqDTO) throws BizException;
    /**
     * 资金->资金调整->非总代佣金管理查询-合计
     */
    public CommonResp<GeneraProxyCommissionManagerSumRespDTO> queryNonGeneralProxyCommissionSum(ProxyCommissionNonGeneralRecordReqDTO reqDTO) throws BizException;

    /**
     * 资金->资金调整->非总代佣金管理->代发佣金
     */
    CommonResp<String> insteadPayProxyCommission(ProxyCommissionNonGeneralRecordOpReqDTO opReqDTO) throws BizException;

    /**
     * 资金->资金调整->非总代佣金管理->取消佣金
     */
    CommonResp cancelProxyCommission(FundsPayoutStatusReqDTO reqDTO) throws BizException;

    /**
     * 代理web - 佣金发放(批量单个)
     *
     * @param payList dbid
     * @return
     */
    CommonResp<Integer> batchPayProxyCommission(List<ProxyCommissionListPayDTO> payList) throws BizException;

    /**
     * 佣金审核记录分页查找
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<ProxyCommissionRecordAuditedRespDTO, ?>> queryProxyCommissionRecordAudit(PageReq<ProxyCommissionAuditedRecordReqDTO> reqDTO);

    /**
     * 根据reportYm查询佣金数据
     * @param proxyId
     * @param reportYm
     * @return
     * @throws BizException
     */
    ProxyCommissionRecordOpRespDTO selectProxyCommissionByReportYm(Long proxyId, Integer reportYm) throws BizException;

    /**
     * @title 佣金报表分页
     * @desc 佣金报表分页
     * @author kygo
     * @version 1.0.0
     * @since 2022年02月11日
     * @param
     */
    PageResp<CommissionMonthRespDTO,?> queryProxyCommissionList(PageReq<CommissionReqDTO > commissionReq) throws BizException;

    /**
     * @title 佣金报表统计
     * @desc 佣金报表统计
     * @author kygo
     * @version 1.0.0
     * @since 2022年02月11日
     * @param
     */
    CommissionMonthSummerRespDTO queryProxyCommissionTotal(CommissionReqDTO commissionReq) throws BizException;

    /**
     * @title 佣金报表详情
     * @desc 佣金报表详情
     * @author kygo
     * @version 1.0.0
     * @since 2022年02月11日
     * @param
    CommonResp<PageResp<ProxyCommissionDetailVO, ?>> queryProxyCommissionDetail(PageReq<CommissionDetailReqDTO> pageReq);
     */



    /**
     * @title 佣金详情
     * @desc 佣金详情
     * @author focus
     * @version 1.0.0
     * @since 2022年02月11日
     * @param
     */
    ProxyCommissionRecordRespNewDTO getProxyCommissionRecord(CommissionRecordReqDTO commissionRecordReqDTO);

    /**
     * @title 佣金收付报表分页查询接口
     * TODO 需确认前端是否会自动补齐或去除时间
     * @author gollum
     * @since 2021年9月18日 下午15:49:32
     * @return
     * @throws BizException
     */
    CommonResp<List<ReportCommissionRespDTO>> exportCommissionList(ReportCommissionReqDTO reqDTO) throws BizException;

    /**
     * @title 佣金收付报表分页查询接口
     * TODO 需确认前端是否会自动补齐或去除时间
     * @author gollum
     * @since 2021年9月18日 下午15:49:32
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ReportCommissionRespDTO, ?>> queryCommissionList(PageReq<ReportCommissionReqDTO> reqDTO) throws BizException;

    /**
     * @title 佣金收付报表分页合计接口
     * @author carlos
     * @since 2021年10月19日 下午15:49:32
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<ReportCommissionTotalRespDTO> queryCommissionTotal(ReportCommissionReqDTO reqDTO) throws BizException;

    /**
     * @title 未付清明细下钻接口
     * TODO 需确认前端是否会自动补齐或去除时间
     * @author gollum
     * @since 2021年9月18日 下午16:02:11
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ReportProxyDebtsRespDTO, ?>> queryDebtsList(PageReq<ReportProxyDebtsReqDTO> reqDTO) throws BizException;

    /**
     * @title 未收完明细下钻接口
     * TODO 需确认前端是否会自动补齐或去除时间
     * @author gollum
     * @since 2021年9月18日 下午16:49:32
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ReportProxyReceivableRespDTO, ?>> queryReceivableList(PageReq<ReportProxyReceivableReqDTO> reqDTO) throws BizException;
}
