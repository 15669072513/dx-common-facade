package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.report.gameprofit.GameNetAmountDetailReqDTO;
import com.dx.facade.report.param.report.gameprofit.GameNetAmountReqDTO;
import com.dx.facade.report.resp.GameNetAmountDetailRespDTO;
import com.dx.facade.report.resp.GameNetAmountRespDTO;
import com.dx.facade.report.resp.GameNetAmountSummaryRespDTO;

public interface GameNetAmountRPCService {

    /**
     * 游戏盈亏列表接口
     *
     * @param requestDto
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<GameNetAmountRespDTO, GameNetAmountSummaryRespDTO>> listPage(GameNetAmountReqDTO requestDto) throws BizException;

    /**
     * 游戏盈亏全部合计接口
     *
     * @param requestDto
     * @return
     * @throws BizException
     */
    CommonResp<GameNetAmountSummaryRespDTO> summary(GameNetAmountReqDTO requestDto) throws BizException;

    /**
     * 游戏盈亏详情接口
     *
     * @param requestDto
     * @return
     * @throws BizException
     */
    CommonResp<GameNetAmountDetailRespDTO> detailListPage(GameNetAmountDetailReqDTO requestDto) throws BizException;

}
