package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.texas.dto.ChangeAfterAmountDto;
import com.dx.facade.texas.dto.WalletDto;
import com.dx.facade.texas.req.ChangeAfterAmountReq;
import com.dx.facade.texas.req.WalletRequest;

public interface WalletRpcService {

  /**
   * 获取用户钱包信息
   * @param request
   * @return
   */
  CommonResp<WalletDto> getUserWallet(WalletRequest request);

  /**
   * 获取用户牌桌最后一条账变记录的账变后的余额
   * @param req
   * @return
   */
  CommonResp<ChangeAfterAmountDto> getChangeAfterAmount(ChangeAfterAmountReq req);
}
