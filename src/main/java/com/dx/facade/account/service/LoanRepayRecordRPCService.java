package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.param.LoanRepayParam;
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


    /**
     * 会员/代理，借/还款接口
     * 调用需要校验借还款金额
     * @param param
     * @return
     */
    CommonResp<String> loanRepay(LoanRepayParam param);

}
