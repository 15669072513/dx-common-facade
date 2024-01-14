package com.dx.facade.member.service;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.AddRebateRateTemplateParamDTO;
import com.dx.facade.member.param.QueryRebateRateTemplateParamDTO;
import com.dx.facade.member.param.UpdateRebateRateTemplateParamDTO;
import com.dx.facade.member.resp.RebateRateTemplateRespDTO;
/**
 * 返点比例模板RPC服务
 * 
 * @author bicycle
 *
 */
public interface RebateRateTemplateRPCService {
	
    /**
     * 新增返点比例模板
     * 
     * @param request
     */
	CommonResp<Boolean> addRebateRateTemplate(AddRebateRateTemplateParamDTO request) throws BizException;
	
	/**
	 * 根据id查询返点比例模板
	 * 
	 * @param id
	 * @return
	 */
    CommonResp<RebateRateTemplateRespDTO> getRebateRateTemplateById(Long id);
    
	/**
	 * 根据条件查询返点比例模板
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<List<RebateRateTemplateRespDTO>> getRebateRateTemplate(QueryRebateRateTemplateParamDTO request);
    
    /**
     * 更新返点比例模板
     * 
     * @param request
     */
    CommonResp<Boolean> updateRebateRateTemplate(UpdateRebateRateTemplateParamDTO request) throws BizException;
}
