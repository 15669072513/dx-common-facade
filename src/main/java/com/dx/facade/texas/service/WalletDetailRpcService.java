package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.resp.GameAmountTotalRespDTO;
import com.dx.facade.game.dto.*;
import com.dx.facade.texas.dto.TableBringInfoDto;
import com.dx.facade.texas.dto.TableUserBringInfoDto;
import com.dx.facade.texas.dto.TableUserBringListDto;
import com.dx.facade.texas.dto.WalletDetailDto;
import com.dx.facade.texas.req.DxTableBringInfoReq;
import com.dx.facade.texas.req.TableBringInfoReq;
import com.dx.facade.texas.req.TableUserBringInfoReq;
import com.dx.facade.texas.req.WalletDetailPageRequest;
import com.dx.facade.texas.resp.DxGameBillResp;

import java.util.List;
import java.util.Map;

public interface WalletDetailRpcService {

    /**
     * 查询德州资金明细
     *
     * @param request
     * @return
     */
    CommonResp<PageResp<WalletDetailDto, Void>> getWalletDetailPage(PageReq<WalletDetailPageRequest> request) throws
            BizException;

    /**
     * 获取牌桌带入信息
     *
     * @param req
     * @return
     */
    CommonResp<TableBringInfoDto> getTableBringInfo(TableBringInfoReq req);

    /**
     * 获取牌桌用户带入信息
     *
     * @param req
     * @return
     */
    CommonResp<TableUserBringInfoDto> getTableUserBringInfo(TableUserBringInfoReq req);

    /**
     * 获取牌桌用每个户带入信息
     *
     * @param req
     * @return
     */
    CommonResp<List<TableUserBringListDto>> getTableUserBringList(TableUserBringInfoReq req);

    /**
     * 获取牌桌带入带出信息
     *
     * @return
     */
    CommonResp<List<GameAmountTotalRespDTO>> getTablesBringInfo(DxTableBringInfoReq req);

    /**
     * 实时账单
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<List<DxGameBillResp>> getCurrentTableBill(TableBringInfoReq req) throws BizException;

    CommonResp<Map<Long, BringInDto>> getBringInByTableId(Long tableId);

    CommonResp<Map<Long, BringOutDto>> getBringOutByTableId(Long tableId);

    CommonResp<DxWalletDetailDto> getBringInByTableIdAndUserId(Long tableId, Long userId);

    CommonResp<DxWalletDetailBringOutDto> getBringOutByTableIdAndUserId(Long tableId, Long userId);

    CommonResp<DxWalletDetailBringInOutDto> getBringInOutByTableIdAndUserId(Long tableId, Long userId);

    CommonResp<DxWalletDetailFeeInfoDto> getFeeInfoByTableIdAndUserId(Long tableId, Long userId);

}
