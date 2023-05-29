package com.dx.facade.report.service;

import com.dx.entity.PageResp;
import com.dx.facade.report.param.memberreward.MemberVipRewardRecordReqDTO;
import com.dx.facade.report.param.reward.MemberVipRewardRecordRpcPageReqDto;
import com.dx.facade.report.resp.reward.MemberVipRewardRpcPageRespDto;
import com.dx.facade.report.resp.reward.MemberVipRewardRpcSummaryRespDto;
import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;

/**
 * @Description 会员红利接口
 * @Author Carlos
 * @Date 2022/2/8 15:15
 * @Version 1.0
 **/
public interface MemberVipRewardRecordRPCService {
    /**
     * @param dtoPageReq 会员Vip奖励发送记录 请求参数
     * @return 会员Vip奖励发送记录
     * @throws Exception 异常
     */
    CommonResp<PageResp<MemberVipRewardRpcPageRespDto, ?>> memberVipRewardListPage(PageReq<MemberVipRewardRecordRpcPageReqDto> dtoPageReq) throws Exception;

    /**
     * @param dtoPageReq 会员Vip奖励发送总计 请求参数
     * @return 会员Vip奖励发送记录
     * @throws Exception 异常
     */
    CommonResp<MemberVipRewardRpcSummaryRespDto> memberVipRewardSummary(MemberVipRewardRecordRpcPageReqDto dtoPageReq) throws Exception;

    /**
     * @param memberVipRewardRecordReqDTO 好友邀请发送记录 请求参
     * @return 响应结果
     * @throws Exception 异常
     */
    CommonResp<Void> sendMemberVipReward(MemberVipRewardRecordReqDTO memberVipRewardRecordReqDTO) throws Exception;

}
