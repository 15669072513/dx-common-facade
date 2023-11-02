package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.req.*;
import com.dx.facade.account.resp.AdjustAmountTotalRespDTO;
import com.dx.facade.account.resp.ArtificialAccountAddPageRespDTO;
import com.dx.facade.account.resp.ArtificialPatchAccountAddDetailRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * 人工加额记录表(会员/代理) RPC接口
 */
public interface ArtificialAccountAddRPCService {


    /**
     * 会员人工加额调用方法
     *
     * @param dto
     * @return
     * @throws BizException
     * @throws Exception
     */
    @ApiModelProperty("会员人工加额调用方法")
    CommonResp<Long> createArtificialAccountAdd(CreateArtificialAccountAddParmDTO dto) throws BizException;

    /**
     * 会员加额申请记录 分页查询
     *
     * @param pageReq 会员(代理)人工加额申请录 查询请求
     * @param isAuth  是否审核 【兼容审核页面】
     * @return 会员人工价额申请记录
     * @throws Exception 异常
     */
    @ApiModelProperty("会员(代理)加额申请记录 分页查询")
    CommonResp<PageResp<ArtificialAccountAddPageRespDTO, ?>> selectArtificialAccountAddApplyPage(PageReq<ArtificialAccountAddApplyPageParmDTO> pageReq, Boolean isAuth) throws BizException;


    @ApiModelProperty("会员人工加额 锁单-解单操作")
    CommonResp<Boolean> updateAuditLock(ArtificialAccountAddLockOrderParmDTO req) throws BizException;

    @ApiModelProperty("JAV会员人工加额 查询会员审核详情")
    CommonResp<ArtificialPatchAccountAddDetailRespDTO> getAccountAddAuditDetail(ArtificialAccountAddDetailParmDTO rpcReqDto) throws BizException;

    @ApiModelProperty("会员人工加额审核（通过、拒绝）")
    CommonResp<Integer> artificialAccountAddAudit(ArtificialAccountAddParmDTO rpcReqDto) throws BizException;

    @ApiModelProperty("会员人工加额记录 查询请求")
    CommonResp<PageResp<ArtificialAccountAddPageRespDTO, ?>> selectArtificialAccountAddRecordPage(PageReq<ArtificialAccountAddRecordPageParmDTO> pageReq, Boolean isFinish) throws BizException;

    CommonResp<PageResp<ArtificialAccountAddPageRespDTO, ?>> selectByPage(PageReq<ArtificialAccountAddRecordPageParmDTO> pageReq);

    @ApiModelProperty("会员人工加额记录总计")
    CommonResp<AdjustAmountTotalRespDTO> selectArtificialAccountAddTotal(ArtificialAccountAddRecordPageParmDTO req, Boolean isFinish) throws BizException;

    @ApiModelProperty(value = "待处理数量")
    Integer getPendingCount(List<Long> merchantIdLs, Integer userType);


    /**
     * 查询用户的最后一次成功后台存款信息
     * @param userId
     * @param userType
     * @return
     */
    CommonResp<ArtificialAccountAddPageRespDTO> getLastSuccessBackDepositInfo(Long userId, Integer userType);


}
