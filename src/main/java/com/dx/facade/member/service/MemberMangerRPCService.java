package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.dto.GameBalanceDto;
import com.dx.facade.game.resp.GameWithdrawAllResp;
import com.dx.facade.member.resp.MemberBaseParam;

import java.util.List;

public interface MemberMangerRPCService {
    CommonResp<GameWithdrawAllResp> oneKeyWithdraw(MemberBaseParam param);
    CommonResp<List<GameBalanceDto>> oneKeyBalance(MemberBaseParam param);
}
