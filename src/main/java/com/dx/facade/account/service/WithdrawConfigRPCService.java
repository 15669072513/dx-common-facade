package com.dx.facade.account.service;

import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.req.*;
import com.dx.facade.account.resp.WithdrawConfigResp;

import java.util.List;

public interface WithdrawConfigRPCService {

    void syncWithdrawConfig(List<SyncWithdrawConfigReq> syncWithdrawConfigReqList);

    PageResp<WithdrawConfigResp, ?> queryWithdrawConfig(PageReq<QueryWithdrawConfigReq> pageReq);

    void updateWithdrawConfig(UpdateWithdrawConfigReq updateWithdrawConfigReq) throws BizException;

    void addWithdrawConfig(AddWithdrawConfigReq addWithdrawConfigReq) throws BizException;

    WithdrawConfigResp queryWithdrawConfig(QueryWithdrawConfigByRealReq queryWithdrawConfigByRealReq);

    WithdrawConfigResp queryWithdrawConfig(Long id);

    /**
     * 根据用户类型查询取款配置
     * @param userType，用户类型，0-会员，1-代理
     * @return
     */
    WithdrawConfigResp getByUserType(Long merchantId, Integer userType);


}
