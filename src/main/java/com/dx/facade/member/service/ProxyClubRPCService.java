package com.dx.facade.member.service;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.AddProxyClubParamDTO;
import com.dx.facade.member.param.CheckClubNameParamDTO;
import com.dx.facade.member.param.CheckClubOwnerParamDTO;
import com.dx.facade.member.param.QueryProxyClubParamDTO;
import com.dx.facade.member.param.UpdateProxyClubParamDTO;
import com.dx.facade.member.resp.ProxyClubRespDTO;
/**
 * 代理俱乐部RPC服务
 * 
 * @author bicycle
 *
 */
public interface ProxyClubRPCService {
	
    /**
     * 新增代理俱乐部
     * 
     * @param request
     */
	CommonResp<Boolean> addProxyClub(AddProxyClubParamDTO request) throws BizException;
	
	/**
	 * 根据id查询代理俱乐部
	 * 
	 * @param clubId
	 * @return
	 */
    CommonResp<ProxyClubRespDTO> getProxyClubById(Long clubId);
    
	/**
	 * 根据userId查询代理俱乐部
	 * 
	 * @param userId
	 * @return
	 */
    CommonResp<ProxyClubRespDTO> getProxyClubByUserId(Long userId);
    
	/**
	 * 根据条件查询代理俱乐部
	 * 
	 * @param request
	 * @return
	 */
    CommonResp<List<ProxyClubRespDTO>> getProxyClub(QueryProxyClubParamDTO request);

    /**
     * 更新代理俱乐部
     * 
     * @param request
     */
    CommonResp<Boolean> updateProxyClub(UpdateProxyClubParamDTO request) throws BizException;
    
    /**
     * 解散俱乐部
     * @param proxyId
     * @param clubId
     */
    CommonResp<Boolean> dissolutionProxyClub(Long proxyId, Long clubId) throws BizException;

    /**
     * 俱乐部分页查询
     * 
     * @param pageReq
     * @return
     */
	PageResp<ProxyClubRespDTO, ?> selectProxyClubListPage(PageReq<QueryProxyClubParamDTO> pageReq);
	
	/**
	 * 验证俱乐部名称是否已存在
	 * 
	 * @param checkClubNameParamDTO
	 * @return
	 */
	CommonResp<Boolean> checkClubName(CheckClubNameParamDTO checkClubNameParamDTO);
	/**
	 * 验证代理是否已经创建过俱乐部
	 * 
	 * @param paramDTO
	 * @return
	 */
	CommonResp<Boolean> checkClubOwner(CheckClubOwnerParamDTO paramDTO);
    
    
}
