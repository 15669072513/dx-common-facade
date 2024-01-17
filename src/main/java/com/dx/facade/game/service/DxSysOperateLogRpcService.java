package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.DxSysOperateLogListReq;
import com.dx.facade.game.resp.DxSysOperateLogResp;

public interface DxSysOperateLogRpcService {

    CommonResp<PageResp<DxSysOperateLogResp, ?>> getDxSysOperateLogList(DxSysOperateLogListReq req);

}
