package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.account.change.param.IBWWalletChangeParm;
import com.dx.facade.account.change.param.MultipleWalletChangeParmDTO;
import com.dx.facade.account.change.param.TransferWalletChangeParmDTO;
import com.dx.facade.account.param.AdjustWithdrawWaterParamDTO;
import com.dx.facade.account.param.QueryWalletParam;
import com.dx.facade.account.param.WalletAmountParam;
import com.dx.facade.account.req.*;
import com.dx.facade.account.resp.*;
import com.dx.facade.account.resp.WalletSimpleParam;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WalletRPCService {

    /**
     * 查询用户的钱包
     */
    List<WalletRespDTO> getWallet(QueryWalletParam param);

    /**
     * 批量查询用户的钱包
     *
     * @param paramList
     * @return
     */
    CommonResp<List<WalletRespDTO>> getWalletList(List<QueryWalletParam> paramList);

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
     * @author Dealer
     * @description: 获取指定用户(类型)的, 资金信息[中心、信用、额度]
     * @date 2023/9/21
     * @copyright
     */
    CommonResp<WalletAmountDTO> getWalletAmountByUserId(WalletAmountParam param);

    /**
     * @author Dealer
     * @description: 获取指定用户(类型)的, 资金信息[中心、信用、额度、冻结]
     * @date 2023/9/21
     * @copyright
     */
    CommonResp<WalletAmountDTO> getWalletAmountByUserIdAll(WalletAmountParam param);

    /**
     * @author Dealer
     * @description: 批量获取指定用户(类型)的, 资金信息[中心、信用、额度、冻结]
     * @date 2023/9/21
     * @copyright
     */
    CommonResp<List<WalletAmountDTO>> walletAmounts(WalletAmountParam param);

    /**
     * 根据用户id和用户类型计算实时账单
     * @param param
     * @return
     */
    CommonResp<RealtimeBillRespDTO> getRealtimeBill(RealtimeBillParam param);

    /**
     * 批量查询用户钱包额度
     * @param userIds   用户id集合
     * @return
     */
    CommonResp<List<BatchWalletAmountRespDTO>> getBatchWalletAmountByhUserIds(List<Long> userIds);

    /**
     * 提现时获取提现相关信息
     * @param param
     * @return
     */
    CommonResp<WithdrawInfoRespDTO> getWithdrawInfo(WithdrawInfoParam param);

    /**
     * 获取取款限制信息：1.提取款限制类型，2取款限制信息
     * @param param
     * @return
     */
    CommonResp<WithdrawLimitInfoRespDTO> getWithdrawLimitInfo(WithdrawLimitInfoParam param);


    /**
     * @description: 获取充提汇总信息
     * @date 2023/10/7
     * @copyright
     */
    CommonResp<DepositWithdrawSummaryDTO> depositWithdrawSummaryInfo(Long memberId, Integer userType);

    /**
     * 获取取款限制类型：1-账单限制，2-流水限制
     * @param userId
     * @param userType
     * @return
     */
    CommonResp<Integer> getWithdrawLimitType(Long userId, Integer userType);


    /**
     * @author Dealer
     * @description: 批量获取代理团队信用额度信息
     * @date 2023/12/16
     * @copyright
     */
    CommonResp<Map<Long, BigDecimal>> teamCreditAmount(List<Long> proxyId, Integer proxyWalletType);

    /**
     * @author Dealer
     * @description: 获取代理团队额度信息
     * @date 2023/12/16
     * @copyright
     */
    CommonResp<BigDecimal> teamCreditAmount(Long proxyId, Integer proxyWalletType);

    /**
     * 根据多个代理路径查询每个代理路径对应的团队授信总额
     * @param proxyPaths
     * @return
     */
    default CommonResp<Map<String, BigDecimal>> getTeamCreditAmountBatchByProxyPaths(List<String> proxyPaths){
         return CommonResp.success(new HashMap<>());
    };

    /**
     * 同步会员或代理的代理路径，若是会员，则proxyPath为member表中的parentProxyPath；若为代理，则是proxy表中的proxyPath
     * @param userId
     * @param userType
     * @param proxyPath
     * @return
     */
    default CommonResp syncWalletProxyPath(Long userId, Integer userType, String proxyPath){
        return CommonResp.success(new HashMap<>());
    };


}
