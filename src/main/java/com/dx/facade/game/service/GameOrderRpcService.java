package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.dto.GameOrderRecordDto;
import com.dx.facade.game.req.GameOrderRecordReq;
import com.dx.facade.game.req.GameOrderRecordUserReq;
import com.dx.facade.game.resp.GameOrderRecordResp;
import com.dx.facade.game.resp.GameOrderRecordUserResp;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author heart
 */
public interface GameOrderRpcService {

    /**
     * 修改订单es下发状态
     * @param idList 主键id
     * @return
     */
    CommonResp<Integer> updateGameOrderRecord(List<Long> idList);

    /**
     * 修改手牌记录es下发状态
     * @param idList 主键id
     * @return
     */
    CommonResp<Integer> updateGameReview(List<Long> idList);


}
