package com.dx.facade.member.service;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.ClubAuditRecordPageParam;
import com.dx.facade.member.param.ClubDetailsByIdParam;
import com.dx.facade.member.param.ClubSaveReqDTO;
import com.dx.facade.member.param.UpdClubAuditLockOrderParmDTO;
import com.dx.facade.member.param.UpdClubAuditParamDTO;
import com.dx.facade.member.resp.ClubAuditDetailResp;
import com.dx.facade.member.resp.ClubAuditRecordResp;

import io.swagger.annotations.ApiModelProperty;

/**
 * 俱乐部审核RPC服务
 * 
 * @author bicycle
 *
 */
public interface ClubAuditRPCService {
	/**
	 * 分页查询俱乐部审核列表
	 * 
	 * @param pageParam
	 * @return
	 * @throws BizException
	 */
    @ApiModelProperty(value="分页查询俱乐部审核列表")
    CommonResp<PageResp<ClubAuditRecordResp,?>> clubAuditList(ClubAuditRecordPageParam pageParam) throws BizException;

    /**
     * 俱乐部审核详情
     * 
     * @param param
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value="俱乐部审核详情")
    CommonResp<ClubAuditDetailResp> queryAuditDetail(ClubDetailsByIdParam param)  throws BizException;

    /**
     * 锁单、解锁
     * 
     * @param req
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value="锁单、解锁")
    CommonResp<Boolean> clubAuditLock(UpdClubAuditLockOrderParmDTO req) throws BizException;

    /**
     * 审核
     * 
     * @param req
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value="审核")
    CommonResp<Boolean> audit(UpdClubAuditParamDTO req) throws BizException;

    /**
     * 新增俱乐部审核
     * 
     * @param param
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value="新增俱乐部审核")
    CommonResp<String> addClubAudit(ClubSaveReqDTO param) throws BizException;

    /**
     * 获取待处理数量
     * 
     * @param merchantIdLs
     * @return
     */
    @ApiModelProperty(value="待处理数量")
    Integer getPendingCount(List<Long> merchantIdLs);
}
