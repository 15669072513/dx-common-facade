package com.dx.facade.member.proxy.service;

/**
 * 代理消息发送服务
 * 功能: 发送一条代理消息,本服务只通过rpc向外提供服务
 * 调用本类的方法后,会产生两个效果: 1.将消息保存到数据库; 2.向app端实时推送这条消息
 * 注1:由于是内部rpc调用,所以这个服务并不会去校验userId,merchantId等信息是否存在,是否被禁用等
 * 注2:共有4种类型的消息: 通知,安全码,公告,活动.产品要求本期只做'通知'类型的消息
 *
 * @author rudolf
 */
public interface ProxyMessageOneWayRPCService {
    /**
     * 发送一条'通知'类型的代理消息
     * '通知'类型又分为8个小类型:成为合营伙伴,新增下级会员,佣金奖励,返点奖励,活动奖励... ...
     * 这些小类型,都是调用此方法,并且方法参数上没有任何区分
     *
     * @param userId     用户id
     * @param merchantId 商户id
     * @param messageId  消息的唯一id. 用于保证幂等写入,对于每个消息,这个参数都要保证是不同的,否则后
     *                   发的消息会被忽略,最大长度为100
     *                   这个字段可以为空,此时不保证幂等性
     * @param title      消息的标题
     * @param content    消息的内容
     */
    void sendNotify(Long userId, Long merchantId, String messageId,
                    String title, String content);
}
