package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.*;
import com.dx.facade.account.req.*;
import com.dx.facade.account.resp.*;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

public interface WithdrawOrderRPCService {

    /**
     * 会员/代理提款记录列表
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<WithdrawOrderRespDTO, WithdrawOrderSumDTO>> getWithdrawOrderList(PageReq<WithdrawOrderParamDTO> pageReq);


    /**
     * 代理添加银行卡/虚拟币时提款记录列表
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<WithdrawOrderRespDTO, ?>> getProxyWithdrawOrderList(PageReq<WithdrawOrderParamDTO> pageReq);


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
     * @param param           参数
     * @return
     */
    Integer countLockedStatusWithdrawOrderNum(WithdrawOrderUpdateLockReqDTO param);

    /**
     * 代理待审核订单总数统计
     * @param memberIds     代理下会员ID集合
     * @return  待代理审核状态的订单数
     */
    Integer countWaitAuditByProxyOrderNum(List<Long> memberIds);

    default Integer countByQueryCondition(CountByConditionParamDTO param) {
        return 0;
    }


    CommonResp changeLockStatusWithdrawOrderById(ChangeLockStatusParam param) throws BizException;


    /**
     * 当天提现次数与提现总额统计
     * @param param
     * @return
     */
    CommonResp<WithdrawTodayTotalRespDTO> memberTodayWithdraw(WithdrawTodayTotalReqDTO param);

    CommonResp<GetTodayWithdrawStaRespDTO> getTodayWithdrawStat(Integer userType, Long userId);

    List<OrderListByIpOrDeviceNoRespDTO> getOrderListByIpOrDeviceNo(OrderListByIpOrDeviceNoParamDTO param);


    CommonResp auditWithdrawOrder(WithdrawOrderAuditParamDTO param) throws BizException;

    /**
     * 发起第三方提现操作
     * @param eventId
     * @return
     * @throws BizException
     */
    CommonResp confirmCreateWithdraw(String eventId);

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

    /**
     * 时间查询提现统计
     * @return
     */
    WithdrawOrderStatsRespDTO getWithdrawStats(WithdrawOrderStatsParamDTO paramDTO);

    /**
     * 查询会员或代理存取款统计信息
     * @param paramDTO
     * @return
     */
    UserWithdrawDepositStatRespDTO getUserWithdrawDepositStatInfo(UserWithdrawDepositStatReqDTO paramDTO);

    /**
     * 查询批量会员或代理的取款统计
     * @param param
     * @return
     */
    CommonResp<Map<Long,BatchUserWithdrawDepositStatRespDTO>> getBatchUserWithdrawDepositStatInfo(BatchUserWithdrawDepositStatReqDTO param);

    /**
     * @author Dealer
     * @description: 钱包页面需要展示取款中状态信息
     * @date 2023/10/28
     * @copyright
     */
    CommonResp<Integer> getWithdrawStatInfo(UserWithdrawDepositStatReqDTO paramDTO);
}
