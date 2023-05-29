package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.TransferToGameParamDTO;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author grayson
 */
public interface GameTransferRPCService {

    @ApiModelProperty(value = "转入场馆")
    CommonResp transferToGame(TransferToGameParamDTO paramDTO) throws BizException;

}
