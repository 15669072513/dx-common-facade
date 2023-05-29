package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.param.DepositDiscountParamDTO;
import com.dx.facade.account.resp.DepositDiscountRecordDTO;
import com.dx.facade.account.resp.DepositDiscountSumDTO;

import io.swagger.annotations.ApiModelProperty;

public interface DepositDiscountRPCService {

    /**
     * 会员存款优惠记录列表
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<DepositDiscountRecordDTO, DepositDiscountSumDTO>> getDepositDiscountList(PageReq<DepositDiscountParamDTO> pageReq);

    /**
     * 修改存款优惠领取状态-过期状态, 状态枚举是: ActivityEnums.ActivityInviteRecordStatus
     * @param merchantId
     * @param userId
     * @param businessId
     * @param status
     */
    @ApiModelProperty(value = "修改存款优惠领取状态-过期状态")
    void updateDepositDiscountStatus(Long merchantId, Long userId, String businessId, Integer status);
}
