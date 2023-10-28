package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.*;
import com.dx.facade.member.resp.MemberAuditRecordResp;
import com.dx.facade.member.resp.UpdateUserAuditRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public interface UpdateUserAuditRPCService {

    /**
     * 保存修改会员数据审核表
     * @param paramDTO
     * @return
     */
    CommonResp saveUpdateUserAudit(SaveUpdateMemberAuditParamDTO paramDTO);

    /**
     * 审核列表查询
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<UpdateUserAuditRespDTO, ?>> listPage(PageReq<UpdMemberAuditListPageParamDTO> pageReq);

    /**
     * 锁单、解锁
     * @param req
     * @return
     */
    CommonResp<Boolean> updateMemberAuditLock(UpdMemberAuditLockOrderParmDTO req);

    /**
     * 审核
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<Boolean> audit(UpdMemberAuditParamDTO req) throws BizException;


    /**
     * 查询用户审核中的信息列表, 使用更全面的 selectUpdateUserAuditList
     */
    @ApiModelProperty(value="查询用户审核中的信息列表")
    @Deprecated
    List<UpdateUserAuditRespDTO> getAudittingList(GetUpdUserAuditingParamDTO paramDTO) throws BizException;


    /**
     * 审核详情
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<UpdateUserAuditRespDTO> auditDetail(UpdMemberAuditDetailParamDTO req) throws BizException;

    @ApiModelProperty(value="待处理数量")
    Integer getPendingCount(List<Long> merchantIdLs, Integer userType);

    @ApiModelProperty("查询代理重置支付密码未处理的数据")
    List<UpdateUserAuditRespDTO> selectUpdateUserAuditList(GetUpdUserAuditingParamDTO paramDTO);
}
