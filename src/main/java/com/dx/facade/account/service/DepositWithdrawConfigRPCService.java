package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.DepositWithdrawConfigParamDTO;
import com.dx.facade.account.req.DepositWithdrawConfigDTO;
import com.dx.facade.account.req.DepositWithdrawConfigPageDTO;
import com.dx.facade.account.resp.DepositWithdrawConfigRespDTO;
import com.dx.facade.account.resp.PaymentMerchantRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Yinter
 */
public interface DepositWithdrawConfigRPCService {

    /**
     * 查询出入款厂商配置列表
     * @param dto
     * @return
     */
    @ApiModelProperty(value = "查询出入款厂商配置列表")
    PageResp<DepositWithdrawConfigRespDTO, ?> select(DepositWithdrawConfigPageDTO dto);

    /**
     * 查询出入款厂商配置下拉列表
     * @param dto
     * @return
     */
    @ApiModelProperty(value = "查询出入款厂商配置下拉列表")
    List<PaymentMerchantRespDTO> selectDropDown(DepositWithdrawConfigDTO dto);


    /**
     * 新增或者修改出入款厂商配置
     * @param dto
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "新增或者修改出入款厂商配置")
    CommonResp<Boolean> insertOrUpdate(DepositWithdrawConfigParamDTO dto) throws BizException;
}
