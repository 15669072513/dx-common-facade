package com.dx.facade.merchant.service.vip;

import com.dx.entity.CommonResp;
import com.dx.facade.merchant.resp.MemberVipInComRespDTO;

import java.util.List;


/**
 * 会员vip权益配置RPC服务
 *
 * @program: member-server-parent
 * @description:
 * @author: Yinter
 * @create: 2022/10/07
 */
public interface MemberVipIncomeRPCService {

	/**
	 * 查询vip权益配置
	 *
	 * @param merchantId
	 * @return
	 * @throws
	 */
	CommonResp<List<MemberVipInComRespDTO>> queryMemberVipIncomeByMerchantId(Long merchantId);
}
