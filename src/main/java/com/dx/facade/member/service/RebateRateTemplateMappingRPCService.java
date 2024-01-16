package com.dx.facade.member.service;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.AddRebateRateTemplateMappingParamDTO;
import com.dx.facade.member.param.QueryRebateRateTemplateMappingParamDTO;
import com.dx.facade.member.param.UpdateRebateRateTemplateMappingParamDTO;
import com.dx.facade.member.resp.RebateRateTemplateMappingRespDTO;
/**
 * 返点比例模板关联RPC服务
 * 
 * @author bicycle
 *
 */
public interface RebateRateTemplateMappingRPCService {
	
    /**
     * 新增返点比例模板关联
     * 
     * @param request
     */
	CommonResp<Boolean> addRebateRateTemplateMapping(AddRebateRateTemplateMappingParamDTO request) throws BizException;
	
	/**
	 * 根据id查询返点比例模板关联
	 * 
	 * @param id
	 * @return
	 */
    CommonResp<RebateRateTemplateMappingRespDTO> getRebateRateTemplateMappingById(Long id);
    
	/**
	 * 根据条件查询返点比例模板关联
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<List<RebateRateTemplateMappingRespDTO>> getRebateRateTemplateMapping(QueryRebateRateTemplateMappingParamDTO request);
    
    /**
     * 更新返点比例模板关联
     * 
     * @param request
     */
    CommonResp<Boolean> updateRebateRateTemplateMapping(UpdateRebateRateTemplateMappingParamDTO request) throws BizException;
}
