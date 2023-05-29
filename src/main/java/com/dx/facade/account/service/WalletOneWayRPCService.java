package com.dx.facade.account.service;

import com.dx.facade.account.param.WalletParamDTO;

public interface WalletOneWayRPCService {

    /**
     * 初始化个人账户
     */
    void initWallet(WalletParamDTO param);
}
