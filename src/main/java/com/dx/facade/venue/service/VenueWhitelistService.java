package com.dx.facade.venue.service;
import com.dx.facade.venue.req.VenueWhitelistReq;
import com.dx.facade.venue.resp.VenueWhitelistResp;

import java.util.List;

public interface VenueWhitelistService {

    void editWhitelist(VenueWhitelistReq req);

    /**
     * 查询场馆白名单配置列表
     * @return
     */
    List<VenueWhitelistResp> getVenueWhitelist();

}
