package com.dx.facade.es.req;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 牌局注单请求参数
 *
 * @author heart
 * @date 2023/06/03 14:26
 */
@Data
public class GameOrderRecordReq {
    /**
     * 玩家id
     */
    private String userId;
    /**
     * 牌局id
     */
    private Long roundId;
    /**
     * 牌桌id
     */
    private String tableId;
    /**
     * 俱乐部id
     */
    private String clubId;
    /**
     * 上级代理id
     */
    private Long proxyId;
    /**
     * 上级代理路径(1@6@10@20)
     */
    private String proxyPath;

}
