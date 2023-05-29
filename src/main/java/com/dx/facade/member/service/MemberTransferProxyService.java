package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.MemberTransferProxyRecordReq;
import com.dx.facade.member.param.ProxyTransferRecordLockOrderDTO;
import com.dx.facade.member.proxy.req.ProxySubNumUpdateRpcReqDTO;
import com.dx.facade.member.proxy.req.ProxyTransferPageDTO;
import com.dx.facade.member.resp.ProxyTransferDataRespDTO;
import com.dx.facade.member.resp.ProxyTransferRecordAuditDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 会员转代审核表
 */
public interface MemberTransferProxyService {

    @ApiModelProperty(value = "会员转代查询")
    CommonResp<PageResp<ProxyTransferDataRespDTO, ?>> getMemberTransferPage(PageReq<ProxyTransferPageDTO> dtoPageReq) throws BizException;

    /**
     * 会员转代锁单/解单
     * @param lockOrderDTO
     * @return
     */
    @ApiModelProperty(value = "会员转代锁单/解单")
    CommonResp updateMemberTransferLockOrder(ProxyTransferRecordLockOrderDTO lockOrderDTO) throws BizException;

    /**
     * 会员转代详情查询
     *
     * @param id 会员转代id
     * @return 会员转代详情
     * @throws BizException 业务异常
     */
    @ApiModelProperty(value = "会员转代详情查询")
    CommonResp<ProxyTransferDataRespDTO> getMemberTransferDetail(Long id) throws BizException;

    /**
     * 会员转代审核
     *
     * @param reqDto
     * @return 会员转代审核
     * @throws BizException 业务异常
     */
    @ApiModelProperty(value = "会员转代审核")
    CommonResp saveMemberTransferAudit(ProxyTransferRecordAuditDTO reqDto) throws BizException;

    /**
     * @param param 会员溢出（转代） 申请 数据同步
     * @param param
     * @param isTransfer
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "会员溢出（转代） 申请 数据同步")
    CommonResp<String> updateProxySubNum(ProxySubNumUpdateRpcReqDTO param, Boolean isTransfer) throws BizException;

    /**
     * 会员转代 插入数据
     * @param reqDto
     * @return
     * @throws BizException
     */
    CommonResp<String> saveMemberTransferApply(MemberTransferProxyRecordReq reqDto) throws BizException;

    /**
     * 查询会员转代 未处理的条数
     * @return
     */
    Integer selectmemberTransferProxyCount(List<Long> merchantIdLs);
}
