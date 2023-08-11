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
import com.dx.facade.account.req.WithdrawOrderUpdateReqDTO;
import com.dx.facade.account.req.WithdrawTodayTotalReqDTO;
import com.dx.facade.account.resp.OrderListByIpOrDeviceNoRespDTO;
import com.dx.facade.account.resp.WithdrawOrderRespDTO;
import com.dx.facade.account.resp.WithdrawOrderSumDTO;
import com.dx.facade.account.resp.WithdrawTodayTotalRespDTO;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface WithdrawOrderRPCService {

    /**
     * 会员/代理提款记录列表
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<WithdrawOrderRespDTO, WithdrawOrderSumDTO>> getWithdrawOrderList(PageReq<WithdrawOrderParamDTO> pageReq);

    /**
     * 提现订单状态更新（订单状态，审核信息等,如果提现有拒绝，需要处理提现资金回退）
     * @param dto           更新DTO
     * @param operationDesc 操作说明
     * @return
     */
    Boolean updateWithdrawOrderStatusById(WithdrawOrderUpdateReqDTO dto, String operationDesc);

    /**
     * 更新提现订单ID更新锁单状态
     * @param id                提现订单ID
     * @param newLockStatus     新的锁单状态
     * @param lockAccountId     锁单人ID
     * @param lockAccount       锁单人
     * @return  true：锁单解锁成功；false：失败
     */
    Boolean updateLockStatusById(@NotNull Long id, @NotNull Integer newLockStatus, Long lockAccountId, String lockAccount);

    /**
     * 统计指定提现订单状态下该用户的锁单数量
     * @param lockAccount           锁单账号
     * @param orderStatusList       提现订单状态集合
     * @return
     */
    Integer countLockedStatusWithdrawOrderNum(String lockAccount, List<Integer> orderStatusList);


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
