package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.texas.dto.WalletDetailDto;
import com.dx.facade.texas.req.WalletDetailPageRequest;

public interface WalletDetailRpcService {

  /**
   * 查询德州资金明细
   * @param request
   * @return
   */
  CommonResp<PageResp<WalletDetailDto,Void>> getWalletDetailPage(PageReq<WalletDetailPageRequest> request) throws
      BizException;
}
