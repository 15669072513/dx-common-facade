package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.WalletDetailParamDTO;
import com.dx.facade.account.resp.WalletDetailRespDTO;
import com.dx.facade.account.resp.WalletDetailSumDTO;
import com.dx.facade.member.member.param.MemberListByWindControlInfoReqDto;
import com.dx.facade.member.member.param.MerchantUnderMemberInfoReqDTO;
import com.dx.facade.member.member.resp.MemberListByWindControlInfoRespDto;
import com.dx.facade.member.member.resp.MerchantUnderMemberRespDTO;
import com.dx.facade.member.param.*;
import com.dx.facade.member.resp.MemberInfoRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public interface MemberRPCService {

    CommonResp<PageResp<MemberInfoRespDTO, ?>> selectMemberListPage(PageReq<MemberListParamDTO> pageReq);

    CommonResp<MemberInfoRespDTO> selectMemberByUserName(Long merchantId, String userName);

    CommonResp<List<MemberInfoRespDTO>> selectListByUserName(Long merchantId, List<String> userName);

    CommonResp<MemberInfoRespDTO> selectMemberById(Long memberId);

    CommonResp<MemberInfoRespDTO>  selectMemberByOne(MemberParamDTO paramDTO);

    /**
     * 根据上级代理Id获取全部直属会员
     * @param merchantId
     * @param parentProxyId
     * @return
     */
    CommonResp<List<MemberInfoRespDTO>> selectListByParentProxyId(Long merchantId, String parentProxyId);

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
}
