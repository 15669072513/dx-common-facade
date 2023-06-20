package com.dx.facade.venue.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.venue.req.DxGameConfigAddReq;
import com.dx.facade.venue.req.DxGameConfigEditReq;
import com.dx.facade.venue.req.DxGameConfigListReq;
import com.dx.facade.venue.resp.DxGameConfigListResp;

import java.util.List;

public interface IDxGameConfigService {
    CommonResp<PageResp<DxGameConfigListResp, Void>> listPage(DxGameConfigListReq dxGameConfigReq);

    CommonResp<List<DxGameConfigListResp>> getAllGames();

    CommonResp<DxGameConfigListResp> getGameById(Long gameTypeId);

    CommonResp<Void> addGame(DxGameConfigAddReq req) throws BizException;

    CommonResp<Void> updateGame(DxGameConfigEditReq req) throws BizException;

    CommonResp<List<DxGameConfigListResp>> getGameListByVenueCode(String venueCode);

    CommonResp<Void> updateGameSwitch(DxGameConfigEditReq req) throws BizException;
}
