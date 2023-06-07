package com.dx.facade.venue.service;

import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.venue.po.DxGameConfigPO;
import com.dx.facade.venue.req.DxGameConfigAddReq;
import com.dx.facade.venue.req.DxGameConfigEditReq;
import com.dx.facade.venue.req.DxGameConfigListReq;
import com.dx.facade.venue.resp.DxGameConfigListResp;

import java.util.List;

public interface IDxGameConfigService {
    PageResp<DxGameConfigListResp, Void> listPage(DxGameConfigListReq dxGameConfigReq);

    List<DxGameConfigPO> getAllGames();

    DxGameConfigPO getGameById(Long gameTypeId);

    void addGame(DxGameConfigAddReq req) throws BizException;

    void updateGame(DxGameConfigEditReq req) throws BizException;

    List<DxGameConfigPO> getGameListByVenueCode(String venueCode);

    void updateGameSwitch(DxGameConfigEditReq req) throws BizException;
}
