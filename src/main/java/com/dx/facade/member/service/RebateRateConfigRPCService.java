package com.dx.facade.member.service;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.AddRebateRateConfigParamDTO;
import com.dx.facade.member.param.QueryRebateRateConfigParamDTO;
import com.dx.facade.member.param.UpdateRebateRateConfigParamDTO;
import com.dx.facade.member.resp.RebateRateConfigLimitRespDTO;
import com.dx.facade.member.resp.RebateRateConfigRespDTO;
/**
 * 返点比例配置RPC服务
 * 
 * @author bicycle
 *
 */
public interface RebateRateConfigRPCService {
	
    /**
     * 新增返点比例配置
     * 
     * @param request
     */
	CommonResp<Boolean> addRebateRateConfig(AddRebateRateConfigParamDTO request) throws BizException;
	
	/**
	 * 根据id查询返点比例配置
	 * 
	 * @param id
	 * @return
	 */
    CommonResp<RebateRateConfigRespDTO> getRebateRateConfigById(Long id);
    
	/**
	 * 根据条件查询返点比例配置
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<List<RebateRateConfigRespDTO>> getRebateRateConfig(QueryRebateRateConfigParamDTO request);
    
    /**
     * 更新返点比例配置
     * 
     * @param request
     */
    CommonResp<Boolean> updateRebateRateConfig(UpdateRebateRateConfigParamDTO request) throws BizException;
    
    /**
	 * 查询返点比例设置上限
	 * 
	 * @return
	 */
	CommonResp<RebateRateConfigLimitRespDTO> getRebateRateConfigLimit(Integer type ,Integer commissionMode);
	
}
