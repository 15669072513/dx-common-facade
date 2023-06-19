package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.param.WalletDetailParamDTO;
import com.dx.facade.account.req.WalletBalanceDetailDTO;
import com.dx.facade.account.req.WalletBalanceDetailReq;
import com.dx.facade.account.resp.WalletDetailRespDTO;
import com.dx.facade.account.resp.WalletDetailSumDTO;

public interface WalletDetailRPCService {

    /**
     * 会员/代理账变记录列表
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<WalletDetailRespDTO, WalletDetailSumDTO>> getWalletDetailList(PageReq<WalletDetailParamDTO> pageReq);

    CommonResp<PageResp<WalletBalanceDetailReq, String>> queryBalanceDetail(PageReq<WalletBalanceDetailReq> pageReq);

}
