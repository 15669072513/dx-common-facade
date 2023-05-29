package com.dx.facade.message.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.message.dto.MessageNoticeDTO;
import com.dx.facade.message.dto.MessageNoticeDetailDTO;
import com.dx.facade.message.req.*;

public interface MessageNoticeRpcService {

    /**
     * 中控后台新增公告
     */
    public CommonResp<Boolean> save(MessageNoticeDTO messageNoticeDTO) throws BizException;


    /**
     * 中控后台更新公告
     */
    public CommonResp<Boolean> update(MessageNoticeDTO messageNoticeDTO) throws BizException;


    /**
     * 中控后台查询接口
     */
    public CommonResp<PageResp<MessageNoticeDTO, ?>> search(SearchMessageNoticeReq req) throws BizException;


    /**
     * app 获取公告列表
     */
    public CommonResp<PageResp<MessageNoticeDetailDTO, ?>> getList(AppGetMessageNoticeReq appGetMessageNoticeReq) throws BizException;

    public CommonResp<MessageNoticeDetailDTO> getMessageNoticeDetail(MessageNoticeDetailReq appGetMessageNoticeReq) throws BizException;


    /**
     * app 获取用户未读数量
     */
    public CommonResp<Integer> getUnReadCount(AppGetNoticeUnReadCountReq appGetNoticeUnReadCountReq) throws BizException;


    /**
     * app 标记多条已读
     */
    public CommonResp<Boolean> read(AppReadNoticeReq appReadNoticeReq) throws BizException;


    /**
     * app 删除多条通知消息
     */
    public CommonResp<Boolean> delete(AppDeleteNoticeReq appDeleteNoticeReq) throws BizException;
}
