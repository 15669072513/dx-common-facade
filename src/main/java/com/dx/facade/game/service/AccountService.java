package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.FixBalanceReq;

public interface AccountService {
    CommonResp<Boolean> fixBalance(FixBalanceReq fixBalanceReq);
}
