package com.dx.facade.member.service;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.AddRebateRateParamDTO;
import com.dx.facade.member.param.BaseRebateRateParamDTO;
import com.dx.facade.member.param.QueryEffectRebateRateParamDTO;
import com.dx.facade.member.param.QueryRebateRateParamDTO;
import com.dx.facade.member.param.UpdateRebateRateParamDTO;
import com.dx.facade.member.resp.BaseRebateRateRespDTO;
import com.dx.facade.member.resp.MemberRebateRateRespDTO;
import com.dx.facade.member.resp.RebateRateRespDTO;
/**
 * 返点比例RPC服务
 * 
 * @author bicycle
 *
 */
public interface RebateRateRPCService {
	
    /**
     * 新增返点比例
     * 
     * @param request
     */
	CommonResp<Boolean> addRebateRate(AddRebateRateParamDTO request) throws BizException;
	
    /**
     * 校验返点比例
     * 
     * @param request
     */
	CommonResp<Boolean> checkRebateRate(BaseRebateRateParamDTO request) throws BizException;
	
	/**
	 * 根据id查询返点比例
	 * 
	 * @param id
	 * @return
	 */
    CommonResp<RebateRateRespDTO> getRebateRateById(Long id);
    
	/**
	 * 根据条件查询返点比例
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<List<RebateRateRespDTO>> getReRebateRate(QueryRebateRateParamDTO request);
    
	/**
	 * 获取生效中的返点比例
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<RebateRateRespDTO> getEffectiveReRebateRate(QueryEffectRebateRateParamDTO request);

    /**
     * 更新返点比例
     * 
     * @param request
     */
    CommonResp<Boolean> updateRebateRate(UpdateRebateRateParamDTO request) throws BizException;

    /**
     * 返点比例分页查询
     * 
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<RebateRateRespDTO, ?>> selectRebateRateListPage(PageReq<QueryRebateRateParamDTO> pageReq);
    
	/**
	 * 查询下级最大的返点比例
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<RebateRateRespDTO> getSubMaxReRebateRate(QueryRebateRateParamDTO request);
    
    /**
     * 查询会员返点比例
     * 
     * @param pageReq
     * @return
     */
	CommonResp<PageResp<MemberRebateRateRespDTO, ?>> selectMemberRebateRateListPage(PageReq<QueryRebateRateParamDTO> pageReq);
	
	/**
	 * 查询返点比例设置上限
	 * 
	 * @return
	 */
	CommonResp<BaseRebateRateRespDTO> getRebateRateLimit();
}
