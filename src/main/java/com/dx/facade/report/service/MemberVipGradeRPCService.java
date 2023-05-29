package com.dx.facade.report.service;

import com.dx.exception.BizException;
import com.dx.facade.report.resp.membergrade.MemberVipChangeRecordRespDTO;
import com.dx.facade.report.resp.membergrade.MemberVipDepositTurnoverRespDTO;

/**
 * @Description 会员等级接口
 * @Author Carlos
 * @Date 2022/2/7 16:02
 * @Version 1.0
 **/
public interface MemberVipGradeRPCService {


    /**
     * @Author Carlos
     * @Description 查询会员累计流水
     * @Date 2022/2/7 16:08
     * @param userId
     * @Return com.dx.facade.report.resp.membergrade.MemberVipDepositTurnoverRespDTO
     **/
    MemberVipDepositTurnoverRespDTO getMemberVipDepositTurnover(Long userId, Long merchantId) throws BizException;


    /**
     * @Author Carlos
     * @Description 查询会员等级变更信息
     * @Date 2022/2/8 14:45
     * @param userId
     * @Return com.dx.facade.report.resp.membergrade.MemberVipChangeRecordRespDTO
     **/
    MemberVipChangeRecordRespDTO getMemberVipChangeRecord(Long userId) throws BizException;
}
