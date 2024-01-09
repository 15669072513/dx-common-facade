package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.req.AccountOptLogListReqDTO;
import com.dx.facade.account.req.AccountOptLogSaveReqDTO;
import com.dx.facade.account.resp.AccountOptLogListRespDTO;

/**
 * 资金操作记录RPC
 */
public interface AccountOptLogRPCService {
    /**
     * 分页查询
     * @param pageReq
     * @return
     */
    CommonResp<PageResp<AccountOptLogListRespDTO, ?>> list(PageReq<AccountOptLogListReqDTO> pageReq);

    /**
     * 日志保存
     * @param dto
     * @return
     */
    CommonResp<Void> save(AccountOptLogSaveReqDTO dto);
}
