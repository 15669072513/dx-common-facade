package com.dx.facade.message.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.message.dto.MessageAnnouncementDTO;
import com.dx.facade.message.req.*;

public interface MessageAnnouncementRpcService {

    /**
     * 中控后台新增公告
     */
    public CommonResp<Boolean> save(MessageAnnouncementDTO messageAnnouncementDTO) throws BizException;


    /**
     * 中控后台更新公告
     */
    public CommonResp<Boolean> update(MessageAnnouncementDTO messageAnnouncementDTO) throws BizException;

    /**
     * 中控后台删除公告
     * @throws BizException
     */
    public CommonResp<Boolean> delete(DeleteMessageAnnouncementReq req) throws BizException;

    /**
     * 中控后台查询接口
     */
    public CommonResp<PageResp<MessageAnnouncementDTO, ?>> search(SearchMessageAnnouncementReq req) throws BizException;


    /**
     * app 获取公告列表
     */
    public CommonResp<PageResp<MessageAnnouncementDTO, ?>> getList(AppGetMessageAnnouncementReq appGetMessageAnnouncementReq) throws BizException;

    /**
     * app 获取滚动公告列表
     */
    public CommonResp<PageResp<MessageAnnouncementDTO, ?>> getrollAnnouncementList(AppGetMessageAnnouncementReq appGetMessageAnnouncementReq) throws BizException;


    /**
     * app 获取用户未读数量
     */
    public CommonResp<Integer> getUnReadCount(AppGetAnnouncementUnReadCountReq appGetAnnouncementUnReadCountReq) throws BizException;


    /**
     * app 标记多条已读
     */
    public CommonResp<Boolean> read(AppReadAnnouncementReq appReadAnnouncementReq) throws BizException;



}
