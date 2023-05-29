package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.UpdateBankManageParamDTO;
import com.dx.facade.account.req.BankManageDownParamDTO;
import com.dx.facade.account.req.BankManageQueryParamDTO;
import com.dx.facade.account.req.BankManageUpdateStatusParamDTO;
import com.dx.facade.account.resp.BankManageRespDTO;
import com.dx.facade.account.resp.BankNameRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Yinter
 */
public interface BankManageService {

    /**
     * 管理后台查询银行管理列表
     * @param dto
     * @return
     */
    @ApiModelProperty(value = "管理后台查询银行管理列表")
    PageResp<BankManageRespDTO, ?> selectBankManage(BankManageQueryParamDTO dto);


    /**
     * 管理后台修改银行状态
     * @param dto
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "管理后台修改银行状态")
    CommonResp<Boolean> updateBankStatus(BankManageUpdateStatusParamDTO dto) throws BizException;


    /**
     * 删除银行
     * @param id
     * @return
     * @throws BizException
     */
    CommonResp<Boolean> delete(Long id) throws BizException;

    /**
     * 新增或者修改银行
     * @param dto
     * @return
     * @throws BizException
     */
    CommonResp<Boolean> insertOrUpdate(UpdateBankManageParamDTO dto) throws BizException;

    /**
     * 银行管理下拉列表
     * @param
     * @return
     */
    @ApiModelProperty(value = "银行管理下拉列表")
    CommonResp<List<BankNameRespDTO>> selectBankDropDown(BankManageDownParamDTO dto);

    /**
     * 银行第三方支付绑定的下拉列表
     * 正在使用的银行卡下拉列表
     * @param
     * @return
     */
    @ApiModelProperty(value = "正在使用的银行卡下拉列表")
    CommonResp<List<BankNameRespDTO>> selectMerchantWithdrawBank(BankManageDownParamDTO dto);
}
