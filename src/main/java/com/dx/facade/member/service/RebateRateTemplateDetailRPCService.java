package com.dx.facade.member.service;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.AddRebateRateTemplateDetailParamDTO;
import com.dx.facade.member.param.QueryRebateRateTemplateDetailParamDTO;
import com.dx.facade.member.param.UpdateRebateRateTemplateDetailParamDTO;
import com.dx.facade.member.resp.RebateRateTemplateDetailRespDTO;
/**
 * 返点比例模板RPC服务
 * 
 * @author bicycle
 *
 */
public interface RebateRateTemplateDetailRPCService {
	
    /**
     * 新增返点比例模板明细
     * 
     * @param request
     */
	CommonResp<Boolean> addRebateRateTemplateDetail(AddRebateRateTemplateDetailParamDTO request) throws BizException;
	
	/**
	 * 根据id查询返点比例模板明细
	 * 
	 * @param id
	 * @return
	 */
    CommonResp<RebateRateTemplateDetailRespDTO> getRebateRateTemplateDetailById(Long id);
    
	/**
	 * 根据条件查询返点比例模板明细
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<List<RebateRateTemplateDetailRespDTO>> getRebateRateTemplateDetail(QueryRebateRateTemplateDetailParamDTO request);
    
    /**
     * 更新返点比例模板明细
     * 
     * @param request
     */
    CommonResp<Boolean> updateRebateRateTemplateDetail(UpdateRebateRateTemplateDetailParamDTO request) throws BizException;
}
