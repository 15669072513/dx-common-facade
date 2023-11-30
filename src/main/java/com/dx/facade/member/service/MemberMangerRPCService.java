package com.dx.facade.member.service;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.game.dto.GameBalanceDto;
import com.dx.facade.game.resp.GameWithdrawAllResp;
import com.dx.facade.member.param.MemberInfoRpcEditParam;
import com.dx.facade.member.resp.MemberBaseParam;

public interface MemberMangerRPCService {
    CommonResp<GameWithdrawAllResp> oneKeyWithdraw(MemberBaseParam param);
    CommonResp<List<GameBalanceDto>> oneKeyBalance(MemberBaseParam param);
    CommonResp memberInfoEdit(MemberInfoRpcEditParam  param) throws BizException;
}
