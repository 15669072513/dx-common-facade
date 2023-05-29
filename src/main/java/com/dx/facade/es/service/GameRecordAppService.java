package com.dx.facade.es.service;

import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.es.req.GameRecordDetailParam;
import com.dx.facade.es.req.GameRecordMetaParam;
import com.dx.facade.es.req.GameRecordParamPC;
import com.dx.facade.es.resp.GameRecordAggregationPC;
import com.dx.facade.es.resp.GameRecordDetail;
import com.dx.facade.es.resp.GameRecordDtoPC;
import com.dx.facade.es.resp.GameRecordMeta;

import java.io.IOException;

/**
 * 为App提供ES相关查询
 */
public interface GameRecordAppService {
    /**
     * 给app端我的-投注记录用的: 获取某个用户的所有注单信息统计信息
     */
    GameRecordMeta getMetaInfo(GameRecordMetaParam param) throws BizException, IOException;

    /**
     * 给app端我的-投注记录用的: 获取某个用户的某个场馆的注单列表
     */
    GameRecordDetail getGameRecordList(GameRecordDetailParam param) throws BizException, IOException;

    /**
     * 给pc端提供的-查看投注记录(有分页)
     */
    PageResp<GameRecordDtoPC, GameRecordAggregationPC> gameRecordListPC(GameRecordParamPC param)
            throws BizException, IOException;
}
