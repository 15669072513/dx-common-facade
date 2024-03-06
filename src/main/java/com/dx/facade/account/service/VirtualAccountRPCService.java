package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.*;
import com.dx.facade.account.req.UserBankAndVirtualUpdateStatusReqDTO;
import com.dx.facade.account.req.VirtualAccountMerchantIdsParmDTO;
import com.dx.facade.account.resp.UserBankAndVirtualUpdateBindStatusReqDTO;
import com.dx.facade.account.resp.VirtualAccountRespDTO;

import com.dx.facade.account.resp.VirtualAccountSumRespDTO;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author agan
 */
public interface VirtualAccountRPCService {

    /**
     * 查询虚拟账号信息
     * @param paramDTO
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "查询虚拟账号信息")
    VirtualAccountRespDTO getVirtualAccountOne(GetVirtualAccountParmDTO paramDTO) throws BizException;

    /**
     * 查询所有商户的 虚拟币
     * @return
     * @throws BizException
     */
    List<VirtualAccountRespDTO> getVirtualAccountList(VirtualAccountMerchantIdsParmDTO paramDTO) throws BizException;

    /**
     * 根据用户id查询虚拟币
     * @param paramDTO
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "根据用户id查询虚拟币")
    List<VirtualAccountRespDTO> getVirtualAccountListByUserId(GetVirtualAccountParmDTO paramDTO) throws BizException;

    /**
     * 添加虚拟币
     * @param virtualAccountParams
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "添加虚拟币")
    CommonResp<VirtualAccountRespDTO> bindVirtual(VirtualAccountParmDTO virtualAccountParams);

    /**
     * 修改会员取款时间
     * @param virtualAccountParmDTO
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "修改会员取款时间")
    CommonResp updateLastWithdrawalTimeByMember(VirtualAccountParmDTO virtualAccountParmDTO) throws BizException;

    /**
     * 新增或者修改虚拟账户信息（非绑定）
     * @return
     */
    @ApiModelProperty(value = "新增或者修改虚拟账户信息(非绑定)")
    boolean insertOrUpdate(UpdateVirtualAccountParmDTO virtualParam) throws BizException;

    /**
     * 查询会员 虚拟币账户信息
     * @param param
     * @return
     */
    @ApiModelProperty(value = "查询会员 虚拟币账户信息")
    CommonResp<PageResp<VirtualAccountRespDTO, VirtualAccountSumRespDTO>> selectVirtualAccount(MemberUserBankAndVirtualParam param);

    /**
     * 后台 虚拟币账户解绑操作
     * @param dto
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "后台 虚拟币账户解绑操作")
    CommonResp updateVirtualBindStatus(UserBankAndVirtualUpdateBindStatusReqDTO dto) throws BizException;

    /**
     * 后台修改虚拟币 黑名单状态
     * @param dto
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "后台修改虚拟币 黑名单状态")
    CommonResp updateVirtualBlackStatus(UserBankAndVirtualUpdateStatusReqDTO dto) throws BizException;


    /**
     * 批量校验虚拟币黑名单
     * @param addressList
     * @return
     */
    @ApiModelProperty(value = "批量校验虚拟币黑名单")
    CommonResp checkVirtualBlackStatus(List<String> addressList) throws BizException;

    /**
     * 虚拟币取款成功之后，修改成功或拒绝笔数
     * @param param
     */
    void updateVirtualWithdrawalInfo(UpdateVirtualWithdrawalParam param);


    /**
     * 根据多个会员id，查询会员对应的虚拟币账号
     * @param memberIds   会员ID集合
     */
    default Map<Long, List<String>> getVirtualAccounts(List<Long> memberIds) {
        return new HashMap<>();
    }

    /**
     * 根据虚拟地址返回该地址对应的用户ID
     * @param virtualAddress    虚拟币地址
     * @return  虚拟币地址所属会员ID
     */
    default Long getMemberIdByVirtualAddress(String virtualAddress) {
        return null;
    }
}
