package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.dto.ChangeAfterAmountDto;
import com.dx.facade.game.req.ChangeAfterAmountReq;
import com.dx.facade.game.req.UpScoreReq;
public interface UpScoreRpc {
    CommonResp<Boolean> upScore(UpScoreReq upScoreReq);
    /**
     * 获取用户牌桌最后一条账变记录的账变后的余额
     * @param req
     * @return
     */
    CommonResp<ChangeAfterAmountDto> getChangeAfterAmount(ChangeAfterAmountReq req);
}
