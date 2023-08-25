package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.game.dto.BwGameDTO;
import com.dx.facade.game.req.BwGameCollectReq;

import java.util.List;

/**
 * @author admin
 */
public interface GameCollectRpcService {

    /**
     * 游戏收藏表添加数据，上限100条
     *
     * @param req
     * @return
     * @throws Exception
     */
    void insertGameCollect(BwGameCollectReq req) throws BizException;

    /**
     * 游戏收藏表物理删除单条数据
     *
     * @param req
     * @return
     * @throws Exception
     */
    void deleteGameCollect(BwGameCollectReq req) throws BizException;

    /**
     * 根据用户id获取收藏列表数据
     *
     * @param req
     * @return
     * @throws Exception
     */
    CommonResp<PageResp<BwGameDTO, ?>> gameCollectPage(BwGameCollectReq req) throws BizException;

    CommonResp<List<BwGameDTO>> gameCollectList(BwGameCollectReq req) throws BizException;
}

