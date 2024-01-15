package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.texas.req.DxTableInfoListReq;
import com.dx.facade.texas.resp.DxTableSummaryResp;


/**
 * <p>
 * 牌桌统计RPC
 * </p>
 *
 * @author broadway
 * @since 2024-01-05
 */
public interface TableInfoSummaryRpcService {

  /**
   * 根据条件查询牌桌统计信息
   * @param req
   * @return
   */
  CommonResp<DxTableSummaryResp> getDxTableInfoSummary(DxTableInfoListReq req);

}
