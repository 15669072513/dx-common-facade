package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.*;
import com.dx.facade.member.resp.MemberAuditDetailResp;
import com.dx.facade.member.resp.MemberAuditRecordResp;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;


public interface MemberAuditRPCService {

    @ApiModelProperty(value="分页查询会员审核列表")
    CommonResp<PageResp<MemberAuditRecordResp,?>> playerAuditList(MemberAuditRecordPageParam pageParam) throws BizException;

    @ApiModelProperty(value="会员审核详情")
    CommonResp<MemberAuditDetailResp> queryAuditDetail(MembeDetailsByIdParam param)  throws BizException;

    @ApiModelProperty(value="锁单、解锁")
    CommonResp<Boolean> memberAuditLock(UpdMemberAuditLockOrderParmDTO req) throws BizException;

    @ApiModelProperty(value="审核")
    CommonResp<Boolean> audit(UpdMemberAuditParamDTO req) throws BizException;

    CommonResp<String> addMemberAudit(MemberSaveReqDTO param) throws BizException;

    @ApiModelProperty(value="待处理数量")
    Integer getPendingCount(List<Long> merchantIdLs);
}
