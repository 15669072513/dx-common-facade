package com.dx.facade.merchant.service.vip;

import com.dx.entity.CommonResp;
import com.dx.facade.member.resp.MemberVipRebateRespDTO;
import com.dx.facade.merchant.resp.MemberVipRebateVo;

import java.util.List;

public interface MemberVipRebateRPCService {

    CommonResp<List<MemberVipRebateRespDTO>> getVipConfig(String venueCode, Long merchantId);


    List<MemberVipRebateVo> getAllInfoByMerchantId(Long merchantId);
}
