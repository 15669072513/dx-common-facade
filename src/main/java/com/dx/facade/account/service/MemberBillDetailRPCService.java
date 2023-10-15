package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.req.AdjustBillDetailReq;
import com.dx.facade.account.req.MemberBillDetailIncreaseReq;
import com.dx.facade.account.req.ResetBillDetailReq;
import com.dx.facade.account.resp.MemberBillDetailResp;
import com.dx.facade.member.resp.MemberBaseParam;

public interface MemberBillDetailRPCService {

    /**
     * 给会员增加需要完成的流水（存款，优惠，返水，返水增加，充值上分，信用借款，俱乐部返水增加调整，保险返水增加调整）
     * @param req
     * @return true，处理成功，false，处理失败
     */
    CommonResp<Boolean> increaseBillDetail (MemberBillDetailIncreaseReq req);

    /**
     * 人工调整会员所需流水
     * @return true:调整成功，false，调整失败
     */
    CommonResp<Boolean> adjustBillDetail(AdjustBillDetailReq req);

    /**
     * @description: 查询人工调整历史
     * @date 2023/10/15
     * @copyright
     */
    CommonResp<PageResp<MemberBillDetailResp, String>> adjustHistory(PageReq<MemberBaseParam> pageReq);

    /**
     * 会员取款限制类型由账单限制变更为流水限制时，进行流水归零重置
     * 注意：该方法在会员取款限制类型修改为流水限制后，进行调用，实现逻辑中只有会员为流水限制类型才会进行流水归零重置
     * @param req
     * @return true:成功，false:失败
     */
    CommonResp<Boolean> resetBillDetail(ResetBillDetailReq req);
}
