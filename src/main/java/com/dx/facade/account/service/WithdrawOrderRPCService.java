package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.ChangeLockStatusParam;
import com.dx.facade.account.param.PaymentLockStatusDTO;
import com.dx.facade.account.param.WithdrawOrderParamDTO;
import com.dx.facade.account.req.OrderListByIpOrDeviceNoParamDTO;
import com.dx.facade.account.req.WithdrawOrderAuditParamDTO;
import com.dx.facade.account.req.WithdrawTodayTotalReqDTO;
import com.dx.facade.account.resp.OrderListByIpOrDeviceNoRespDTO;
import com.dx.facade.account.resp.WithdrawOrderRespDTO;
import com.dx.facade.account.resp.WithdrawOrderSumDTO;
import com.dx.facade.account.resp.WithdrawTodayTotalRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public interface WithdrawOrderRPCService {

    /**
     * 会员/代理提款记录列表
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<WithdrawOrderRespDTO, WithdrawOrderSumDTO>> getWithdrawOrderList(PageReq<WithdrawOrderParamDTO> pageReq);


    CommonResp changeLockStatusWithdrawOrderById(ChangeLockStatusParam param) throws BizException;


    /**
     * 当天提现次数与提现总额统计
     * @param param
     * @return
     */
    CommonResp<WithdrawTodayTotalRespDTO> memberTodayWithdraw(WithdrawTodayTotalReqDTO param);

    List<OrderListByIpOrDeviceNoRespDTO> getOrderListByIpOrDeviceNo(OrderListByIpOrDeviceNoParamDTO param);


    CommonResp auditWithdrawOrder(WithdrawOrderAuditParamDTO param) throws BizException;

    /**
     * 通过订单号获取订单详情
     * @param eventId
     * @return
     */
    WithdrawOrderRespDTO getWithdrawOrderByEventId(String eventId);

    /**
     * 第三放确认成功取款
     * @param po
     * @throws BizException
     */
    @ApiModelProperty(value = "第三方成功出款调用方法")
    void thirdConfirmPayment(WithdrawOrderRespDTO po) throws BizException;

    /**
     * 第三方返回失败状态出款调用方法
     */
    @ApiModelProperty(value = "第三方失败状态出款调用方法")
    void thirdFailConfirmPayment(WithdrawOrderRespDTO po) throws BizException;

    @ApiModelProperty(value = "会员详情 启用充提锁定,修改取款订单状态")
    void paymentLockStatus(PaymentLockStatusDTO dto) throws BizException;
}
