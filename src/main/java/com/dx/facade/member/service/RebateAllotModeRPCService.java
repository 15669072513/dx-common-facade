package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.UpdateRebateAllotModeParamDTO;
/**
 * 返点分配模式RPC服务
 * 
 * @author bicycle
 *
 */
public interface RebateAllotModeRPCService {
	
    /**
     * 返点分配模式更新
     * 
     * @param request
     */
	CommonResp<Boolean> updateRebateAllotMode(UpdateRebateAllotModeParamDTO request) throws BizException;
	
}
