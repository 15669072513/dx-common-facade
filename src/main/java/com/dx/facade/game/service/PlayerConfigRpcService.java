package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.DxPlayerConfigReq;
import com.dx.facade.game.resp.DxPlayerConfigResp;

/**
 * <p>
 *  游戏个人配置远程服务调用
 * </p>
 *
 * @author streak
 * @since 2023-12-19
 */
public interface PlayerConfigRpcService {

  /**
   * 查询玩家配置信息
   * @param userId
   * @return
   */
  CommonResp<DxPlayerConfigResp> getDxPlayerConfig(Long userId);


  /**
   * 设置玩家配置信息
   * @param dxPlayerConfigReq
   * @return
   */
  CommonResp<DxPlayerConfigResp> setDxPlayerConfig(DxPlayerConfigReq dxPlayerConfigReq);

}
