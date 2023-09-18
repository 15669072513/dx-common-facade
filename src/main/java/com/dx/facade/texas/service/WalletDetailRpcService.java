package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.resp.GameAmountTotalRespDTO;
import com.dx.facade.texas.dto.TableBringInfoDto;
import com.dx.facade.texas.dto.TableUserBringInfoDto;
import com.dx.facade.texas.dto.WalletDetailDto;
import com.dx.facade.texas.req.DxTableBringInfoReq;
import com.dx.facade.texas.req.TableBringInfoReq;
import com.dx.facade.texas.req.TableUserBringInfoReq;
import com.dx.facade.texas.req.WalletDetailPageRequest;

public interface WalletDetailRpcService {

  /**
   * 查询德州资金明细
   * @param request
   * @return
   */
  CommonResp<PageResp<WalletDetailDto,Void>> getWalletDetailPage(PageReq<WalletDetailPageRequest> request) throws
      BizException;

  /**
   * 获取牌桌带入信息
   * @param req
   * @return
   */
  CommonResp<TableBringInfoDto> getTableBringInfo(TableBringInfoReq req);

  /**
   * 获取牌桌用户带入信息
   * @param req
   * @return
   */
  CommonResp<TableUserBringInfoDto> getTableUserBringInfo(TableUserBringInfoReq req);

  /**
   * 获取牌桌带入带出信息
   * @return
   */
  CommonResp<GameAmountTotalRespDTO> getTableBringInfo(DxTableBringInfoReq req);
}
