package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.MemberUserBankAndVirtualParam;
import com.dx.facade.account.param.UpdateBankCardParmDTO;
import com.dx.facade.account.param.UpdateWithdrawalParam;
import com.dx.facade.account.req.BankCardBindParmDTO;
import com.dx.facade.account.req.BankCardMerchantIdsParmDTO;
import com.dx.facade.account.req.GetBankCardParmDTO;
import com.dx.facade.account.req.UserBankAndVirtualUpdateStatusReqDTO;
import com.dx.facade.account.resp.BankCardRespDTO;
import com.dx.facade.account.resp.UserBankAndVirtualUpdateBindStatusReqDTO;
import com.dx.facade.member.param.UserBankCardOperationQureyParam;
import com.dx.facade.member.param.UserBankCardQureyParam;
import com.dx.facade.member.param.UserVirtualOperationQureyParam;
import com.dx.facade.member.resp.MemberBankCardOperationResp;
import com.dx.facade.member.resp.MemberVirtualOperationResp;
import com.dx.facade.member.resp.UserBankCardResp;
import com.dx.facade.payment.req.BankCardParmDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author agan
 */
public interface BankCardService {

    /**
     * 查询一张银行卡信息
     * @param paramDTO
     * @return
     * @throws BizException
     */
    BankCardRespDTO getBankCardOne(GetBankCardParmDTO paramDTO) throws BizException;

    /**
     * 查询所有商户的 银行卡
     * @param paramDTO
     * @return
     * @throws BizException
     */
    List<BankCardRespDTO> getBankCardList(BankCardMerchantIdsParmDTO paramDTO) throws BizException;
    /**
     * 管理后台查询银行卡信息
     * @param param
     * @return
     */
    @ApiModelProperty(value = "管理后台查询银行卡信息")
    PageResp<BankCardRespDTO, ?> selectBankCard(MemberUserBankAndVirtualParam param);

    /**
     * 会员修改提款时间
     * @param bankCardParam
     * @return
     * @throws BizException
     */
    CommonResp updateLastWithdrawalTimeByMember(BankCardParmDTO bankCardParam) throws BizException;

    /**
     * 会员端通过会员id 查询 会员绑定的银行卡信息
     * @param paramDTO
     * @return
     */
    @ApiModelProperty(value = "会员端通过会员id 查询 会员绑定的银行卡信息")
    List<BankCardRespDTO> getBankCardListByUserId(GetBankCardParmDTO paramDTO);

    /**
     * 会员端绑定银行卡
     * @param bankCardParam
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "通过绑定会员银行卡信息")
    CommonResp bindBank(BankCardBindParmDTO bankCardParam) throws BizException;

    /**
     * 管理后台修改银行卡黑名单状态
     * @param dto
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "管理后台修改银行卡黑名单状态")
    CommonResp updateUserBankBlackStatus(UserBankAndVirtualUpdateStatusReqDTO dto) throws BizException;

    /**
     * 会员银行卡/虚拟币账号信息RPC
     * @param userBankCardQueryParam
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "会员银行卡/虚拟币账号信息RPC")
    CommonResp<List<UserBankCardResp>> bank(UserBankCardQureyParam userBankCardQueryParam) throws BizException;

    /**
     * 后台操作 会员银行卡 解绑
     * @param dto
     * @return
     * @throws BizException
     */
    CommonResp updateUserBankBindStatus(UserBankAndVirtualUpdateBindStatusReqDTO dto) throws BizException;

    /**
     * 新增或者修改银行卡信息（非绑定）
     * @param bankCardParam
     * @return
     * @throws BizException
     */
    boolean insertOrUpdate(UpdateBankCardParmDTO bankCardParam) throws BizException;

    /**
     * 取款成功之后，修改成功或拒绝笔数
     * @param param
     */
    void updateBankCardWithdrawalInfo(UpdateWithdrawalParam param);

    /**
     * 会员银行卡操作记录查询*
     * @return
     */
    CommonResp<PageResp<MemberBankCardOperationResp, ?>> getMemberBankCardOperation(UserBankCardOperationQureyParam param);

    /**
     * 会员虚拟币操作记录查询*
     */
    CommonResp<PageResp<MemberVirtualOperationResp,?>> getMemberVirtualOperation(UserVirtualOperationQureyParam param);
}
