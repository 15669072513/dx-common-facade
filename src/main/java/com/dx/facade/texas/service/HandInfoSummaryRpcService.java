package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.texas.req.DxHandInfoListReq;
import com.dx.facade.texas.resp.DxHandInfoSummaryResp;


/**
 * <p>
 * 手牌统计RPC
 * </p>
 *
 * @author streak
 * @since 2024-01-05
 */
public interface HandInfoSummaryRpcService {

  /**
   * 根据条件查询手牌统计信息
   * @param req
   * @return
   */
  CommonResp<DxHandInfoSummaryResp> getDxHandInfoSummary(DxHandInfoListReq req);

}
