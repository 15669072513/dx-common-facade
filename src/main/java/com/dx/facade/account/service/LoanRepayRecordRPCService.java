package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.param.LoanRepayRecordParam;
import com.dx.facade.account.param.WalletDetailParamDTO;
import com.dx.facade.account.req.WalletBalanceDetailReq;
import com.dx.facade.account.resp.GameAmountTotalRespDTO;
import com.dx.facade.account.resp.LoanRepayRecordRespDTO;
import com.dx.facade.account.resp.WalletDetailRespDTO;
import com.dx.facade.account.resp.WalletDetailSumDTO;

import java.util.List;

public interface LoanRepayRecordRPCService {

    /**
     * 查询用户借还款记录
     * @param param
     * @return
     */
    CommonResp<PageResp<LoanRepayRecordRespDTO, String>> getLoanRepayRecordList(PageReq<LoanRepayRecordParam> param);

}
