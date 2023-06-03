package com.dx.facade.es.service;

import com.dx.facade.es.req.GameOrderRecordReq;
import com.dx.facade.es.resp.GameOrderRecordResp;
import com.dx.facade.es.resp.GameOrderStatisticsResp;

import java.util.List;

/**
 * 游戏注单查询
 * @author heart
 */
public interface GameOrderRecordService {
    /**
     * 游戏订单记录
     * @param req 请求参数
     * @return
     */
    List<GameOrderRecordResp> gameOrderRecordSearch(GameOrderRecordReq req);
    /**
     * 游戏订单统计
     * @param req 请求参数
     * @return
     */
    List<GameOrderStatisticsResp> gameOrderRecordStatisticsSearch(GameOrderRecordReq req);

}
