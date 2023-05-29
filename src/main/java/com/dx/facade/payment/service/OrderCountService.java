package com.dx.facade.payment.service;

import com.dx.entity.CommonResp;
import com.dx.facade.payment.dto.WithdrawOrderParam;
import com.dx.facade.payment.resp.WithdrawOrderDTO;

import io.swagger.annotations.ApiOperation;

public interface OrderCountService {

    /**
     * 今日取款次数与取款总金额查询
     * @param param 会员id
     * @return
     */
    @ApiOperation(value = "今日取款次数与取款总金额查询")
    CommonResp<WithdrawOrderDTO> selectWithdrawOrder(WithdrawOrderParam param);

}
