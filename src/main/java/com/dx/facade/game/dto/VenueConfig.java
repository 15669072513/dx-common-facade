package com.dx.facade.game.dto;

import lombok.Data;

/**
 * 商户API配置 （bw_merchant_venue -> venue_config 字段)
 */
@Data
public class VenueConfig {

    /**
     * 电竞代理编号
     */
    private String cAgentId;
    /**
     * 商户API 对应的商户号
     */
    private String agentCode;

    /**
     * 子商户号 DJ:CID
     */
    private String subAgentCode;

    /**
     * 上级商户 DJ:CID
     */
    private String parentAgentCode;

    private String md5Key;

    private String aesKey;

    //AG额外需要密钥
    private String aesKey2;

    private String apiHost;

    private String apiDataHost;

    private String loginHost;

    //越南盾比
    private Integer vndRatio;

    //商户货币类型，非数据库中json 字段
    private String venueCurrency;


}
