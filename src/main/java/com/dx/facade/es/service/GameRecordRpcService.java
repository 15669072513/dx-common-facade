package com.dx.facade.es.service;

import java.io.IOException;
import java.math.BigDecimal;

import com.dx.exception.BizException;
import com.dx.facade.es.resp.GameRecordDetailDto;
import com.dx.facade.es.resp.GameRecordResettlementDetailDto;

/**
 * ES注单相关的rpc
 */
public interface GameRecordRpcService {
    /**
     * 通过会员Id获取会员最后投注时间
     *
     * @return 最后投注时间(戳), 如果没有投注则返回null
     */
    Long getLastBetTime(Long memberId) throws IOException, BizException;

    /**
     * 通过会员Id和场馆编码获取会员最后投注时间
     *
     * @return 最后投注时间(戳), 如果没有投注则返回null
     */
    Long getLastBetTime(Long memberId, String venueCode) throws IOException, BizException;

    /**
     * 获取会员某个时间段内在某个场馆的有效投注的和
     *
     * @param memberId  必传参数,其它参数非必传
     * @param venueCode 不传则是查询所有场馆,传了就只查特定场馆
     */
    BigDecimal getValidBetAmountSum(Long memberId, String venueCode, Long startTime, Long endTime) throws IOException, BizException;

    /**
     * 通过会员Id及时间范围获取会员总输赢额
     */
    BigDecimal getNetAmountSum(Long memberId, Long startTime, Long endTime) throws IOException, BizException;

    /**
     * 判断一个用户在某个场馆是否有未结算注单
     *
     * @param venueCode 不传则是查询所有场馆,传了就只查特定场馆
     */
    boolean hasUnsettled(Long memberId, String venueCode) throws IOException, BizException;

    /**
     * 查询注单详情
     * 
     * @param id
     * @return
     * @throws BizException
     */
    GameRecordDetailDto getGameRecordDetail(String id) throws BizException;

    /**
     * 查询重结算注单详情
     *
     * @param id
     * @return
     * @throws BizException
     */
    GameRecordResettlementDetailDto getGameRecordResettlementDetail(String id) throws BizException;
}
