package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.*;
import com.dx.facade.member.resp.MemberAuditDetailResp;
import com.dx.facade.member.resp.MemberAuditRecordResp;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 会员审核RPC服务
 * 
 * @author bicycle
 *
 */
public interface MemberAuditRPCService {
	/**
	 * 分页查询会员审核列表
	 * 
	 * @param pageParam
	 * @return
	 * @throws BizException
	 */
    @ApiModelProperty(value="分页查询会员审核列表")
    CommonResp<PageResp<MemberAuditRecordResp,?>> playerAuditList(MemberAuditRecordPageParam pageParam) throws BizException;

    /**
     * 会员审核详情
     * 
     * @param param
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value="会员审核详情")
    CommonResp<MemberAuditDetailResp> queryAuditDetail(MembeDetailsByIdParam param)  throws BizException;

    /**
     * 锁单、解锁
     * 
     * @param req
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value="锁单、解锁")
    CommonResp<Boolean> memberAuditLock(UpdMemberAuditLockOrderParmDTO req) throws BizException;

    /**
     * 审核
     * 
     * @param req
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value="审核")
    CommonResp<Boolean> audit(UpdMemberAuditParamDTO req) throws BizException;

    /**
     * 新增会员审核
     * 
     * @param param
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value="新增会员审核")
    CommonResp<String> addMemberAudit(MemberSaveReqDTO param) throws BizException;

    /**
     * 获取待处理数量
     * 
     * @param merchantIdLs
     * @return
     */
    @ApiModelProperty(value="待处理数量")
    Integer getPendingCount(List<Long> merchantIdLs);
}
