package com.dx.facade.member.service;


import java.util.List;
import java.util.Map;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.member.param.OperationLogReqDTO;
import com.dx.facade.member.param.QueryOperationLogReqDTO;
import com.dx.facade.member.resp.OperationLogRespDTO;
/**
 * 操作日志RPC
 * 
 * @author Bicycle
 *
 */
public interface OperationLogRpcService {
	/**
	 * 新增操作日志
	 * 
	 * @param logReqDTO
	 * @return
	 */
    CommonResp<String> addLog(OperationLogReqDTO logReqDTO);

    /**
     * 操作日志分页查询
     * 
     * @param PageReq
     * @return
     */
    CommonResp<PageResp<OperationLogRespDTO,?>> getOperationLogs(PageReq<QueryOperationLogReqDTO> PageReq);

    /**
     * 获取操作日志类型
     * 
     * @return
     */
    CommonResp<List<Map<String,Object>>> listOperationLogClass();

}
