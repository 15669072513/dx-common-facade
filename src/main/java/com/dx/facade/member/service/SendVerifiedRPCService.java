package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.UserEmailParamDTO;

/**
 * @program: member-server
 * @description:
 * @author: Jerrmy
 * @create: 2021-08-26 20:34
 **/
public interface SendVerifiedRPCService {

    /**
     * 通过邮箱地址发送验证码
     * @param email
     * @return
     * @throws BizException
     */
    public CommonResp<Boolean> sendEmail(String email,Long userId) throws BizException;

    /**
     * 通过邮箱地址与验证码效验结果
     * @return
     */
    public CommonResp<Boolean> getRedisEmail(UserEmailParamDTO userEmailParam);

    /**
     * 通过手机号码获取验证码
     * @param phone
     * @return
     */
    public CommonResp<String> getPhoneVerified(String phone,Long userId) throws BizException;

    /**
     * 通过邮箱地址获取验证码
     * @param email
     * @return
     * @throws BizException
     */
    public CommonResp<String> getEmailVerified(String email,Long userId) throws BizException;

}
