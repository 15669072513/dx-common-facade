package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.account.req.ActivityInviteConfigParam;
import com.dx.facade.account.req.ActivityInviteConfigSwitchParam;
import com.dx.facade.account.resp.ActivityInviteConfigRespDTO;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 好友邀请活动RPC
 */
public interface ActivityInviteConfigRPCService {

    /**
     * 保存好友邀请活动配置
     * @param param
     * @return
     * @throws BizException
     */
    CommonResp<String> saveConfig(@RequestBody @Validated ActivityInviteConfigParam param) throws BizException;

    /**
     * 好友邀请活动开关
     * @param param
     * @return
     * @throws BizException
     */
    CommonResp<String> switchControl(ActivityInviteConfigSwitchParam param, String userName);

    /**
     * 查询单条活动配置
     * @param merchantId
     * @return
     * @throws BizException
     */
    CommonResp<ActivityInviteConfigRespDTO> queryOne(Long merchantId) throws BizException;
//
//    /**
//     * 好友邀请规则配置查询
//     * @param activityId
//     * @return
//     */
//    CommonResp<List<ActivityInviteDepositRuleRespDTO>> qryActivityInviteDepositRule(Long activityId);
//
//    /**
//     * 邀请人阶梯奖励细则
//     * @param merchantId
//     * @return
//     */
//    CommonResp<List<ActivityInviteDepositRuleRespDTO>> queryActivityInviteRuleList(Long merchantId);
//
//    /**
//     * 好友邀请存款任务金额计算
//     * @param paramDTO
//     * @return
//     * @throws BizException
//     */
//    GetInviteDepositBonusRespDTO getInviteDepositBonusAmount(GetInviteDepositBonusParamDTO paramDTO) throws BizException;

}
