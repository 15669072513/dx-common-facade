package com.dx.facade.member.proxy.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.LowerMemberListReqDto;
import com.dx.facade.member.param.ProxySubProxyListEsDto;
import com.dx.facade.member.param.ProxySubProxyListEsParam;
import com.dx.facade.member.proxy.req.*;
import com.dx.facade.member.proxy.resp.*;
import com.dx.facade.member.resp.CountMemberListRespDto;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author fitz
 * @version 1.0.0
 * @since 2022年10月06日 20:36:58
 */
public interface ProxyDetailsInfoRpcService {
	
	/**
	 * 根据代理id 或 （代理账号和商户ID） 获取代理信息
	 *
	 * @param reqDTO 代理信息 入参
	 * @return 代理信息
	 * @throws BizException 异常
	 */
	@ApiModelProperty(value = "根据代理id 或 （代理账号和商户ID） 获取代理信息")
	ProxyDetailRespDTO getProxyDetailByUserNameOrId(ProxyBaseInfoReqDTO reqDTO) throws BizException;
	
	/**
	 * 根据代理账号查询直属代理id集合
	 *
	 * @param reqDTO 代理信息
	 * @return 代理id集合
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty("根据代理账号查询直属代理id集合")
	List<Object> getDireProxyIdsByUserName(GetProxyPathByUserNameReqDTO reqDTO) throws BizException;
	
	/**
	 * 根据代理账号查询非直属代理id集合
	 *
	 * @param reqDTO 代理信息
	 * @return 代理id集合
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty("根据代理账号查询非直属代理id集合")
	List<Object> getUnDireProxyIdsByUserName(GetProxyPathByUserNameReqDTO reqDTO) throws BizException;
	
	/**
	 * 根据代理ID集合查询代理信息集合
	 *
	 * @param ids 代理信息
	 * @return 代理id集合
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty("根据代理ID集合查询代理信息集合")
	List<ProxyDetailRespDTO> getProxyInfoByIds(List<Long> ids) throws BizException;
	
	/**
	 * 根据代理账号查询当前商户线下代理信息
	 *
	 * @param reqDTO 代理信息
	 * @return 代理id集合
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty("根据代理账号查询当前商户线下代理信息")
	List<MerchantUnderProxyRespDTO> getMerchantUnderProxyByUsername(MerchantUnderProxyInfoReqDTO reqDTO) throws BizException;
	
	/**
	 * 获取代理线数据
	 *
	 * @param reqDTO 代理信息
	 * @return 代理id集合
	 * @throws BizException 业务异常
	 */
	List<ProxyLinkRespDTO> getProxyLink(ProxyIdAndMerchantIdReqDTO reqDTO) throws BizException;
	
	/**
	 * 更新代理契约信息
	 *
	 * @param reqDTO 代理契约信息
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty("更新代理契约信息")
	void updateProxyContractInfoById(UpdateProxyContractInfoReqDTO reqDTO) throws BizException;
	
	/**
	 * 获取代理的所有下级代理ID、下级会员账号集合
	 *
	 * @param proxyId 代理ID
	 * @return 下级代理id集合，下级代理的所有下级会员账号集合
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty("获取代理的所有下级代理ID、下级会员账号集合")
	UnderProxyAndMemberRespDTO getUnderProxyAndMemberList(Long proxyId) throws BizException;

	/**
	 * 代理pc-代理列表-直属下级分页查询
	 * 代理pc-下级代理-代理列表-直属下级
	 * @param pageReq
	 * @return
	 * @throws BizException
	 */
	PageResp<ProxySubProxyListEsDto, ProxySubProxyListEsDto> selectUnderProxyListEsPage(PageReq<ProxySubProxyListEsParam> pageReq) throws BizException;

	/**
	 * 代理pc-获取下级会员列表
	 *
	 * @param pageReq 下级会员列表 请求参数
	 * @return 下级会员列表
	 * @throws BizException 异常
	 */
	@ApiModelProperty(value = "代理pc-获取下级会员列表")
	CommonResp<PageResp<LowerMemberListRespDto,?>> getLowerMemberListEs(PageReq<LowerMemberListReqDto> pageReq) throws BizException;

	/**
	 * 代理WEB会员列表总计
	 * @param var1
	 * @return
	 * @throws BizException
	 */
	@ApiModelProperty("代理WEB会员列表总计")
	CountMemberListRespDto getMemberListTotal(LowerMemberListReqDto var1) throws BizException;
}
