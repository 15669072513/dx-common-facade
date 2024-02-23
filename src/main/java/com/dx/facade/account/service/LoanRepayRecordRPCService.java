package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.param.DepositWithDrawRecordParam;
import com.dx.facade.account.param.LoanRepayParam;
import com.dx.facade.account.param.LoanRepayRecordParam;
import com.dx.facade.account.param.ProxyDebtRepayParam;
import com.dx.facade.account.resp.DepositWithDrawRecordRespDTO;
import com.dx.facade.account.resp.LoanRepayRecordRespDTO;
import com.dx.facade.account.resp.ProxyDebtDoRepayRespDTO;

public interface LoanRepayRecordRPCService {

    /**
     * 查询用户借还款记录
     * @param param
     * @return
     */
    CommonResp<PageResp<LoanRepayRecordRespDTO, String>> getLoanRepayRecordList(PageReq<LoanRepayRecordParam> param);

    CommonResp<PageResp<LoanRepayRecordRespDTO, String>> proxyDebtDetailRecord(PageReq<LoanRepayRecordParam> param);

    /**
     * 存取款帐变记录(目前只支持代理)
     * @param param
     * @return
     */
    CommonResp<PageResp<DepositWithDrawRecordRespDTO, String>> getDepositWithDrawRecordList(PageReq<DepositWithDrawRecordParam> param);

    /**
     * 会员/代理，借/还款接口
     * 调用需要校验借还款金额
     * @param param
     * @return
     */
    CommonResp<String> loanRepay(LoanRepayParam param);


    /**
     * 校验借还款金额是否合法
     *
     * @param prefix
     * @param loanRepayParam
     * @return
     */
    CommonResp<String> checkAmount(String prefix, LoanRepayParam loanRepayParam);

    /**
     * @author Dealer
     * @description: 代理个人占成欠款个人还款业务
     * @date 2024/2/22
     * @copyright
     */
    CommonResp<ProxyDebtDoRepayRespDTO> proxyDebtSelfRepay(ProxyDebtRepayParam param);
}
