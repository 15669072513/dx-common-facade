package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.TransferGameParam;
import com.dx.facade.account.param.WalletDetailParamDTO;
import com.dx.facade.account.req.WalletBalanceDetailReq;
import com.dx.facade.account.resp.GameAmountTotalRespDTO;
import com.dx.facade.account.resp.WalletDetailRespDTO;
import com.dx.facade.account.resp.WalletDetailSumDTO;

import java.util.List;

public interface WalletDetailRPCService {

    /**
     * 会员/代理账变记录列表
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<WalletDetailRespDTO, WalletDetailSumDTO>> getWalletDetailList(PageReq<WalletDetailParamDTO> pageReq);

    CommonResp<PageResp<WalletDetailRespDTO, String>> queryBalanceDetail(PageReq<WalletBalanceDetailReq> pageReq);

    /**
     * 根据牌桌查询代入带出
      * @param tableId
     * @return
     */
    CommonResp<GameAmountTotalRespDTO> getDxGameTableIdAmount(Long tableId);

    /**
     * 根据牌桌查询代入带出 list
     * @param idsList
     * @return
     */
    CommonResp<List<GameAmountTotalRespDTO>> getDxGameTableIdAmount(List<Long> idsList);

    /**
     * 中心钱包下分 中心钱包到场馆
     * @param param
     * @return
     * @throws BizException
     */
    CommonResp<Void> transferCenterToBDetail(TransferGameParam param) throws BizException;

    /**
     * 中心钱包上分 场馆到中心钱包
     * @param param
     * @return
     * @throws BizException
     */
    CommonResp<Void> transferBToCenterDetail(TransferGameParam param) throws BizException;

}
