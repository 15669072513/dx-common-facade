package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.game.dto.BwGameDTO;
import com.dx.facade.game.dto.RecommendGameDTO;
import com.dx.facade.game.req.BwGameCollectReq;
import com.dx.facade.game.req.BwRecommendGameReq;
import com.dx.facade.game.req.BwRecommendGameSortReq;
import com.dx.facade.game.resp.AdminRecommendGameResp;
import com.dx.facade.game.resp.RecommendGameResp;

/**
 * @author admin
 */
public interface RecommendGameRpcService {

    /**
     * 新增
     *
     * @param dto
     * @return
     * @throws BizException
     */
    void insertRecommendGame(RecommendGameDTO dto) throws BizException;

    /**
     * 编辑
     *
     * @param dto
     * @return
     * @throws BizException
     */
    void updateRecommendGame(RecommendGameDTO dto) throws BizException;

    /**
     * 物理删除单条数据
     *
     * @param id
     * @return
     * @throws BizException
     */
    void deleteRecommendGame(Long id) throws BizException;

    /**
     * 游戏推荐排序
     * @throws BizException
     */
    void sortRecommendGame(BwRecommendGameSortReq req) throws BizException;

    /**
     * 客户端热门列表分页数据
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<RecommendGameResp, ?>> recommendGamePage(BwRecommendGameReq req) throws BizException;

    /**
     * 中控后台热门列表分页数据
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<AdminRecommendGameResp, ?>> adminRecommendGamePage(BwRecommendGameReq req) throws BizException;
}
