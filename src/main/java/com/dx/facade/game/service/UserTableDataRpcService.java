package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.resp.UserTableSumResp;

public interface UserTableDataRpcService {


  /**
   * 获取用户游戏类型的总盈亏
   * @param userId
   * @param gameType
   * @return
   */
  CommonResp<UserTableSumResp> getUserNetAmountSummary(Long userId, Integer gameType);

}
