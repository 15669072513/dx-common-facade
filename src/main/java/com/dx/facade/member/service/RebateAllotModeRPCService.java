package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.UpdateRebateAllotModeParamDTO;
import com.dx.facade.member.param.UpdateRebateRateTemplateLevelParamDTO;
import com.dx.facade.member.param.UpdateRebateTemplateParamDTO;
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
	
    /**
     * 代理返点比率模板等级更新
     * 
     * @param request
     */
	CommonResp<Boolean> updateProxyRebateRateTemplateLevel(UpdateRebateRateTemplateLevelParamDTO request) throws BizException;
	/**
	 * 会员返点比率模板等级更新
	 * 
	 * @param request
	 * @return
	 * @throws BizException
	 */
	CommonResp<Boolean> updateMemberRebateRateTemplateLevel(UpdateRebateRateTemplateLevelParamDTO request) throws BizException;
	
	/**
	 * 更新返点比率模板接口
	 * 
	 * @param request
	 * @return
	 * @throws BizException
	 */
	CommonResp<Boolean> updateRebateTemplate(UpdateRebateTemplateParamDTO request) throws BizException;
	
}
