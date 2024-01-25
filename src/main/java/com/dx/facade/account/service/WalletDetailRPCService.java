package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.TransferGameParam;
import com.dx.facade.account.param.WalletDetailParamDTO;
import com.dx.facade.account.req.MemberRebateReq;
import com.dx.facade.account.req.WalletBalanceDetailReq;
import com.dx.facade.account.req.WalletDetailBatchQueryDTO;
import com.dx.facade.account.resp.*;

import java.util.List;

public interface WalletDetailRPCService {

    /**
     * @author Dealer
     * @description: 获取代理返佣信息
     * @date 2023/10/28
     * @copyright
     */
    CommonResp<ProxyRebateResponseData> proxyRebateInfo(Long proxyId);

    /**
     * @author Dealer
     * @description: 批量获取代理返佣信息
     * @date 2023/10/28
     * @copyright
     */
    CommonResp<List<ProxyRebateResponseData>> proxyRebateInfoBatch(List<Long> proxyIds);


    /**
     * @author Dealer
     * @description: 批量获取会员的返点信息
     * @date 2023/10/28
     * @copyright
     */
    CommonResp<List<ProxyRebateResponseData>> memberRebateInfoBatch(MemberRebateReq rebateReq);

    /**
     * 会员/代理账变记录列表
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<WalletDetailRespDTO, WalletDetailSumDTO>> getWalletDetailList(PageReq<WalletDetailParamDTO> pageReq);

    CommonResp<PageResp<WalletDetailRespDTO, String>> queryBalanceDetail(PageReq<WalletBalanceDetailReq> pageReq);

    /**
     * 德州带入带出服务费账变统计查询RPC
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<WalletDetailRespDTO, WalletDetailBalanceSumDTO>> queryTexasBalanceDetail(PageReq<WalletBalanceDetailReq> pageReq);
    CommonResp<PageResp<WalletDetailRespDTO, WalletDetailRespDTO>> upDownQueryBalanceDetail(PageReq<WalletBalanceDetailReq> pageReq);

    /**
     * 根据牌桌查询代入带出
      * @param tableId
     * @return
     */
    CommonResp<GameAmountTotalRespDTO> getDxGameTableIdAmount(Long tableId);

//    /**
//     * 根据牌桌查询代入带出 list
//     * @param idsList
//     * @return
//     */
//    CommonResp<List<GameAmountTotalRespDTO>> getDxGameTableIdAmount(List<Long> idsList);

    /**
     * 现金钱包向馆钱包上分完成后，向资金发送上分过程中场馆钱包的加额账变信息
     * @param param
     * @return
     * @throws BizException
     */
    CommonResp<Void> transferCenterToBDetail(TransferGameParam param) throws BizException;

    /**
     * 场馆钱包现金钱包上分完成后，向资金发送上分过程中场馆钱包的减额账变信息
     * @param param
     * @return
     * @throws BizException
     */
    CommonResp<Void> transferBToCenterDetail(TransferGameParam param) throws BizException;


    /**
     * 批量检查账变数据是否存在
     * @param queryRespDTO
     * @return
     */
    CommonResp<WalletDetailBatchQueryRespDTO> batchCheckDetailExists(WalletDetailBatchQueryDTO queryRespDTO);

}
