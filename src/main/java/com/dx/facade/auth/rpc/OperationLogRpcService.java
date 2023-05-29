package com.dx.facade.auth.rpc;


import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.auth.domain.OperationLogReqDTO;
import com.dx.facade.auth.domain.QueryOperationLogReqDTO;

import java.util.List;

public interface OperationLogRpcService {

    CommonResp<String> addLog(OperationLogReqDTO logReqDTO);

    CommonResp<PageResp> getOperationLogs(PageReq<QueryOperationLogReqDTO> PageReq);

    /**
     * b2b操作记录（该用户及用户的子孙用户）
     *
     * @param PageReq
     * @return
     */
    CommonResp<PageResp> getOperationLogsInNodeId(PageReq<QueryOperationLogReqDTO> PageReq);

    List<String> listOperationLogClass();

}
