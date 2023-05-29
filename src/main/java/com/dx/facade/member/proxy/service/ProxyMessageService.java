package com.dx.facade.member.proxy.service;


import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.common.PageRequest;
import com.dx.facade.member.proxy.resp.ProxyMessageDTO;

import java.util.List;
import java.util.Map;

/**
 * 代理消息服务
 * 主要为app端提供接口,即从Controller中发起调用
 * 但是totalUnreadAmount()方法是个例外,它被后端rpc调用
 *
 * @author rudolf
 */
public interface ProxyMessageService {
    /**
     * 获取'通知'消息列表
     */
    PageResp<ProxyMessageDTO, ?> notifyList(Long userId, PageRequest pageRequest);


    /**
     * 获取所有4种消息的未读消息的数量
     * 这里可以返回Boolean型来表示是否有未读消息,app端提议说以后产品可能将红点改为带有数字的
     * 红点,建议直接返回数值,表示未读消息数量,所以这里用Integer型
     */
    Map<String, Integer> unreadAmount(Long userId);

    /**
     * 获取总未读消息的数量(用于外部页面的'红点'功能)
     * 注意,本方法与上面的的hasUnreadMessage方法的区别如下:
     * hasUnreadMessage方法是判断某一个类型的消息,是否有未读的,是给app用的
     * hasAnyUnreadMessage方法是判断所有类型的消息,是否有未读的,是给后端rpc用的
     */

    Integer totalUnreadAmount(Long userId) throws BizException;

    /**
     * 标记消息为已读(单个标记和批量标记,都是这个接口)
     */
    int markRead(Long userId, List<String> messageIds) throws BizException;

    /**
     * 删除消息(单个删除和批量删除,都是这个接口)
     */
    int delete(Long userId, List<String> messageIds) throws BizException;

    /**
     * 查看一条消息的详情
     */
    ProxyMessageDTO detail(Long userId, String messageId) throws BizException;

}
