package com.dx.facade.merchant.service.vip;

import com.dx.entity.CommonResp;
import com.dx.facade.member.resp.MemberVipRebateRespDTO;
import com.dx.facade.merchant.resp.MemberVipRebateVo;

import java.util.List;
/**
 * 会员返水RPC服务
 * 
 * @author Administrator
 *
 */
public interface MemberVipRebateRPCService {
	/**
	 * 根据商户id和场所码获取VIP返水配置
	 * 
	 * @param venueCode
	 * @param merchantId
	 * @return
	 */
    CommonResp<List<MemberVipRebateRespDTO>> getVipConfig(String venueCode, Long merchantId);

    /**
     * 根据商户id获取所以的会员返水配置
     * 
     * @param merchantId
     * @return
     */
    List<MemberVipRebateVo> getAllInfoByMerchantId(Long merchantId);
}
