package com.dx.facade.member.service;

import com.dx.facade.member.param.*;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.WalletDetailParamDTO;
import com.dx.facade.account.resp.WalletDetailRespDTO;
import com.dx.facade.account.resp.WalletDetailSumDTO;
import com.dx.facade.member.member.param.MemberIncomingSwitchParam;
import com.dx.facade.member.member.param.MemberListByWindControlInfoReqDto;
import com.dx.facade.member.member.param.MerchantUnderMemberInfoReqDTO;
import com.dx.facade.member.member.resp.MemberListByWindControlInfoRespDto;
import com.dx.facade.member.member.resp.MerchantUnderMemberRespDTO;
import com.dx.facade.member.resp.MemberBaseInfoRespDTO;
import com.dx.facade.member.resp.MemberInfoRespDTO;
import com.dx.facade.member.resp.MemberMainInfoRespDTO;

import com.dx.facade.report.resp.proxyoverview.ProxyOverviewMainDataCashRespDTO;
import io.swagger.annotations.ApiModelProperty;
import java.util.Set;

public interface MemberRPCService {

    CommonResp<PageResp<MemberInfoRespDTO, ?>> selectMemberListPage(PageReq<MemberListParamDTO> pageReq);

    CommonResp<MemberInfoRespDTO> selectMemberByUserName(Long merchantId, String userName);

    CommonResp<List<MemberInfoRespDTO>> selectListByUserName(Long merchantId, List<String> userName);

    CommonResp<MemberInfoRespDTO> selectMemberById(Long memberId);
    /**
     * 根据userId列表批量查询用户信息
     *
     * @param memberIds
     * @return
     */
    CommonResp<List<MemberInfoRespDTO>> selectMemberByIds(List<Long> memberIds);

    CommonResp<MemberInfoRespDTO>  selectMemberByOne(MemberParamDTO paramDTO);

    /**
     * 根据上级代理Id获取全部直属会员
     * @param merchantId
     * @param parentProxyId
     * @return
     */
    CommonResp<List<MemberInfoRespDTO>> selectListByParentProxyId(Long merchantId, String parentProxyId);

    /**
     * 根据上级代理Id获取全部直属会员
     * @param paramDTO
     * @return
     */
    CommonResp<List<MemberMainInfoRespDTO>> selectByParentProxyId(MemberQueryReqParamDTO paramDTO);

	/**
	 * 根据上级代理Id获取全部会员
	 * @param merchantId : 机构id
	 * @param topProxyPath: 父代理路径
	 * @param parentProxyId: 父代理id
	 * @param allMembers: true 全部会员， false: 直属会员
	 * @return
	 */
    CommonResp<List<MemberInfoRespDTO>> selectAllByTopProxyPath(Long merchantId, String topProxyPath, String parentProxyId, boolean allMembers);

    CommonResp memberRpcInfoEdit(MemberInfoRpcEditParam param) throws BizException;

    CommonResp<Boolean> insertMemberAndProxy(MemberAndProxyDto memberAndProxyDto) throws BizException;

    CommonResp updateMemberAndProxy(MemberAndProxyUpdateParamDTO param) throws BizException;

    /**
     * 更新会员免转模式
     * @param paramDTO
     * @return
     * @throws BizException
     */
    CommonResp<Boolean> updateTransferInfo(UpdateTransferInfoParamDTO paramDTO) throws BizException;

	/**
	 * 根据会员账号查询当前商户线下会员信息
	 *
	 * @param reqDTO 会员信息
	 * @return 会员id集合
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty("根据会员账号查询当前商户线下会员信息")
	List<MerchantUnderMemberRespDTO> getMerchantUnderMemberByUsername(MerchantUnderMemberInfoReqDTO reqDTO) throws BizException;


	@ApiModelProperty("根据风控信息，返回会员信息集合 风控需求")
	List<MemberListByWindControlInfoRespDto> getMemberListByWindControlInfo(MemberListByWindControlInfoReqDto var1) throws BizException;

    @ApiModelProperty("检验用户名是否存在，包含后台审核中")
    CommonResp<Boolean>  checkUserName(MemberParamDTO paramDTO);

    @ApiModelProperty("检验手机号码是否存在，包含后台审核中")
    CommonResp<Boolean>  checkMobile(MemberParamDTO paramDTO);

    @ApiModelProperty("检验邮箱是否存在，包含后台审核中")
    CommonResp<Boolean>  checkEmail(MemberParamDTO paramDTO);

    @ApiModelProperty("更新用户参加每会员一次首存活动标识")
    Boolean updateActivityOnlyFlag(UpdateActivityOnlyFlagParamDTO paramDTO) throws BizException;

    /**
     * @param addLowerMemberReqDto 代理新增下级会员请求参数
     * @return 受影响行数
     * @throws BizException 异常
     */
    @ApiModelProperty("app代理新增-下级会员")
    CommonResp<Boolean> addLowerMember(AddLowerMemberReqDto addLowerMemberReqDto) throws BizException;

    /**
     * app代理-优惠记录
     * @param pageReq
     * @return
     */
    @ApiModelProperty("app代理-优惠记录")
    CommonResp<PageResp<WalletDetailRespDTO, WalletDetailSumDTO>> memberDiscountRecords(PageReq<WalletDetailParamDTO> pageReq) throws BizException;

    /**
     * 根据俱乐部Id查询该俱乐部下面的会员信息
     *
     * @param clubId
     * @return
     */
    CommonResp<List<MemberBaseInfoRespDTO>> selectByMemberBaseInfoByClubId(Long clubId);

    /**
     * 踢出俱乐部
     *
     * @param clubId
     * @return
     */
    CommonResp<Boolean> kickOutClub(Long clubId,Long memberId);

    /**
     * 加入俱乐部
     *
     * @param memberId
     * @param clubId
     * @return
     */
	CommonResp<Boolean> joinClub(Long memberId, Long clubId);

	/**
	 * 检查用户昵称是否已占用
	 *
	 * @param paramDTO
	 * @return
	 */
	CommonResp<Boolean> checkNickName(CheckMemberNickNameParamDTO paramDTO);

	/**
	 * 更新用户昵称
	 *
	 * @param paramDTO
	 * @return
	 */
	CommonResp<Boolean> updateNickName(UpdateMemberNickNameParamDTO paramDTO);

	/**
	 * 更新用户头像
	 *
	 * @param paramDTO
	 * @return
	 * @throws BizException
	 */
	CommonResp<Boolean> updateTopImage(UpdateMemberTopImagesUrlParamDTO paramDTO) throws BizException;

	/**
	 *  游戏开关
	 * @param memberIncomingSwitchParam
	 * @return
	 */
	Boolean incomingSwitch(MemberIncomingSwitchParam memberIncomingSwitchParam);

	/**
	 *  修改密码
	 * @param param
	 * @return
	 * @throws BizException
	 */
	CommonResp<?> updateMemberAndProxyPassword(MemberPasswordEditParam param) throws BizException;

    /**
     * 根据userId查询会员基本信息
     *
     * @param userId
     * @return
     */
    CommonResp<MemberBaseInfoRespDTO> selectBaseInfoById(Long userId);

	/**
	 * 更新用户手机
	 *
	 * @param paramDTO
	 * @return
	 */
	CommonResp<Boolean> updateMobile(UpdateMemberMobileParamDTO paramDTO);

    /**
     * 根据userId查询会员是否设置支付密码
     *
     * @param userId
     * @return
     */
    CommonResp<Boolean> isSetPayPassword(Long userId);

	/**
	 * 根据总代ID查询所有子会员ID集合
	 * @param topProxyId
	 * @return
	 */
	CommonResp<List<Long>> getMemberIdsByTopProxyId(Long topProxyId);

	/**
	 * 根据代理名称和代理商户查询代理下属全部会员信息
	 * @return
	 */
	CommonResp<List<MemberInfoRespDTO>> memberListByParentProxy(MemberListParamDTO paramDTO);

	CommonResp entryAuthorityOpen(MemberToProxyParam param) throws BizException;

	/**
	 * 查找指定业务模式的用户id集合
	 * @param paramDTO businessModel必传
	 * @return
	 */
	CommonResp<Set<Long>> memberListByBusinessModel(MemberParamDTO paramDTO);


	/**
	 * 会员详情new 1.6.2
	 * @param memberDetailParamDTO
	 * @return
	 */
	CommonResp<MemberInfoRespDTO> selectMemberByParam(MemberDetailParamDTO memberDetailParamDTO);
}
