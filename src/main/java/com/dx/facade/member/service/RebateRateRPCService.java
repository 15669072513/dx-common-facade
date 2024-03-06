package com.dx.facade.member.service;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.AddRebateRateParamDTO;
import com.dx.facade.member.param.BaseRebateRateParamDTO;
import com.dx.facade.member.param.QueryEffectRebateRateParamDTO;
import com.dx.facade.member.param.QueryRebateRateLimitParamDTO;
import com.dx.facade.member.param.QueryRebateRateParamDTO;
import com.dx.facade.member.param.RebateRateTryCaclParamDTO;
import com.dx.facade.member.param.UpdateRebateRateParamDTO;
import com.dx.facade.member.resp.BaseRebateRateRespDTO;
import com.dx.facade.member.resp.MemberRebateRateListRespDTO;
import com.dx.facade.member.resp.MemberRebateRateRespDTO;
import com.dx.facade.member.resp.RebateRateListRespDTO;
import com.dx.facade.member.resp.RebateRateRespDTO;
import com.dx.facade.member.resp.RebateRateTryCaclRespDTO;
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
    CommonResp<List<RebateRateRespDTO>> getRebateRate(QueryRebateRateParamDTO request);
    
	/**
	 * 获取生效中的返点比例
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<List<RebateRateRespDTO>> getEffectiveRebateRate(QueryEffectRebateRateParamDTO request);

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
    CommonResp<PageResp<RebateRateListRespDTO, ?>> selectRebateRateListPage(PageReq<QueryRebateRateParamDTO> pageReq);
    
    /**
     * 会员返水比例分页查询
     * 
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<RebateRateRespDTO, ?>> selectMemberRebateRateListPage(PageReq<QueryRebateRateParamDTO> pageReq);
    
    /**
     * 会员返水比例分页查询
     * 
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<MemberRebateRateListRespDTO, ?>> selectMemberRebateRatePage(PageReq<QueryRebateRateParamDTO> pageReq);
    
	/**
	 * 查询下级最大的返点比例
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<BaseRebateRateRespDTO> getSubMaxRebateRate(QueryRebateRateParamDTO request);
    
    /**
     * 查询会员返点比例
     * 
     * @param pageReq
     * @return
     */
	CommonResp<PageResp<MemberRebateRateRespDTO, ?>> selectPersonRebateRateListPage(PageReq<QueryRebateRateParamDTO> pageReq);
	
	/**
	 * 查询返点比例设置上限
	 * 
	 * @return
	 */
	CommonResp<BaseRebateRateRespDTO> getRebateRateLimit(QueryRebateRateLimitParamDTO request);
	/**
	 * 返点比率平台调整试算
	 * 
	 * @param param
	 * @return
	 */
	CommonResp<List<RebateRateTryCaclRespDTO>> platformAdjustmentTryCacl(RebateRateTryCaclParamDTO param);
}
