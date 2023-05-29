package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.ActivityApplyRecordPageParamDTO;
import com.dx.facade.account.param.ApplyActivitySCRecordParamDTO;
import com.dx.facade.account.req.ActivityJoinParamDTO;
import com.dx.facade.account.resp.ActivityApplyRecordPageRespDTO;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author agan
 */
public interface ActivityApplyRecordRPCService {

    /**
     * 活动申请记录分页查询
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ActivityApplyRecordPageRespDTO,?>> getActivityApplyRecordPage(PageReq<ActivityApplyRecordPageParamDTO> pageReq) throws BizException;

    /**
     * 添加参与首存记录
     */
    @ApiModelProperty(value = "添加参与首存记录")
    void applyActivitySCRecord(ApplyActivitySCRecordParamDTO paramDTO) throws BizException;

    /**
     * 纯展示页活动申请
     * @param activityJoinRespDTO
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "纯展示页活动申请")
    CommonResp joinActivity(ActivityJoinParamDTO activityJoinRespDTO) throws BizException;
}
