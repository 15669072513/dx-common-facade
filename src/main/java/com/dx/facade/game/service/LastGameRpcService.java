package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.dto.BwGameDTO;
import com.dx.facade.game.req.GameReq;

/**
 * @author karthus
 */
public interface LastGameRpcService {

    /**
     * 根据用户id获取最近游戏列表数据
     *
     * @return
     */
    CommonResp<PageResp<BwGameDTO, ?>> getGameList(GameReq gameReq);

}
