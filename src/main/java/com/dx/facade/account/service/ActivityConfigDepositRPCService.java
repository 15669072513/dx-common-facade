package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.ActivityConfigDepositUpdateParamDTO;
import com.dx.facade.account.param.ActivityConfigDepositUpdateStatusParamDTO;
import com.dx.facade.account.param.QueryActivityConfigDepositReq;
import com.dx.facade.account.req.ActivityConfigDepositScaleParamDTO;
import com.dx.facade.account.resp.ActivityConfigDepositRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 存款优惠配置RPC
 * @author agan
 */
public interface ActivityConfigDepositRPCService {

    PageResp<ActivityConfigDepositRespDTO, ?> queryActivityConfigDeposit(PageReq<QueryActivityConfigDepositReq> pageReq);

    @ApiModelProperty(value = "列表查询：启用, 停用功能")
    CommonResp<Boolean> updateStatus(ActivityConfigDepositUpdateStatusParamDTO paramDTO);

    @ApiModelProperty(value = "编辑功能")
    CommonResp<Boolean> update(ActivityConfigDepositUpdateParamDTO paramDTO) throws BizException;

    @ApiModelProperty(value = "存款优惠配置的百分比和每日最高优惠查询")
    List<ActivityConfigDepositRespDTO> getActivityConfigDepositScale(ActivityConfigDepositScaleParamDTO param);
}
