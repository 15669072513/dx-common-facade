package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.MemberLoginParamDTO;
import com.dx.facade.member.param.RegisterParamDTO;
import com.dx.facade.member.param.TryMemberLoginParamDTO;
import com.dx.facade.member.param.VerificationCodeAndLoginParamDTO;
import com.dx.facade.member.resp.MemberVO;

public interface RegisterLoginRPCService {

    /**
     * 注册接口
     * @param registerParam
     * @return
     * @throws BizException
     */
    CommonResp<MemberVO> register(RegisterParamDTO registerParam) throws BizException;

    /**
     * 登录接口
     * @param loginParam
     * @return
     * @throws Exception
     */
    CommonResp<MemberVO> login(MemberLoginParamDTO loginParam) throws Exception;

    /**
     * 清除所有设备登录信息
     *
     * @param userId
     */
    void clearAllDeviceLogin(Long userId);

    /**
     * IP受限后验证验证码及自动登录
     * @param paramDTO
     * @return
     * @throws Exception
     */
    CommonResp<MemberVO> verificationCodeLogin(VerificationCodeAndLoginParamDTO paramDTO) throws Exception;


    /**
     * 试玩账号生成
     * @param generateNumber
     * @param ParentProxyName
     * @param ip
     * @return
     * @throws BizException
     */
    CommonResp<Integer> generateTryMemberBatch(Integer generateNumber, String ParentProxyName, String ip) throws BizException;

    /**
     * 试玩账号登录
     *
     * @param paramDTO
     * @return
     * @throws Exception
     */
    CommonResp<MemberVO> tryMemberLogin(TryMemberLoginParamDTO paramDTO) throws Exception;
}
