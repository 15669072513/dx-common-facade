package com.dx.facade.game.service;

import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.es.req.GameRecordParam;
import com.dx.facade.es.resp.GameRecordAggregation;
import com.dx.facade.es.resp.GameRecordDetailDto;
import com.dx.facade.es.resp.GameRecordDto;

import java.io.IOException;

/**
 * 为管理后台提供TiDB相关查询
 */
public interface GameRecordCmsRpcService {
    /**
     * 管理后台-游戏注单界面,列表查询
     */
    PageResp<GameRecordDto, GameRecordAggregation> gameRecordList(GameRecordParam param) throws BizException, IOException;

    /**
     * 查询注单详情
     *
     * @param id
     * @return
     * @throws BizException
     */
    GameRecordDetailDto getGameRecordDetail(String id) throws BizException;
}
