package com.dx.facade.auth.rpc;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.auth.domain.*;

import java.util.List;

/**
 * (验证相关接口rpc)
 *
 * @author deft
 */
public interface AuthService {

    /**
     * (jwt以及权限的认证和权鉴)
     *
     * @param authVO
     * @return ResponseDTO
     */
    CommonResp<UserRespDTO> authPermission(AuthReq authVO) throws BizException;

    /**
     * 查询配置信息
     *
     * @param kvConfigReqDTO
     * @return
     * @throws BizException
     */
    CommonResp<List<KvConfigRespDTO>> getProperties(KvConfigReqDTO kvConfigReqDTO) throws BizException;

    ///**
    // * 分页查询配置信息
    // *
    // * @param PageReq
    // * @return
    // * @throws BizException
    // */
    //CommonResp<PageResp> listPageProperties(PageReq<B2BKvConfigReqDTO> PageReq) throws BizException;

    /**
     * 更新配置信息
     *
     * @param kvConfigReqDTO
     * @return
     * @throws BizException
     */
    void updateProperty(KvConfigReqDTO kvConfigReqDTO) throws BizException;


    /**
     * 获取谷歌验证码的密钥
     *
     * @return
     */
    CommonResp<String> getGoogleAuth() throws BizException;

    /**
     * 检查敏感权限
     * @Return boolean
     */
    CommonResp<Boolean> checkSensitivePermit(UserReqDTO userReq)  throws BizException;

    /**
     * b2b商户系统使用
     * 根据权限查询商户
     * 返回商户code列表
     */
    CommonResp<List<String>> getAgentCodes(PermissionAgentReqDTO permissionAgentReqDTO) throws BizException;
    
    /**
     * 验证谷歌验证码
     *
     * @return
     */
    CommonResp<Boolean> checkGoogleAuthCode(CheckGoogleAuthCodeReqDTO req) throws BizException;

}
