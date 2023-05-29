package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.ActivityInviteNotificationParam;
import com.dx.facade.account.req.ActivityInviteBetDetailsStatusDTO;
import com.dx.facade.account.req.ActivityInviteRecordsParam;
import com.dx.facade.account.req.ActivityInviteTaskParam;
import com.dx.facade.account.req.ActivityInviteTaskQueryParam;
import com.dx.facade.account.resp.*;

import java.time.LocalDateTime;

/**
 * 邀请活动数据
 */
public interface ActivityInviteTaskRPCService {

    /**
     * 好友邀请活动入口校验
     * @param merchantId
     * @param userId
     * @return
     */
    CommonResp<CheckInviteActivityRespDTO> checkInviteActivityEntry(Long merchantId, Long userId) throws BizException;


    /**
     * 添加邀请用户关系
     * @param activityInviteTaskParam
     * @return
     * @throws BizException
     */
    Boolean addActivityInviteData(ActivityInviteTaskParam activityInviteTaskParam)  throws BizException;

    /**
     * 好友邀请活动记录-邀请记录
     * @param merchantId
     * @param userId
     * @return
     */
    CommonResp<PageResp<ActivityInviteTaskRespDTO,?>> inviteRecords(Long merchantId,Long userId,PageReq<ActivityInviteRecordsParam> pageReq);


    /**
     * 邀请数据接口分页查询
     * @param pageReq
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ActivityInviteTaskRespDTO, ActivityInviteTaskSummaryDTO>> activityInviteTaskPage(PageReq<ActivityInviteTaskQueryParam> pageReq) throws BizException;

    /**
     * 修改邀请状态
     *
     * @param inviteEventId 邀请人奖励订单号
     * @param inviteRewardStatus 邀请人派奖状态 1.未达标 2.已失效 3.审核中 4.已拒绝 5.待领取 6.已领取 7.已过期
     * @param time 派奖时间
     * @return
     */
    CommonResp<Boolean> updateInviteRewardStatus(String inviteEventId, Integer inviteRewardStatus, LocalDateTime time) throws BizException;

    /**
     * 获取邀请邀请数据
     * @param merchantId
     * @param userId
     * @param activityId
     * @return
     */
    GetUserInviteDataRespDTO getUserInviteData(Long merchantId, Long userId, Long activityId);


    /**
     * 修改好友邀请-返利明细-修改状态
     * @param dto
     * @return
     * @throws BizException
     */
    void updateStatus(ActivityInviteBetDetailsStatusDTO dto) throws BizException;

//    /**
//     * 好友存款执行RPC调用接口-首存
//     * @param depositMQDto mq存款金额
//     * @param firstDepositFlag 是否首存 是true
//     * @return
//     */
//    CommonResp activityFirstDepositAmountDepositReward(DepositMQDTO depositMQDto, boolean firstDepositFlag);


    /**
     * 活动记录-消息通知
     * @param param
     * @return
     */
    CommonResp<NotificationResp> notification(Long merchantId, Long userId, ActivityInviteNotificationParam param) throws BizException;

}
