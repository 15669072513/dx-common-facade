package com.dx.facade.es.req;

import lombok.Data;

/**
 * 牌局注单请求参数
 *
 * @author heart
 * @date 2023/06/03 14:26
 */
@Data
public class GameOrderRecordStatisticsReq {
    /**
     * 玩家id
     */
    private String userId;
}
