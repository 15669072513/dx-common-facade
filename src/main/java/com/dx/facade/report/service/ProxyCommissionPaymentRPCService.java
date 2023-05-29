package com.dx.facade.report.service;



import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.member.param.ProxyPaymentDTO;
import com.dx.facade.member.proxy.req.ProxyCommissionReceivePayReqDTO;
import com.dx.facade.member.proxy.resp.ProxyCommissionReceivePayRespDTO;
import com.dx.facade.member.report.req.*;
import com.dx.facade.member.report.resp.*;
import com.dx.facade.report.param.agent.ProxyCommissionPayTotalDTO;
import com.dx.facade.report.param.agent.ProxyCommissionPaymentReqDTO;
import com.dx.facade.report.param.agent.ProxyCommissionReciveTotalDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @title 佣金收付报表接口
 * @desc 如果需要区分是否是代理佣金，可在类名上修改，但方法名无需加上Proxy字样，但DTO上仍需加
 * @path OB旗舰中控后台->报表->业务报表->佣金收付报表
 * @author gollum
 * @version 1.0.0
 * @since 2021年9月18日 上午00:06:10
 */
public interface ProxyCommissionPaymentRPCService {

//    /**
//     * 佣金管理 - 佣金账单列表
//     *
//     * @author focus
//     * @since 2021年9月19日 下午2:30:58
//     * @param reqDTO
//     * @return CommonResp
//     */
//    CommonResp<PageResp<ProxyCommissionPaymentRespDTO, ProxyCommissionPaymentSummaryRespDTO>>
//    commissionPaymentOrder(PageReq<ProxyCommissionPaymentReqDTO> reqDTO) throws Exception;
//
    /**
     * 代理web - 佣金收付账单
     *
     * @author kygo
     * @since 2022.04.18
     * @param reqDTO
     * @return CommonResp
     */
    CommonResp<PageResp<ProxyCommissionReceivePayRespDTO, ?>> commissionReceivePay(PageReq<ProxyCommissionReceivePayReqDTO> reqDTO) throws Exception;


    /**
     * 代理web - 收统计
     *
     * @param
     * @return CommonResp
     * @author kygo
     * @since 2022.04.18
     */
    ProxyCommissionReciveTotalDTO childProxyReceiveTotal(ProxyCommissionPaymentReqDTO req);

    /**
     * 代理web - 付统计
     *
     * @param
     * @return CommonResp
     * @author kygo
     * @since 2022.04.18
     */
    ProxyCommissionPayTotalDTO childProxyPayedTotal(ProxyCommissionPaymentReqDTO req);

    /**
     * @title 佣金收付分页接口
     * @desc OB旗舰中控后台->资金->佣金收付记录->佣金收付分页接口
     * @author gollum
     * @version 1.0.0
     * @since 2021年09月27日 22:42:35
     * @param reqDTO
     * return com.dx.entity.CommonResp<com.dx.entity.PageResp<com.dx.facade.report.resp.report.FundsProxyCommissionPaymentListRespDTO,?>>
     */
    CommonResp<PageResp<FundsProxyCommissionPaymentListRespDTO, FundsProxyCommissionPaymentTotalRespDTO>> queryProxyCommissionPaymentList(PageReq<FundsProxyCommissionPaymentListReqDTO> reqDTO);

    /**
     * @title 佣金收付总计接口
     * @desc OB旗舰中控后台->资金->佣金收付记录->佣金收付总计接口
     * @author gollum
     * @version 1.0.0
     * @since 2021年09月27日 22:42:05
     * @param reqDTO
     * return com.dx.entity.CommonResp<com.dx.facade.report.resp.report.FundsProxyCommissionPaymentTotalRespDTO>
     */
    CommonResp<FundsProxyCommissionPaymentTotalRespDTO> queryProxyCommissionPaymentTotal(FundsProxyCommissionPaymentTotalReqDTO reqDTO);

}
