package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.facade.report.req.MembershipBillingDetailsReqDTO;
import com.dx.facade.report.resp.member.MembershipBillingDetailsDTO;

/**
 * @author rebuy
 * @description：账单详情RPC
 */
public interface MemberBillDetailsRpcService {
    CommonResp<MembershipBillingDetailsDTO> getMemberBillDetails(MembershipBillingDetailsReqDTO reqDTO);
}
