package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.change.param.IBWWalletChangeParm;
import com.dx.facade.account.change.param.MultipleWalletChangeParmDTO;
import com.dx.facade.account.change.param.TransferWalletChangeParmDTO;
import com.dx.facade.account.param.*;
import com.dx.facade.account.req.WalletBalanceDTO;
import com.dx.facade.account.req.WalletBalanceDetailDTO;
import com.dx.facade.account.req.WalletBalanceDetailReq;
import com.dx.facade.account.resp.*;

import java.math.BigDecimal;
import java.util.List;

public interface WalletRPCService {

    /**
     * 查询用户的钱包
     */
    List<WalletRespDTO> getWallet(QueryWalletParam param);

    /**
     * 批量用户查询中心钱包余额
     *
     * @param paramList
     * @return
     */
    CommonResp<List<WalletRespDTO>> getCashWalletList(List<QueryCashWalletParam> paramList);

    /**
     * 单一钱包账变
     */
    void singleWalletChange(IBWWalletChangeParm param) throws BizException;

    /**
     * 单一钱包多次账变
     */
    void multipleWalletChange(MultipleWalletChangeParmDTO param) throws BizException;

    /**
     * 转账行为账变(转账，代存，佣金支付)
     */
    void transferWalletChange(TransferWalletChangeParmDTO param) throws BizException;

    /**
     * 还需多少流水才能取款(剩余流水)
     */
    StillBillAmountRespDTO getStillBillAmount(WalletSimpleParam param) throws BizException;


    /**
     * 查询某一些的商户
     */
    List<MerchantCenterWalletSumRespDTO> getMerchantMembersCenterWalletSum(List<Long> merchantIds) throws BizException;

    /**
     * 人工调整用户提款流水
     *
     * @param paramDTO
     */
    void adjustWithdrawWater(AdjustWithdrawWaterParamDTO paramDTO);

    BigDecimal getTodayNetAmount(WalletSimpleParam param);

    /**
     * 用户钱包余额操作
     *
     * @param dto 操作参数
     * @throws BizException
     */
    CommonResp<WalletRespDTO> walletBalance(WalletBalanceDTO dto) throws BizException;

    /**
     * 查询余额明细
     *
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<WalletBalanceDetailDTO, String>> queryBalanceDetail(PageReq<WalletBalanceDetailReq> pageReq);


    /**
     * 用户钱包余额操作批量兑换
     *
     * @param balanceDTOS
     * @return
     */
    CommonResp<Void> multiWalletBalance(List<WalletBalanceDTO> balanceDTOS);
}
