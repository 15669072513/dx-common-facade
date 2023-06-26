package com.dx.facade.account.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.req.ProxyTransferInnerRecordRpcPageReqDto;
import com.dx.facade.account.req.ProxyTransferReqDTO;
import com.dx.facade.account.resp.CountDto;
import com.dx.facade.account.resp.ProxyTransferInnerRecordRpcPageRespDTO;
import com.dx.facade.member.resp.ProxyInfoRespDTO;
import com.dx.facade.payment.dto.ProxyTransferInnerDto;
import com.dx.facade.payment.req.ProxyTransferInnerRecord;

import java.math.BigDecimal;


/**
 * 代理自身账号余额转账记录表 业务RPC接口
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/6/16
 */
public interface ProxyTransferInnerRecordRPCService {
	
	/**
	 * 代理自身账号余额转账记录 分页查询
	 *
	 * @param pageReq 代理自身账号余额转账记录请求参数
	 * @return 代理自身账号余额转账记录
	 * @throws Exception 异常
	 */
	//CommonResp<PageResp<ProxyTransferInnerRecordRpcPageRespDTO, CountDto>> getProxyTransferInnerRecordPage(PageReq<ProxyTransferInnerRecordRpcPageReqDto> pageReq) throws Exception;

	/**
	 * 代理当日转中心钱包总金额
	 * @param merchantId
	 * @param proxyId
	 * @return
	 */
	BigDecimal selectTodayTransferInnerAmount(Long merchantId, Long proxyId);

	/**
	 * 代理自身账号余额转账记录表
	 * @param proxyTransferInnerDto
	 * @param proxyPo
	 */
	void saveProxyTransferInnerOrders(ProxyTransferInnerDto proxyTransferInnerDto, ProxyInfoRespDTO proxyPo, ProxyTransferInnerRecord record);


	CommonResp<PageResp<ProxyTransferInnerRecordRpcPageRespDTO, CountDto>> getProxyTransferInnerRecordPage(PageReq<ProxyTransferInnerRecordRpcPageReqDto> params) throws Exception;

	void saveProxyTransferInnerOrdersByProxyTransfer(ProxyTransferReqDTO proxyTransferInnerDto, ProxyInfoRespDTO proxyPo, ProxyTransferInnerRecord record);
}
