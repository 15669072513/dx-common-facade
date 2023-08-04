package com.dx.facade.venue.service;


import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.venue.dto.ConfigGamePO;
import com.dx.facade.venue.dto.ConfigVenuePO;
import com.dx.facade.venue.req.*;
import com.dx.facade.venue.resp.VenueConnectResp;
import com.dx.facade.venue.resp.VenueListResp;
import com.dx.facade.venue.resp.VenueTypeCodeAndVenues;

import java.util.List;

/**
 * 场馆相关服务
 */
@Deprecated
public interface VenueConfigService {

    void setStatus(VenueStatusReq req);

    PageResp<VenueListResp, Void> listPage(VenueListReq req);

    void editVenue(VenueEditReq req);

    PageResp<VenueConnectResp, Void> listConnectPage(VenueConnectListReq req);

    void editVenueConnect(VenueConnectEditReq req) throws BizException;

    //上面的这些方法,都是为管理后台提供的

    /**
     * 给app端首页使用的: 获取8大场馆类型,及里面的场馆
     * 注: 电游类型的,只会返回一个空壳,里面没有任何场馆或游戏
     */
    List<VenueTypeCodeAndVenues> getAllVenue(Long merchantId);

    /**
     * 给app端首页使用的: 获取所有电游游戏的列表
     * 注1:电游场馆使用这个rpc,所有其它场馆使用上面的rpc
     * 注2:yannick给前端时别忘了将禁用的游戏(即status为0的)过滤掉
     */
    List<ConfigGamePO> getDyGameList();

    //上面的这些方法,都是为app端提供的,下面的方法是为rpc提供的

    /**
     * 根据场馆code,得到场馆对象
     */
    ConfigVenuePO getVenueByVenueCode(String venueCode);

    /**
     * 获取所有场馆
     */
    List<ConfigVenuePO> getVenues();

    /**
     * 根据场馆类型code,得到场馆列表
     */
    List<ConfigVenuePO> getVenueByVenueTypeCode(String venueTypeCode);

    /**
     * 根据场馆类型code,得到非禁用场馆列表
     * @param venueTypeCode
     * @return
     */
    List<ConfigVenuePO> getVenueByVenueTypeCodeAndStatus(String venueTypeCode);

}
