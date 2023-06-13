package com.dx.facade.merchant.service.vip;


import com.dx.entity.CommonResp;
import com.dx.facade.merchant.resp.MemberVipPromotionResp;
import com.dx.facade.merchant.resp.MemberVipPromotionStateResp;

import java.util.List;

/**
 * 会员VIP晋级RPC服务
 * 
 * @author einson
 */
public interface MembersVipPromotionRPCService {

    /**
     * 通过商户号获取 会员VIP晋级配置名称
     * 
     * @param merchantId
     * @return
     */
    CommonResp<List<MemberVipPromotionResp>> listSelectMemberVipPromotion(Long merchantId);


    /**
     * 通过商户号获取 会员VIP晋级配置开关
     * 
     * @param merchantId
     * @return
     */
    CommonResp<MemberVipPromotionStateResp> selectVipPromotionState(Long merchantId);

}
