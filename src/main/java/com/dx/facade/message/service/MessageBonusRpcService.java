package com.dx.facade.message.service;

import java.util.List;

import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.message.dto.MessageBonusDetailBatchDTO;
import com.dx.facade.message.dto.MessageBonusDetailDTO;
import com.dx.facade.message.dto.UnReceivedBonusAndTime;
import com.dx.facade.message.req.GetBonusListReq;
import com.dx.facade.message.req.GetBonusPageReq;
import com.dx.facade.message.req.SendUserBonusReq;

public interface MessageBonusRpcService {

    void sendToUser(SendUserBonusReq req);

    void sendToUsers(List<MessageBonusDetailDTO> messageBonusDetailDTOList);

    void receive(MessageBonusDetailDTO messageBonusDetailDTO) throws BizException;

    /**
     * 批量根据id 获取详情
     */
    List<MessageBonusDetailDTO> getMessageDetail(List<Long> messageIds);

    /**
     * app读取消息列表
     * 带有分页,但是这个分页只提供list,不提供总记录数(因为app端并不需要展示页码条)
     *
     */
    PageResp<MessageBonusDetailDTO, ?> getList(GetBonusPageReq getBonusPageReq);

    List<MessageBonusDetailDTO> getList(GetBonusListReq req) throws BizException;

    /**
     * app读取未领取的数量
     */
    int getNotReadAmount(long userId, long merchantId);

    /**
     * app端手动领取 vip晋级优惠等奖励
     * @param batchDTO
     * @throws BizException
     */
    void receiveBatch(MessageBonusDetailBatchDTO batchDTO) throws BizException;

    UnReceivedBonusAndTime hasUnReceivedBonus(long userId, long merchantId);
}
