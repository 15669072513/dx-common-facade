package com.dx.facade.account.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.req.*;
import com.dx.facade.account.resp.*;

import java.util.List;

/**
 * 红利审核RPC
 * @author grayson
 */
public interface ActivityBonusRPCService {

    /**
     * 提交红利发放
     * @param param
     * @return
     * @throws BizException
     */
    CommonResp<?> submitBonus(SubmitActivityBonusAuditParam param, List<ActivityBonusReleaseEasyExcel> easyExcelList, Long merchantId) throws BizException;

    /**
     * 检查红利发放的批量导入excel
     * @param easyExcelList
     * @return
     * @throws BizException
     */
    CommonResp<CheckSubmitBonusRespDTO> checkSubmitBonusExcel(List<ActivityBonusReleaseEasyExcel> easyExcelList, Long merchantId) throws BizException;

    /**
     * 红利审核一审详情
     * @return
     * @throws Exception
     */
    CommonResp<ActivityBonusAuditDetailRespDTO> bonusAuditDetail(BonusAuditDetailParam param);
//
//
//    //grayson
//
    /**
     * 员红利发放申请记录 查询请求
     * @param pageReq
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ActivityBonusAuditApplyPageRespDTO,?>> selectActivityBonusAuditApplyPage(PageReq<ActivityBonusAuditApplyPageParamDTO> pageReq) throws BizException;

    /**
     * 员红利发放审核记录
     * @param pageReq
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ActivityBonusAuditRecordPageRespDTO,?>> selectActivityBonusAuditRecordPage(PageReq<ActivityBonusAuditRecordPageParamDTO> pageReq)throws BizException;
    /**
     * 锁单、解锁
     * @return
     * @throws BizException
     */
    Boolean updateLockStatus(UpdateLockStatusParamDTO paramDto) throws BizException;

    /**
     * 会员红利发放一审、二审审核（通过、拒绝）
     * @param paramDTO
     * @return BonusAuditRespDTO
     * @throws BizException
     */
    BonusAuditRespDTO bonusAudit(BonusAuditParamDTO paramDTO)throws BizException;


}
