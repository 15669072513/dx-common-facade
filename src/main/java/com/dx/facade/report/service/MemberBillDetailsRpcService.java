package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.facade.report.req.MembershipBillingDetailsReqDTO;
import com.dx.facade.report.resp.member.MembershipBillingDetailsDTO;

/**
 * @author rebuy
 * @description：账单详情RPC
 */
public interface MemberBillDetailsRpcService {
    /**
     *  根据账单号查询当期账单
     * @param reqDTO
     * @return
     */
    CommonResp<MembershipBillingDetailsDTO> getMemberBillDetails(MembershipBillingDetailsReqDTO reqDTO);

    /**
     *  查询当期账单上一期
     * @param reqDTO
     * @return
     */
    CommonResp<MembershipBillingDetailsDTO> getLastMemberBillDetails(MembershipBillingDetailsReqDTO reqDTO);
}
