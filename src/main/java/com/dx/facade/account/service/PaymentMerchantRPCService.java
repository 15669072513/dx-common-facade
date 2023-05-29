package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.PaymentMerchantAddParamDTO;
import com.dx.facade.account.req.PaymentMerchantQueryParamDTO;
import com.dx.facade.account.req.PaymentMerchantUpdateParamDTO;
import com.dx.facade.account.resp.PaymentMerchantRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Yinter
 */
public interface PaymentMerchantRPCService {

    /**
     * 查询支付厂商列表
     * @param dto
     * @return
     */
    @ApiModelProperty(value = "查询支付厂商列表")
    PageResp<PaymentMerchantRespDTO, ?> select(PaymentMerchantQueryParamDTO dto);


    /**
     * 修改支付厂商
     * @param dto
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "修改支付厂商")
    CommonResp<Boolean> update(PaymentMerchantUpdateParamDTO dto) throws BizException;

    /**
     * 新增支付厂商
     * @param dto
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "新增支付厂商")
    CommonResp<Boolean> insert(PaymentMerchantAddParamDTO dto) throws BizException;


    /**
     * 根据id查询支付厂商信息
     * @param dto
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "通过id查询支付厂商")
    PaymentMerchantRespDTO getPaymentMerchantById(Long id);




}
