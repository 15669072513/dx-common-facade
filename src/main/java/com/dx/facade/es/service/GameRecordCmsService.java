package com.dx.facade.es.service;

import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.es.req.GameRecordParam;
import com.dx.facade.es.resp.GameRecordAggregation;
import com.dx.facade.es.resp.GameRecordDto;

import java.io.IOException;

/**
 * 为管理后台提供ES相关查询
 */
public interface GameRecordCmsService {
    /**
     * 管理后台-游戏注单界面,列表查询
     */
    PageResp<GameRecordDto, GameRecordAggregation> gameRecordList(GameRecordParam param) throws BizException, IOException;
}
