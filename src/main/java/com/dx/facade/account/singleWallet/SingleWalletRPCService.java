package com.dx.facade.account.singleWallet;

import com.dx.entity.CommonResp;
import com.dx.facade.account.change.param.IBWWalletChangeParm;
import com.dx.facade.account.change.param.MultipleWalletChangeParmDTO;

import java.util.List;

public interface SingleWalletRPCService {

    /* 彩票一共有 5 种账变场景，分别如下：
     * 1: 投注 -- gameApi 调用 cpMultipleWalletChange, 账变类型：MemberWalletChange.cp_touzhu
     * 2: 撤单 -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.cp_chedan
     * 3: 派奖 -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.cp_paijiang
     * 4: 撤回派奖 -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.cp_chehuipaijiang
     * 5: 二次派奖 -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.cp_ercipaijiang
     */
    /* 真人一共有 6 种账变场景，分别如下：
     * 1: 投注 -- gameApi 调用 multipleWalletChange, 账变类型：MemberWalletChange.zr_touzhu
     * 2: 撤单 -- gameApi 调用 multipleWalletChange, 账变类型：MemberWalletChange.zr_chedan
     * 3: 派奖加额 -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.zr_paicai_add
     * 4: 派奖减额 -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.zr_paicai_sub
     * 5: 活动和小费加额 -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.zr_activity_add
     * 6: 活动和小费减额 -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.zr_activity_sub
     * 7: 活动和小费回滚 -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.zr_fee_rollback
     */
    /* 体育一共有 14 种账变场景，分别如下：
     * 投注(扣款) -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_touzhu
     * 结算派彩(加款) -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_paijiang
     * 注单取消(加款) -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_chedan
     * 注单取消回滚(扣款) -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_chedan_cancel
     * 结算回滚(扣款) -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_paijiang_cancel
     * 拒单(加款) -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_judan
     * 提前部分结算（加款）-- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_paijiang_advance_part
     * 提前全额结算（加款）-- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_paijiang_advance_all
     * 提前结算取消（扣款）-- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_paijiang_advance_quxiao
     * 提前结算取消回滚（加款）-- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_paijiang_advance_quxiao_cancel
     * 人工加款（加款）-- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_artificial_add
     * 人工扣款 (扣款) -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_artificial_sub
     * 用户预约下注(扣款) -- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_appointment_touzhu
     * 用户预约投注取消（加款）-- gameApi 调用 singleWalletChange, 账变类型：MemberWalletChange.ty_appointment_touzhu_cancel
     */

    CommonResp<SingleWalletRespDTO> singleWalletChange(IBWWalletChangeParm param);

    CommonResp<List<SingleWalletRespDTO>> cpBet(MultipleWalletChangeParmDTO param);

    CommonResp<List<SingleWalletRespDTO>> tyBet(MultipleWalletChangeParmDTO param);

    CommonResp<List<SingleWalletRespDTO>> djBet(MultipleWalletChangeParmDTO param);

    CommonResp<List<SingleWalletRespDTO>> qpBet(MultipleWalletChangeParmDTO param);



    CommonResp<TotalSingleWalletRespDTO> zrBetOrCancel(MultipleWalletChangeParmDTO param);
}