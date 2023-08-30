package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.*;
import com.dx.facade.member.proxy.resp.ProxyBaseInfoRespDTO;
import com.dx.facade.member.resp.MemberInfoRespDTO;
import com.dx.facade.member.resp.ProxyInfoRespDTO;
import com.dx.facade.member.resp.ProxyTreeRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public interface ProxyRPCService {

    /**
     * 通过代理ID获取代理信息
     *
     * @param proxyId
     * @return
     */
    CommonResp<ProxyInfoRespDTO> getProxyByID(Long proxyId);

    /**
     * 通过用户名获取代理信息
     * @param merchantId
     * @param userName
     * @return
     */
    CommonResp<ProxyInfoRespDTO> getProxyByUserName(Long merchantId, String userName);

    /**
     * 批量更新代理信息
     *
     * @param proxyLs 代理信息集合
     * @throws BizException 异常
     */
    @ApiModelProperty(value = "批量更新代理信息")
    void updateProxyInfoBatch(List<ProxyInfoParamDTO> proxyLs) throws BizException;

    /**
     * 通过ID更新代理信息
     * @param paramDTO
     * @return
     * @throws BizException
     */
    Boolean updateProxyInfoById(ProxyInfoParamDTO paramDTO) throws BizException;

    @ApiModelProperty("代理树状结构-获取总代理")
    CommonResp<List<ProxyTreeRespDTO>> getProxyTreeResult(ProxyTreeParamDTO paramDTO) throws BizException;

    @ApiModelProperty("获取代理树状结构")
    CommonResp<ProxyTreeRespDTO> getProxyTreeLink(ProxyTreeLinkParamDTO paramDTO) throws BizException;

    @ApiModelProperty("根据代理账号/商户号查询代理层级链路")
    CommonResp<List<ProxyTreeRespDTO>> getProxyTreeLinkByUserName(GetProxyPathByUserNameParamDTO paramDTO) throws BizException;

    @ApiModelProperty("代理列表分页查询")
    CommonResp<PageResp<ProxyInfoRespDTO, ?>> selectProxyListPage(PageReq<ProxyListPageParamDTO> pageReq) throws BizException;

    /**
     * 获取代理线数据
     * @param reqDto 代理请求
     * @return ProxyLinkEsRespDto 代理及下级代理信息
     * @throws BizException 异常
     */
    @ApiModelProperty(value = "获取代理线数据")
    List<ProxyInfoRespDTO> getProxyLink(ProxyTreeLinkParamDTO reqDto) throws BizException;

    /**
     * 校验合营代码是否重复，重复-true
     *
     * @param pageReq 校验合营代码是否重复校验 请求参数
     * @return Boolean
     * @throws BizException 异常
     */
    @ApiModelProperty(value = "校验合营代码是否重复")
    Boolean joinCodeIsRepeat(JoinCodeIsRepeatParamDTO pageReq);

    /**
     * 代理详情-基本信息-信息编辑
     *
     * @param param 信息编辑 请求参数
     * @return CommonResp
     * @throws BizException 业务异常
     */
    CommonResp proxyRpcInfoEdit(ProxyInfoRpcEditReqDTO param) throws BizException;


    CommonResp<Boolean> createPayPassword(Long userId, String payPassword) throws BizException;

    /**
     * 返回代理详情
     * @param proxyId
     * @return
     * @throws BizException
     */
    ProxyBaseInfoRespDTO proxyBaseInfo(Long proxyId) throws BizException;

    /**
     * 校验代理支付密码
     *
     * @param merchantId  商户ID
     * @param userId    代理用户id
     * @param payPassword 支付密码
     * @return 校验成功返回true
     * @throws BizException 业务异常
     */
    CommonResp<Boolean> validatePayPassword(Long merchantId, Long userId, String payPassword);
    
    /**
     * 校验代理密码
     *
     * @param merchantId  商户ID
     * @param userId    代理用户id
     * @param password 密码
     * @return 校验成功返回true
     * @throws BizException 业务异常
     */
    CommonResp<Boolean> validatePassword(Long merchantId, Long userId, String password);

    /**
     * 修改代理密码
     *
     * @param paramDTO 修改密码参数
     * @return 创建成功返回true
     * @throws BizException 全局异常
     */
    CommonResp<Boolean> updateProxyPassWord(UpdatePassWordParamDTO paramDTO) throws BizException;
    /**
     *  更新代理登录、开局、俱乐部管理权限
     * 
     * @param updateProxyLockStatusParma
     * @return
     * @throws Exception 
     */
	CommonResp<Boolean> updateProxyLockStatus(UpdateProxyLockStatusParamDTO updateProxyLockStatusParma) throws Exception;

}
