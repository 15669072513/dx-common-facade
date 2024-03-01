package com.dx.facade.member.service;

import com.dx.facade.member.param.UpdateProxyBankChannelStatusParamDTO;
import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.GetProxyPathByUserNameParamDTO;
import com.dx.facade.member.param.JoinCodeIsRepeatParamDTO;
import com.dx.facade.member.param.UserBindMobileOrEmailDTO;
import com.dx.facade.member.param.ProxyInfoParamDTO;
import com.dx.facade.member.param.ProxyInfoRpcEditReqDTO;
import com.dx.facade.member.param.ProxyListPageParamDTO;
import com.dx.facade.member.param.ProxyQueryParamDTO;
import com.dx.facade.member.param.ProxyTreeLinkParamDTO;
import com.dx.facade.member.param.ProxyTreeParamDTO;
import com.dx.facade.member.param.QueryProxyCommissionSettleCycleParamDTO;
import com.dx.facade.member.param.UpdatePassWordParamDTO;
import com.dx.facade.member.param.UpdateProxyCommissionSettleCycleParamDTO;
import com.dx.facade.member.param.UpdateProxyLockStatusParamDTO;
import com.dx.facade.member.param.UpdateProxyPasswordParamDTO;
import com.dx.facade.member.proxy.resp.ProxyBaseInfoRespDTO;
import com.dx.facade.member.resp.ProxyAndMemberTreeRespDTO;
import com.dx.facade.member.resp.ProxyCommissionSettleCycleRespDTO;
import com.dx.facade.member.resp.ProxyInfoRespDTO;
import com.dx.facade.member.resp.ProxyTreeRespDTO;

import io.swagger.annotations.ApiModelProperty;

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

    @ApiModelProperty("获取代理和会员树状结构")
    CommonResp<ProxyAndMemberTreeRespDTO> getProxyAndMemberTreeLink(ProxyTreeLinkParamDTO paramDTO) throws BizException;

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


    /**
     * 校验支付密码
     * @param userId
     * @param payPassword
     * @param uerType
     * @return
     * @throws BizException
     */
    CommonResp<Boolean> createPayPassword(Long userId, String payPassword, Integer uerType) throws BizException;

    /**
     * 返回代理详情
     * @param proxyId
     * @return
     * @throws BizException
     */
    ProxyBaseInfoRespDTO proxyBaseInfo(Long proxyId) throws BizException;

    /**
     * @description: v2.1提款通用密码校验逻辑
     * @date 2023/9/25
     * @copyright
     */
    CommonResp<Boolean> validateDepositWithdrawPassword(Long merchantId, Long userId, String payPassword, Integer userType);

    /**
     * 校验代理支付密码
     * @param merchantId  商户ID
     * @param userId    代理用户id
     * @param payPassword 支付密码
     * @param checkDepositWithdraw  是否校验重提状态
     * @return 校验成功返回true
     * @throws BizException 业务异常
     */
    CommonResp<Boolean> validatePayPasswordCustom(Long merchantId, Long userId, String payPassword, Integer userType, Boolean checkDepositWithdraw);
    /**
     * 校验代理支付密码
     *
     * @param merchantId  商户ID
     * @param userId    代理用户id
     * @param payPassword 支付密码
     * @return 校验成功返回true
     * @throws BizException 业务异常
     */
    CommonResp<Boolean> validatePayPassword(Long merchantId, Long userId, String payPassword, Integer userType);

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

  /**
   *
   * @param updateProxyBankChannelStatusParamDTO
   * @return
   */
  CommonResp<Boolean> updateProxyBankChannelStatus(
      UpdateProxyBankChannelStatusParamDTO updateProxyBankChannelStatusParamDTO);
  /**
	 * 校验userName是否已存在
	 *
	 * @param paramDTO
	 * @return
	 */
	CommonResp<Boolean> checkUserName(ProxyQueryParamDTO paramDTO);

	/**
	 * 设置登录密码
	 *
	 * @param params
	 * @return
	 * @throws BizException
	 */
    CommonResp<Boolean> updatePassword(UpdateProxyPasswordParamDTO params) throws BizException;

    /**
     * 查询所有子代理包含直属和非直属
     *
     * @param proxyId
     * @return
     */
    CommonResp<List<ProxyInfoRespDTO>> getProxyAndSubListByProxyPath(Long proxyId);

    /**
     * @author Dealer
     * @description: 查询指定代理全部下辖代理
     * @date 2023/9/18
     * @copyright
     */
    CommonResp<List<ProxyInfoRespDTO>> getProxyAndSubList(ProxyTreeLinkParamDTO paramDTO);

    /**
     * 获取所以下级代理id
     *
     * @param proxyId
     * @return
     */
    CommonResp<List<Long>> getSubProxyIdList(Long proxyId);

    /**
     *  更新代理佣金结算周期
     *
     * @param paramDTO
     * @return
     * @throws Exception
     */
	CommonResp<Boolean> updateProxyCommissionSettleCycle(UpdateProxyCommissionSettleCycleParamDTO paramDTO);

    /**
     *  查询代理佣金结算周期
     *
     * @param paramDTO
     * @return
     * @throws Exception
     */
	CommonResp<ProxyCommissionSettleCycleRespDTO> getProxyCommissionSettleCycle(QueryProxyCommissionSettleCycleParamDTO paramDTO);

	/**
	 * 代理绑定手机号或者邮箱
	 *
	 * @param params
	 * @return
	 * @throws BizException
	 */
	CommonResp<Boolean> bindMobileOrEmail(UserBindMobileOrEmailDTO params) throws BizException;


    /**
     * @author Dealer
     * @description: 根据合营码查代理信息
     * @date 2023/9/18
     * @copyright
     */
    CommonResp<ProxyInfoRespDTO> getProxyByJoinCode(Long merchantId, String joinCode);

    /**
     * @author bicycle
     * @date 2023/9/18
     * @copyright
     */
    CommonResp<List<ProxyInfoRespDTO>> getProxyByProxyIds(List<Long> proxyIds);
}
