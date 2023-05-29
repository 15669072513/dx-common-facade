package com.dx.facade.message.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.message.dto.MessageNoticeDTO;
import com.dx.facade.message.dto.MessageSysDTO;
import com.dx.facade.message.dto.SendMessageNoticeDetailDTO;
import com.dx.facade.message.req.MultiSendNoticeToUserReq;
import com.dx.facade.message.req.PushNoticeReq;
import com.dx.facade.message.req.RetractNoticeReq;
import com.dx.facade.message.req.SendNoticeToUserReq;

public interface MessageNoticeOneWayRpcService {

    public void send(SendMessageNoticeDetailDTO sendMessageNoticeDetailDTO) throws BizException;

    /**
     * 根据模板code发送消息
     */
    public void send(MessageSysDTO messageSysDTO) throws BizException;
    /**
     * 全员发送消息
     */
    public void managementSendToAllUser(MessageNoticeDTO messageNoticeDTO) throws BizException;


    /**
     * 按终端发送消息
     */
    public void managementSendToDevice(MessageNoticeDTO messageNoticeDTO) throws BizException;


    /**
     * 管理后台发1条消息给1个用户
     */
    public void managementSendToUser(SendNoticeToUserReq req) throws BizException;


    /**
     * 管理后台发1条消息给指定n个用户,这个接口只被管理后台所调用
     */
    public void managementSendToMultiUser(MultiSendNoticeToUserReq req) throws BizException;


    /**
     * 管理后台撤回一条消息,撤回的消息可以是任意类型的消息(包含全员消息,指定会员的,指定终端的)
     */
    public CommonResp<Boolean> retract(RetractNoticeReq req) throws BizException;


    /**
     * 发送消息（参与活动通知，VIP晋级通知）
     */
    public void pushMessageNotice(PushNoticeReq req) throws BizException;





}
