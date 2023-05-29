package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.ActivityDepositParamDTO;
import com.dx.facade.account.param.CheckActivityParamDTO;
import com.dx.facade.account.param.UserVipActivityInfoParamDTO;
import com.dx.facade.account.resp.UserVipActivityInfoRespDTO;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

public interface ActivityApplyRPCService {

    @ApiModelProperty(value = "首存活动check")
    CommonResp<String> checkUserFirstDeposit(CheckActivityParamDTO checkActivityDTO) throws BizException;

    @ApiModelProperty(value = "vip晋级活动查询")
    CommonResp<UserVipActivityInfoRespDTO> getUserVipActivityInfo(@Validated @RequestBody UserVipActivityInfoParamDTO parm) throws BizException;

    @ApiModelProperty(value = "参与场馆活动")
    CommonResp activityDeposit(ActivityDepositParamDTO paramDTO) throws BizException;
}
