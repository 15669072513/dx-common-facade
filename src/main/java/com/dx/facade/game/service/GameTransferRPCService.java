package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.dto.GameMemberDto;
import com.dx.facade.game.dto.GameTransferDto;
import com.dx.facade.game.dto.TransferSummaryCountDto;
import com.dx.facade.game.req.GetTransferReq;

import java.util.List;


public interface GameTransferRPCService {


    CommonResp<PageResp<GameTransferDto, TransferSummaryCountDto>> getTransfers(GetTransferReq getTransferReq);


}
