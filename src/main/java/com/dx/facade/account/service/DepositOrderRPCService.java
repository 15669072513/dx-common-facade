package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.DepositOrderParamDTO;
import com.dx.facade.account.req.CancelDepositOrderDTO;
import com.dx.facade.account.req.DepositAggByLastWithdrawEsReqDto;
import com.dx.facade.account.req.DepositCallBackParamDTO;
import com.dx.facade.account.req.SubmitPayParamDTO;
import com.dx.facade.account.resp.DepositAggByLastWithdrawEsRespDto;
import com.dx.facade.account.resp.DepositOrderRespDTO;
import com.dx.facade.account.resp.DepositOrderSumDTO;
import com.dx.facade.account.resp.SubmitPayRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * 会员代理充值相关接口
 */
public interface DepositOrderRPCService {

    /**
     * 会员/代理存款记录分页查询列表
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<DepositOrderRespDTO, DepositOrderSumDTO>> getDepositOrderList(PageReq<DepositOrderParamDTO> pageReq);

    /**
     * 获取某个用户的存款优惠比例*
     * @param merchantId
     * @param userType
     * @param userId
     * @return
     */
    BigDecimal getDiscountRate(Long merchantId,Integer userType,Long userId);

    CommonResp<SubmitPayRespDTO> submitPay(SubmitPayParamDTO param) throws BizException;


    void cancelDepositOrder(CancelDepositOrderDTO param) throws BizException;

    void updateDepositOrderStatus(CancelDepositOrderDTO param) throws BizException;

    /**
     * @param dto 上次提款到现在的存款金额 请求参数
     * @return 存款总金额
     * @throws BizException 异常
     */
    DepositAggByLastWithdrawEsRespDto getDepositAggByLastWithdraw(DepositAggByLastWithdrawEsReqDto dto);

    /**
     * @param param 充值回调处理
     * @return void
     */
    void depositCallBack(DepositCallBackParamDTO param) throws BizException;

    DepositOrderRespDTO getDepositOrderByEventId(String eventId);

    /**
     * 回调失败修改成失败状态
     * @param param
     */
    @ApiModelProperty(value = "回调失败修改成失败状态")
    void depositFailCallBack(DepositCallBackParamDTO param);
}
