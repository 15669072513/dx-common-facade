package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.account.param.LoanRepayParam;
import com.dx.facade.account.param.LoanRepayRecordParam;
import com.dx.facade.account.resp.LoanRepayRecordRespDTO;

import java.math.BigDecimal;

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


    /**
     * 校验借还款金额是否合法
     * @param loanRepayParam
     * @return
     */
    CommonResp<Boolean> checkAmount(LoanRepayParam loanRepayParam);

}
