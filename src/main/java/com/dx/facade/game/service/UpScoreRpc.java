package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.UpScoreReq;
public interface UpScoreRpc {
    CommonResp<Boolean> upScore(UpScoreReq upScoreReq);
}
