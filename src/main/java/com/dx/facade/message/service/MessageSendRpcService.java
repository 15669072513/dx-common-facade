package com.dx.facade.message.service;

/**
 * 消息中心-消息实时推送服务
 * 它只是调用neko提供的实时推送功能
 */
public interface MessageSendRpcService {
    /**
     * 向一个用户推送websocket消息(绝大多数情况,使用这个就行了,不要使用下面那个)
     *
     * @param websocketMessage 要推送的消息对象,类应该在com.ob.facade.member.message.websocket包中
     */
    void pushMessageToOneUser(Long userId, Long merchantId, Object websocketMessage);

    /**
     * 向一个用户推送websocket消息,并且指定设备类型
     * 注意:这个方法现在的效果和上面的方法完全一样,因为暂时neko那边并不支持指定userId的同时还指定设备类型
     *
     * @param deviceTypes 要推送的设备类型,可选多个
     *                    枚举如下: 0:IOS_H5,1:IOS_APP,2:PC,3:Android_H5,5:Android_APP
     */
    void pushMessageToOneUser(Long userId, Long merchantId, Integer[] deviceTypes, Object websocketMessage);

    /**
     * 向所有用户推送一条消息
     *
     * @param merchantId: 在执行全员消息实时推送时,neko需要提供merchantId
     */
    void pushMessageToAllUser(Long merchantId, Object websocketMessage);

    /**
     * 向指定设备类型的所有用户推送一条消息
     */
    void pushMessageToDeviceType(Long merchantId, Integer[] deviceTypes, Object websocketMessage);
}
