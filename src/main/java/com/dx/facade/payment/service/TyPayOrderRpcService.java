package com.dx.facade.payment.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.account.req.GetPayParamDTO;
import com.dx.facade.account.req.SubmitVetfityParamDTO;
import com.dx.facade.account.req.WithdrawOrderAuditParamDTO;
import com.dx.facade.member.resp.MemberInfoRespDTO;
import com.dx.facade.member.resp.ProxyInfoRespDTO;
import com.dx.facade.payment.dto.ProxyTransferInnerDto;
import com.dx.facade.payment.dto.ThirdPayChannelDictResp;
import com.dx.facade.payment.dto.WithDrawOrderDto;

import com.dx.facade.payment.dto.WithDrawOrderDtoV2;
import com.dx.facade.payment.resp.PaymentWithdrawOrderRespDTO;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author agan
 */
public interface TyPayOrderRpcService {
    /**
     * 会员/代理上传凭证
     * @param submitVetfityParamDTO
     * @return
     * @throws Exception
     */
    @ApiModelProperty(value = "会员取款")
    CommonResp submitVetfity(SubmitVetfityParamDTO submitVetfityParamDTO) throws Exception;

    /**
     * 会员/代理取消存款订单
     * @param submitVetfityParamDTO
     * @return
     * @throws Exception
     */
    @ApiModelProperty(value = "取消存款")
    CommonResp cancelOrder(SubmitVetfityParamDTO submitVetfityParamDTO) throws Exception;

    /**
     * 会员取款接口
     * @param var1
     * @return
     * @throws Exception
     */
    @ApiModelProperty(value = "会员取款")
    CommonResp saveWithDrawOrder(WithDrawOrderDto var1) throws Exception;

    /**
     * 信用盘用户提现请求，请求到payment服务创建订单
     * @param dto
     * @return code为200成功，其它失败
     * @throws Exception
     */
    @ApiModelProperty(value = "会员取款")
    CommonResp<PaymentWithdrawOrderRespDTO> saveWithDrawOrderV2(WithDrawOrderDtoV2 dto);

    /**
     * 佣金提款到中心钱包
     * @param proxyTransferInnerDto
     * @param proxyPo
     * @param memberBO
     * @return
     * @throws Exception
     */
    CommonResp saveProxyTransferInnerOrder(ProxyTransferInnerDto proxyTransferInnerDto, ProxyInfoRespDTO proxyPo, MemberInfoRespDTO memberBO) throws Exception;


    /**
     * 提款审核成功
     * @param param
     * @return
     * @throws BizException
     */
    public CommonResp auditWithdrawOrder(WithdrawOrderAuditParamDTO param) throws BizException;

    /**
     * 获取支付厂商名称列表
     * @return
     * @throws BizException
     */
    List<ThirdPayChannelDictResp> getPayMerchantName();

    List<ThirdPayChannelDictResp> getPayParamsByPaymentMerchantId(GetPayParamDTO payParamDTO);
}
