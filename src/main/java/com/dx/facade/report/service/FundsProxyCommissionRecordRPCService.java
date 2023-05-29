package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.report.req.FundsGeneralProxyCommissionRecordListReqDTO;
import com.dx.facade.report.req.FundsGeneralProxyCommissionRecordTotalReqDTO;
import com.dx.facade.report.resp.FundsGeneralProxyCommissionRecordListRespDTO;
import com.dx.facade.report.resp.FundsGeneralProxyCommissionRecordTotalRespDTO;

/**
 @title 资金下的佣金记录RPC接口
 @desc 包含总代佣金记录、佣金审核
 @path
 @author gollum
 @version 1.0.0
 @since 2021年10月14日 23:32:42
*/
public interface FundsProxyCommissionRecordRPCService {

    /**
     * @title 总代佣金记录分页接口
     * @desc OB旗舰中控后台->资金->总代佣金记录->总代佣金记录分页接口
     * @author gollum
     * @version 1.0.0
     * @since 2021年09月27日 23:18:22
     * @param reqDTO
     * return com.dx.entity.CommonResp<com.dx.entity.PageResp<GeneralProxyCommissionentRespDTO,?>>
     */
    CommonResp<PageResp<FundsGeneralProxyCommissionRecordListRespDTO, FundsGeneralProxyCommissionRecordTotalRespDTO>> queryGeneralProxyCommissionPaymentList(PageReq<FundsGeneralProxyCommissionRecordListReqDTO> reqDTO);

    /**
     * @title 总代佣金记录总计接口
     * @desc OB旗舰中控后台->资金->总代佣金记录->总代佣金记录总计接口
     * @author gollum
     * @version 1.0.0
     * @since 2021年09月27日 23:14:06
     * @param reqDTO
     * return com.dx.entity.CommonResp<com.dx.facade.report.param.report.ProxyCommissionRecordRespDTO>
     */
    CommonResp<FundsGeneralProxyCommissionRecordTotalRespDTO> queryGeneralProxyCommissionPaymentTotal(FundsGeneralProxyCommissionRecordTotalReqDTO reqDTO);
}
