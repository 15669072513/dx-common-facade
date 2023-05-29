package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.param.ActivityDiscountParamDTO;
import com.dx.facade.account.resp.ActivityDiscountRecordDTO;
import com.dx.facade.account.resp.ActivityDiscountSumDTO;

public interface ActivityDiscountRPCService {

    /**
     * 会员活动记录列表
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<ActivityDiscountRecordDTO, ActivityDiscountSumDTO>> getActivityDiscountList(PageReq<ActivityDiscountParamDTO> pageReq);

    /**
     * 会员活动记录 过期需要修改状态
     * @param businessId
     * @param auditStatus
     * @return
     */
    Boolean updateDiscountAuditStatus(String businessId,Integer auditStatus);
}
