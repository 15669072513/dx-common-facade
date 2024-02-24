package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.DownScoreReq;
import com.dx.facade.game.req.UpScoreReq;
import com.dx.facade.texas.dto.WalletDto;
import com.dx.facade.texas.dto.WalletFreezeDto;
import com.dx.facade.texas.dto.WalletInfoDto;
import com.dx.facade.texas.req.BatchTableIdWalletRequest;
import com.dx.facade.texas.req.WalletRequest;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface WalletRpcService {

    /**
     * 获取用户钱包信息
     *
     * @param request
     * @return
     */
    CommonResp<WalletDto> getUserWallet(WalletRequest request);

    /**
     * @param request
     * @return
     */
    CommonResp<List<WalletDto>> getUserWallet(BatchTableIdWalletRequest request);

    /**
     * 查询用户所有有冻结的筹码牌桌
     *
     * @param userId
     * @return
     */
    CommonResp<List<WalletFreezeDto>> getUserWalletFreezeAmount(Long userId);

    /**
     * 根据牌桌id查询有冻结的筹码
     *
     * @param tableId
     * @return
     */
    CommonResp<WalletFreezeDto> getUserWalletFreezeAmountByTableId(Long tableId);

    /**
     * 根据牌桌ids查询有冻结的筹码
     *
     * @param tableIds
     * @return
     */
    CommonResp<List<WalletFreezeDto>> getUserWalletFreezeAmountByTableIds(Collection<Long> tableIds);

    /**
     * 根据牌桌id查询有冻结的uid
     *
     * @param tableId
     * @return
     */
    CommonResp<Set<Long>> getHaveFreezeAmountUsers(Long tableId);

    /**
     * 下分
     *
     * @return
     */
    CommonResp<Void> downScore(DownScoreReq downScoreReq);

    /**
     * 上分
     *
     * @return
     */
    CommonResp<Boolean> upScore(UpScoreReq upScoreReq);

    /**
     * 退还筹码
     *
     * @return
     */
    CommonResp<Void> revertUpScore(String eventId, Long eventTime);

    /**
     * @param tableId
     * @return
     */
    CommonResp<BigDecimal> getWalletTotalTableFeeByTableId(Long tableId);

    /**
     * 获取牌桌余额相关信息（总代入，总共带出，总手续费)
     *
     * @param tableId
     * @return
     */
    CommonResp<WalletInfoDto> getWalletInfoByTableId(Long tableId);

    /**
     * 获取用户所有的冻结服务费
     * @param userId
     * @return
     */
    CommonResp<BigDecimal> getUserTotalFreezeAmount(Long userId);
}
