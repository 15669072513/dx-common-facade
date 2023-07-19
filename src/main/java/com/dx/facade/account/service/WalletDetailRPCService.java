package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.param.WalletDetailParamDTO;
import com.dx.facade.account.req.WalletBalanceDetailDTO;
import com.dx.facade.account.req.WalletBalanceDetailReq;
import com.dx.facade.account.resp.GameAmountTotalRespDTO;
import com.dx.facade.account.resp.WalletDetailRespDTO;
import com.dx.facade.account.resp.WalletDetailSumDTO;

import java.math.BigDecimal;

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

}
