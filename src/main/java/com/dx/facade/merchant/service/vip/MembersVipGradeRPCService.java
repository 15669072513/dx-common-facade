package com.dx.facade.merchant.service.vip;


import com.dx.entity.CommonResp;
import com.dx.facade.member.resp.MemberVipGradeRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 会员VIP等级RPC服务
 * 
 * @author Yinter
 */
public interface MembersVipGradeRPCService {

    /**
     * 通过商户号获取 会员VIP等级配置名称
     * 
     * @param merchantId
     * @return
     */
    CommonResp<List<MemberVipGradeRespDTO>> listSelectMemberVipGrade(Long merchantId);

    /**
     * 通过商户号获取 会员VIP历史等级配置名称
     * 
     * @param merchantId
     * @return
     */
    CommonResp<List<MemberVipGradeRespDTO>> listSelectMemberVipGradeLast(Long merchantId);

    /**
     * 根据VIP等级查询等级信息
     * 
     * @param vipLevel
     * @param merchantId
     * @return
     */
    @ApiModelProperty(value="根据VIP等级查询等级信息")
    MemberVipGradeRespDTO selectVipGradeInfo(String vipLevel,Long merchantId);

    /**
     * 根据VIP等级查询等级信息
     * 
     * @param merchantId
     * @return
     */
    @ApiModelProperty(value="查询商户VIP最高等级")
    String getMaxVipLevel(Long merchantId);
	


}
