package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.DownScoreReq;
import com.dx.facade.game.req.UpScoreReq;
import com.dx.facade.texas.dto.WalletDto;
import com.dx.facade.texas.req.WalletRequest;

import java.math.BigDecimal;

public interface WalletRpcService {

  /**
   * 获取用户钱包信息
   * @param request
   * @return
   */
  CommonResp<WalletDto> getUserWallet(WalletRequest request);
  /**
   * 下分
   * @return
   */
  CommonResp<Void> downScore(DownScoreReq downScoreReq);
  /**
   * 上分
   * @return
   */
  CommonResp<Boolean> upScore(UpScoreReq upScoreReq);

  /**
   * 退还筹码
   * @return
   */
  CommonResp<Void> revertUpScore(String eventId,Long eventTime);
}
