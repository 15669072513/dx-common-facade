package com.dx.facade.venue.service;

import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.venue.dto.ConfigGamePO;
import com.dx.facade.venue.req.*;
import com.dx.facade.venue.resp.GameListResp;
import com.dx.facade.venue.resp.GameVenueListResp;

import java.util.List;

/**
 * 游戏相关服务
 */
public interface GameConfigService {

    PageResp<GameListResp, Void> listPage(GameListReq req);

    void setStatus(GameStatusReq req);

    void addGame(GameAddReq req) throws BizException;

    void editGame(GameEditReq req) throws BizException;

    //上面的这些方法,都是为管理后台提供的,下面的方法,为RPC提供

    /**
     * 根据场馆code(如fc,cq9,jdb),获取这个场馆中所有游戏(第一版中,只有电游类型的场馆才有游戏)
     */
    List<ConfigGamePO> getGameListByVenueCode(String venueCode);

    PageResp<GameVenueListResp, Void> gameListByVenueCodePage(GameVenueListReq req);

    /**
     * 根据游戏id获取游戏对象
     */
    List<ConfigGamePO> getGameById(Long gameId);

    /**
     * 获取所有游戏
     */
    List<ConfigGamePO> getAllGames();

    List<ConfigGamePO> getGameByIds(List<Long> gameIds);

    List<ConfigGamePO> getAllGamesByMerchantId(Long merchantId, String device);
}
