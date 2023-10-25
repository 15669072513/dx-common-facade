package com.dx.facade.member.service;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.AddCommissionRateParamDTO;
import com.dx.facade.member.param.BaseCommissionRateParamDTO;
import com.dx.facade.member.param.QueryCommissionRateParamDTO;
import com.dx.facade.member.param.QueryEffectCommissionRateParamDTO;
import com.dx.facade.member.param.UpdateCommissionRateParamDTO;
import com.dx.facade.member.resp.BaseCommissionRateRespDTO;
import com.dx.facade.member.resp.CommissionRateRespDTO;
import com.dx.facade.member.resp.QueryCommissionRateRespDTO;
/**
 * 返佣比例RPC服务
 * 
 * @author bicycle
 *
 */
public interface CommissionRateRPCService {
	
    /**
     * 新增返佣比例
     * 
     * @param request
     */
    CommonResp<Boolean> AddCommissionRate(AddCommissionRateParamDTO request) throws BizException;
	
    /**
     * 校验返佣比例
     * 
     * @param request
     */
	CommonResp<Boolean> checkCommissionRate(BaseCommissionRateParamDTO request) throws BizException;
	
	/**
	 * 根据id查询返佣比例
	 * 
	 * @param id
	 * @return
	 */
    CommonResp<CommissionRateRespDTO> getCommissionRateById(Long id);
    
	/**
	 * 根据条件查询返佣比例
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<List<CommissionRateRespDTO>> getReCommissionRate(QueryCommissionRateParamDTO request);
    
	/**
	 * 根据条件查询返佣比例
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<PageResp<CommissionRateRespDTO,?>> getReCommissionRate(PageReq<QueryCommissionRateParamDTO> pageReq);
    
	/**
	 * 获取生效中的返佣比例
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<List<CommissionRateRespDTO>> getEffectiveCommissionRate(QueryEffectCommissionRateParamDTO request);

    /**
     * 更新返佣比例
     * 
     * @param request
     */
    CommonResp<Boolean> updateCommissionRate(UpdateCommissionRateParamDTO request) throws BizException;

    /**
     * 返佣比例分页查询
     * 
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<QueryCommissionRateRespDTO, ?>> selectCommissionRateListPage(PageReq<QueryCommissionRateParamDTO> pageReq);
    
	/**
	 * 查询返佣比例设置上限
	 * 
	 * @return
	 */
	CommonResp<BaseCommissionRateRespDTO> getCommissionRateLimit();
}
