package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.texas.dto.DxGameConfigListDto;
import com.dx.facade.texas.req.DxGameConfigAddReq;
import com.dx.facade.texas.req.DxGameConfigEditReq;
import com.dx.facade.texas.req.DxGameConfigListReq;
import com.dx.facade.texas.resp.DxGameConfigListResp;

import java.util.List;

public interface IDxGameConfigService {
    CommonResp<PageResp<DxGameConfigListResp, Void>> listPage(DxGameConfigListReq dxGameConfigReq);

    CommonResp<DxGameConfigListDto> getAllGames();

    CommonResp<DxGameConfigListResp> getGameById(Long gameTypeId);

    CommonResp<Void> addGame(DxGameConfigAddReq req) throws BizException;

    CommonResp<Void> updateGame(DxGameConfigEditReq req) throws BizException;

    CommonResp<List<DxGameConfigListResp>> getGameListByVenueCode(String venueCode);

    CommonResp<Void> updateGameSwitch(DxGameConfigEditReq req) throws BizException;
}
